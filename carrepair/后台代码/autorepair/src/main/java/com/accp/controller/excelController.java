package com.accp.controller;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Dimission;
import com.accp.domain.Staff;
import com.accp.service.dimissionService;
import com.accp.service.staffService;
 

@RestController
@RequestMapping("/excel")
public class excelController {

	
	@Autowired
	staffService ss;
	@Autowired
	dimissionService ds;
	
	@PostMapping("/dimissionExportExcel")
	public ResponseEntity<byte []> dimissionExportExcel(Staff staff) {
		List<Staff> alist=new ArrayList<Staff>();
		List<Dimission> list=ds.queryDimissionInfo();
		List<Dimission> lastlist=new ArrayList<Dimission>();
		if(staff.getCheck()==true) {
			alist=ss.selectStaffByStaffNoOrName(staff.getName());
		}else {
			alist=ss.selectStaffByCondition(staff);
		}	
		for(int i=0;i<alist.size();i++) {
			for(int j=0;j<list.size();j++) {
				if(alist.get(i).getStaffno().equals(list.get(j).getStaffid())) {
					lastlist.add(list.get(j));
				}
			}
		}
		Workbook wb = new XSSFWorkbook();
		CellStyle cellStyle = wb.createCellStyle();
		DataFormat format= wb.createDataFormat();
        cellStyle.setDataFormat(format.getFormat("yyyy年m月d日"));
		Sheet sheet = wb.createSheet("离职员工数据");
		Row titleRow = sheet.createRow(0);
		titleRow.createCell(0).setCellValue("部门");
		titleRow.createCell(1).setCellValue("员工编号");
		titleRow.createCell(2).setCellValue("姓名");
		titleRow.createCell(3).setCellValue("性别");
		titleRow.createCell(4).setCellValue("职位");
		titleRow.createCell(5).setCellValue("离职日期");
		titleRow.createCell(6).setCellValue("离职原因");
		for(int i=0;i<lastlist.size();i++) {
			Row row = sheet.createRow(i+1);
			Cell cellDepartmentName = row.createCell(0);
			Cell cellStaffNo = row.createCell(1);
			Cell cellStaffName = row.createCell(2);
			Cell cellSex = row.createCell(3);
			Cell cellPostName = row.createCell(4);
			Cell cellDimissionDate = row.createCell(5);
			Cell cellDimissionCause = row.createCell(6);
			cellDepartmentName.setCellValue(lastlist.get(i).getDepartmentname());
			cellStaffNo.setCellValue(lastlist.get(i).getStaffid());
			cellStaffName.setCellValue(lastlist.get(i).getName());
			cellSex.setCellValue(lastlist.get(i).getSex());
			cellPostName.setCellValue(lastlist.get(i).getPostname());
			cellDimissionDate.setCellStyle(cellStyle);
			cellDimissionDate.setCellValue(lastlist.get(i).getDimissiondate());
			cellDimissionCause.setCellValue(lastlist.get(i).getDimissioncause());
		}
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		try {
			wb.write(baos);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		HttpHeaders headers = new HttpHeaders();
		try {
			headers.setContentDispositionFormData("attachment", new String("离职员工数据.xlsx".getBytes("utf-8"),"iso-8859-1"));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
		System.out.println("成功！");
		return new ResponseEntity<byte[]>(baos.toByteArray(),headers,HttpStatus.OK);
	}
	
	@PostMapping("/staffExportExcel")
	public ResponseEntity<byte []> staffExportExcel(Staff staff) {
		List<Staff> alist=new ArrayList<Staff>();
		List<Staff> list=ss.selectStaffPhone();
		List<Staff> lastlist=new ArrayList<Staff>();
		if(staff.getCheck()==true) {
			alist=ss.selectStaffByStaffNoOrName(staff.getName());
		}else {
			alist=ss.selectStaffByCondition(staff);
		}	
		for(int i=0;i<alist.size();i++) {
			for(int j=0;j<list.size();j++) {
				if(alist.get(i).getStaffno().equals(list.get(j).getStaffno())) {
					lastlist.add(list.get(j));
				}
			}
		}
		Workbook wb = new XSSFWorkbook();
		CellStyle cellStyle = wb.createCellStyle();
		Sheet sheet = wb.createSheet("在职员工数据");
		Row titleRow = sheet.createRow(0);
		titleRow.createCell(0).setCellValue("部门");
		titleRow.createCell(1).setCellValue("员工编号");
		titleRow.createCell(2).setCellValue("姓名");
		titleRow.createCell(3).setCellValue("分机/短号");
		titleRow.createCell(4).setCellValue("直拨");
		titleRow.createCell(5).setCellValue("手机");
		titleRow.createCell(6).setCellValue("邮箱");
		for(int i=0;i<lastlist.size();i++) {
			Row row = sheet.createRow(i+1);
			Cell cellDepartmentName = row.createCell(0);
			Cell cellStaffNo = row.createCell(1);
			Cell cellStaffName = row.createCell(2);
			Cell cellEmergencyPhone = row.createCell(3);
			Cell cellContactNumber = row.createCell(4);
			Cell cellPhone = row.createCell(5);
			Cell cellEmail = row.createCell(6);
			cellDepartmentName.setCellValue(lastlist.get(i).getDepartmentname());
			cellStaffNo.setCellValue(lastlist.get(i).getStaffno());
			cellStaffName.setCellValue(lastlist.get(i).getName());
			cellEmergencyPhone.setCellValue(lastlist.get(i).getEmergencyphone());
			cellContactNumber.setCellValue(lastlist.get(i).getContactnumber());
			cellPhone.setCellValue(lastlist.get(i).getPhone());
			cellEmail.setCellValue(lastlist.get(i).getEmail());
		}
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		try {
			wb.write(baos);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		HttpHeaders headers = new HttpHeaders();
		try {
			headers.setContentDispositionFormData("attachment", new String("在职员工数据.xlsx".getBytes("utf-8"),"iso-8859-1"));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
		System.out.println("成功！");
		return new ResponseEntity<byte[]>(baos.toByteArray(),headers,HttpStatus.OK);
	}
	
}
