package com.accp.controller;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Department;
import com.accp.domain.Post;
import com.accp.domain.Staff;
import com.accp.service.PositionService1;
import com.accp.service.departmentService;

@RestController
public class PositionController1 {
	
	@Autowired
	PositionService1 ps;
	@Autowired
	departmentService deps;
	//按条件查询岗位
	@PostMapping("/positionSelect")
	@ResponseBody
	public List<Post> selectPosition(@RequestBody Post po) {
		System.out.println("查询postAll");
		return ps.selectPost(po);
	}
	
	@PostMapping("/postAllSelect")
	@ResponseBody
	public List<Post> selectPostAll() {
		System.out.println("查询postAll");
		
		
		return ps.selectPostAll();
	}
	
	
	//查询部门
	@GetMapping("/selectDep")
	public List<Department> selectDep() {
		return ps.queryDepTable();
	}
	//用来新增的部门信息
		@PostMapping("/selectDeplist")
		@ResponseBody
		public List<Department> selectDeplist(){
			return deps.selectAllDepartment();
		}
	//按条件查询员工信息
	@PostMapping("/selectStaff")
	@ResponseBody
	public List<Staff> selectStaffByNameByidByPhone(String str){
		return ps.selectStaffTable(str);
	}
	
	//新增一条岗位信息
	@PostMapping("/addPost")
	@ResponseBody
	public Integer addPosition(@RequestBody Post po) {
		if (ps.selectPostById(po)==0) {
			System.out.println("查询无此条记录。");
			return ps.addPost(po);
		}
		System.out.println("查询有此记录故此返回0。");
		return 0;
	}
	//修改一条岗位信息
	@PostMapping("/updatePost")
	@ResponseBody
	public Integer upadatePost(@RequestBody Post po) {
		if (ps.selectPostById(po)>0) {
			System.out.println("查询到存在该数据，进行修改操作。");
			return  ps.updatePost(po);
			
		}
		System.out.println("查无数据故返回0。");
		return 0;
	}
	//删除一条post数据
	@PostMapping("/deletePost")
	@ResponseBody
	public Integer deletePostById(@RequestBody Post po) {
		if (ps.selectPostById(po)>0) {
			System.out.println("查询到存在该数据，进行删除操作。");
			return ps.deletePost(po);
		}
		return 0;
		
	}
	@GetMapping("/exportExcel")
	public ResponseEntity<byte []> exportExcel(Post pos) {
		List<Post> list= ps.selectPost(pos);
		
		Workbook wb = new XSSFWorkbook();
		Sheet sheet = wb.createSheet("岗位数据");
		Row titrow = sheet.createRow(0);
		titrow.createCell(0).setCellValue("岗位编号");
		titrow.createCell(1).setCellValue("岗位名称");
		for (int i = 0; i < list.size(); i++) {
			Row row= sheet.createRow(i+1);	
			Cell cellId = row.createCell(0);
			Cell cellPostname = row.createCell(1);
			cellId.setCellValue(list.get(i).getId());
			cellPostname.setCellValue(list.get(i).getPostname()); 
		}
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		try {
			wb.write(baos);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		HttpHeaders headers =new HttpHeaders();
		try {
			headers.setContentDispositionFormData("attachment", new String("岗位数据.xlsx".getBytes("utf-8"),"iso-8859-1"));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
		return new ResponseEntity<byte[]>(baos.toByteArray(),headers,HttpStatus.OK);
	}
	//-->staff的增删改
	@PostMapping("/addStaff")
	@ResponseBody
	public Integer addStaff(@RequestBody Staff sta) {
		sta.setStaffno(addStaffNo());
		sta.setPassword("88888888");
		return ps.addStaff(sta);
	}
	@PostMapping("/delStaff")
	@ResponseBody
	public Integer delStaff(String staffno) {
		return ps.delStaff(staffno);
	}
	@PostMapping("/upStaff")
	@ResponseBody
	public Integer upStaff(@RequestBody Staff sta) {
		return ps.updateStaff(sta);
	}
	@PostMapping("/selectStaffByNo")
	@ResponseBody
	public Staff selectStaffByNo(String staffno) {
		return ps.selecStaffByNo(staffno);
	}
	
	public String addStaffNo() {
		String no = "DZW00";
		String input = ps.selecLastStaff().getStaffno();
		String regex = "\\d+(\\\\d+)?";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);
		Integer id =0;
		while (matcher.find()) {
			id=Integer.parseInt(matcher.group())+1;
		}
		boolean bo =true;
		while (bo) {
			
			if (ps.selectStaffById(no+id)>0) {
				id=id+1;
			}else {
				
				no=no+id;
				bo=false;
			}
		}
		System.out.println("生成staff编号："+no);
		return no;
	}
	//<--
	//重置密码
	@PostMapping("/newPassword")
	@ResponseBody
	public int newPassword(String no,String pwd1 ,String pwd2) {
		if (ps.selectStaffByNoAndPass(no, pwd1)>0) {
			Staff st = new Staff();
			st.setStaffno(no);
			st.setPassword(pwd2);
			return ps.updatePasswrod(st);
		}
		return 0;
	}
	//删除一条数据
	@PostMapping("/deleteStaffById")
	@ResponseBody
	public Integer deleteStaffById(String staffno) {
		System.out.println("staffno:"+staffno);
		if (ps.selectStaffById(staffno)>0) {
			return ps.delStaff(staffno);
		}
		return 0;
	}
	//按条件查询员工信息
		@PostMapping("/selectStaffByDepId")
		@ResponseBody
		public List<Staff> selectStaffByDepId(Integer depid){
			return ps.selectStaffByDepId(depid);
		}
}
