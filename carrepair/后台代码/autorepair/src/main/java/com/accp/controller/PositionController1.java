package com.accp.controller;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Date;
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
import org.springframework.web.multipart.MultipartFile;

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
		System.out.println("查询符合条件的staff，条件:"+str);
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
	
	@GetMapping("/exportExcel1")
	public ResponseEntity<byte[]> exportExcel(String str) {
		System.out.println("导出条件："+str);
		
		List<Staff> staff = ps.SelectStaffTableAll(str);
		Workbook wb = new XSSFWorkbook();
		Sheet sheet = wb.createSheet("员工信息");
		for (int i = 0; i < staff.size(); i++) {
			Row row = sheet.createRow(i+1);
			Cell cellstaffno = row.createCell(0);
			Cell cellname = row.createCell(1);
			Cell cellsex = row.createCell(2);
			Cell celldepartmentid = row.createCell(3);
			Cell cellaccount = row.createCell(4);
			Cell cellpassword = row.createCell(5);
			Cell cellpostid = row.createCell(6);
			Cell cellphysicalcondition = row.createCell(7);
			Cell cellheight = row.createCell(8);
			Cell cellnativeplace = row.createCell(9);
			Cell cellnation = row.createCell(10);
			Cell cellmaritalstatus = row.createCell(11);
			Cell celleducationbackground = row.createCell(12);
			Cell cellschool = row.createCell(13);
			Cell cellmajor = row.createCell(14);
			Cell cellprofessionalqualification = row.createCell(15);
			Cell cellproperty = row.createCell(16);
			Cell celldegree = row.createCell(17);
			Cell cellauthorizedstrength = row.createCell(18);
			Cell cellidcardno = row.createCell(19);
			Cell cellresidence = row.createCell(20);
			Cell cellpresentaddress = row.createCell(21);
			Cell cellcontactnumber = row.createCell(22);
			Cell cellphone = row.createCell(23);
			Cell cellemail = row.createCell(24);
			Cell celldepositbank = row.createCell(25);
			Cell cellbankaccount = row.createCell(26);
			Cell cellemergencycontact = row.createCell(27);
			Cell cellemergencyphone = row.createCell(28);
			Cell celldateonboard = row.createCell(29);
			Cell cellthetrialdue = row.createCell(30);
			Cell cellbirthdaydate = row.createCell(31);
			Cell cellcontractstart = row.createCell(32);
			Cell cellagreementends = row.createCell(33);
			Cell cellcardnumber = row.createCell(34);
			Cell cellinternalcardno = row.createCell(35);
			Cell cellreferrer = row.createCell(36);
			Cell cellwholeorderdiscountright = row.createCell(37);
			Cell celltimediscountright = row.createCell(38);
			Cell cellrighttodiscount = row.createCell(39);
			Cell cellrightofrelief = row.createCell(40);
			Cell celljobresume = row.createCell(41);
			Cell celleducationexperience = row.createCell(42);
			Cell cellmemberoffamily = row.createCell(43);
			Cell celldisciplinaryrecords = row.createCell(44);
			Cell cellemploymentadvice = row.createCell(45);
			Cell cellpicture = row.createCell(46);
			Cell cellroleid = row.createCell(47);
			Cell cellisdimission = row.createCell(48);
			Cell cellotherone = row.createCell(49);
			Cell cellothertwo = row.createCell(50);
			Cell cellotherthree = row.createCell(51);
			Cell cellotherfour = row.createCell(52);
			Cell cellotherfive = row.createCell(53);
			
			cellstaffno.setCellValue(staff.get(i).getStaffno());
			System.out.println("输出："+staff.get(i).getStaffno());
			cellname.setCellValue(staff.get(i).getName());
			cellsex.setCellValue(staff.get(i).getSex());
			celldepartmentid.setCellValue(staff.get(i).getDepartmentid());
			cellaccount.setCellValue(staff.get(i).getAccount());
			cellpassword.setCellValue(staff.get(i).getPassword());
			cellpostid.setCellValue(staff.get(i).getPostid());
			cellphysicalcondition.setCellValue(staff.get(i).getPhysicalcondition());
			System.out.println("导出身高："+staff.get(i).getHeight());
			cellheight.setCellValue(staff.get(i).getHeight());
			cellnativeplace.setCellValue(staff.get(i).getNativeplace());
			cellnation.setCellValue(staff.get(i).getNation());
			cellmaritalstatus.setCellValue(staff.get(i).getMaritalstatus());
			celleducationbackground.setCellValue(staff.get(i).getEducationbackground());
			cellschool.setCellValue(staff.get(i).getSchool());
			cellmajor.setCellValue(staff.get(i).getMajor());
			cellprofessionalqualification.setCellValue(staff.get(i).getProfessionalqualification());
			cellproperty.setCellValue(staff.get(i).getProperty());
			celldegree.setCellValue(staff.get(i).getDegree());
			cellauthorizedstrength.setCellValue(staff.get(i).getAuthorizedstrength());
			cellidcardno.setCellValue(staff.get(i).getIdcardno());
			cellresidence.setCellValue(staff.get(i).getResidence());
			cellpresentaddress.setCellValue(staff.get(i).getPresentaddress());
			cellcontactnumber.setCellValue(staff.get(i).getContactnumber());
			cellphone.setCellValue(staff.get(i).getPhone());
			cellemail.setCellValue(staff.get(i).getEmail());
			celldepositbank.setCellValue(staff.get(i).getDepositbank());
			cellbankaccount.setCellValue(staff.get(i).getBankaccount());
			cellemergencycontact.setCellValue(staff.get(i).getEmergencycontact());
			cellemergencyphone.setCellValue(staff.get(i).getEmergencyphone());
			celldateonboard.setCellValue(staff.get(i).getDateonboard());
			cellthetrialdue.setCellValue(staff.get(i).getThetrialdue());
			cellbirthdaydate.setCellValue(staff.get(i).getBirthdaydate());
			cellcontractstart.setCellValue(staff.get(i).getContractstart());
			cellagreementends.setCellValue(staff.get(i).getAgreementends());
			cellcardnumber.setCellValue(staff.get(i).getCardnumber());
			cellinternalcardno.setCellValue(staff.get(i).getInternalcardno());
			cellreferrer.setCellValue(staff.get(i).getReferrer());
			cellwholeorderdiscountright.setCellValue(staff.get(i).getWholeorderdiscountright());
			celltimediscountright.setCellValue(staff.get(i).getTimediscountright());
			cellrighttodiscount.setCellValue(staff.get(i).getRighttodiscount());
			cellrightofrelief.setCellValue(staff.get(i).getRightofrelief());
			celljobresume.setCellValue(staff.get(i).getJobresume());
			celleducationexperience.setCellValue(staff.get(i).getEducationexperience());
			cellmemberoffamily.setCellValue(staff.get(i).getMemberoffamily());
			celldisciplinaryrecords.setCellValue(staff.get(i).getDisciplinaryrecords());
			cellemploymentadvice.setCellValue(staff.get(i).getEmploymentadvice());
			
			cellpicture.setCellValue(staff.get(i).getPicture());
			//空指针异常位置
			System.out.println("输出错误项:"+staff.get(i).getRoleid());
			cellroleid.setCellValue(staff.get(i).getRoleid());
			
			cellisdimission.setCellValue(staff.get(i).getIsdimission());
			cellotherone.setCellValue(staff.get(i).getOtherone());
			cellothertwo.setCellValue(staff.get(i).getOthertwo());
			cellotherthree.setCellValue(staff.get(i).getOtherthree());
			cellotherfour.setCellValue(staff.get(i).getOtherfour());
			cellotherfive.setCellValue(staff.get(i).getOtherfive());
			
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
			headers.setContentDispositionFormData("attachment", new String("员工信息.sxls".getBytes("utf-8"),"iso-8859-1"));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
		
		return new ResponseEntity<byte[]>(baos.toByteArray(),headers,HttpStatus.OK);
	}
	@PostMapping("/importExcel")
	public String importExcel(MultipartFile file) {
		List< Staff> list = new ArrayList<Staff>();
 		try {
			Workbook book = new XSSFWorkbook(file.getInputStream());
			book.getNumberOfSheets();//获取当前excel中的sheet页个数
			Sheet sheet = book.getSheetAt(0);//根据表获取sheet页个数
			int rows = sheet.getPhysicalNumberOfRows();//得到当前sheet页中的个数
			for (int i = 1; i < rows; i++) {
				Row row = sheet.getRow(i);
				Cell cellstaffno = row.createCell(0);
				String staffno=cellstaffno.getStringCellValue();
				Cell cellname = row.createCell(1);
				String name=cellname.getStringCellValue();
				Cell cellsex = row.createCell(2);
				String sex=cellsex.getStringCellValue();
				Cell celldepartmentid = row.createCell(3);
				Integer departmentid = (int)celldepartmentid.getNumericCellValue();
				Cell cellaccount = row.createCell(4);
				String account=cellaccount.getStringCellValue();
				Cell cellpassword = row.createCell(5);
				String password = cellpassword.getStringCellValue();
				Cell cellpostid = row.createCell(6);
				Integer postid = (int)cellpostid.getNumericCellValue();
				Cell cellphysicalcondition = row.createCell(7);
				String physicalcondition = cellphysicalcondition.getStringCellValue();
				Cell cellheight = row.createCell(8);
				String height = cellheight.getStringCellValue();
				Cell cellnativeplace = row.createCell(9);
				String nativeplace = cellnativeplace.getStringCellValue();
				Cell cellnation = row.createCell(10);
				String nation = cellnation.getStringCellValue();
				Cell cellmaritalstatus = row.createCell(11);
				String maritalstatus = cellmaritalstatus.getStringCellValue();
				Cell celleducationbackground = row.createCell(12);
				String educationbackground = celleducationbackground.getStringCellValue();
				Cell cellschool = row.createCell(13);
				String school = cellschool.getStringCellValue();
				Cell cellmajor = row.createCell(14);
				String major = cellmajor.getStringCellValue();
				Cell cellprofessionalqualification = row.createCell(15);
				String professionalqualification = cellprofessionalqualification.getStringCellValue();
				Cell cellproperty = row.createCell(16);
				String property = cellproperty.getStringCellValue();
				Cell celldegree = row.createCell(17);
				String degree = celldegree.getStringCellValue();
				Cell cellauthorizedstrength = row.createCell(18);
				String authorizedstrength = cellauthorizedstrength.getStringCellValue();
				Cell cellidcardno = row.createCell(19);
				String idcardno = cellidcardno.getStringCellValue();
				Cell cellresidence = row.createCell(20);
				String residence = cellresidence.getStringCellValue();
				Cell cellpresentaddress = row.createCell(21);
				String presentaddress = cellpresentaddress.getStringCellValue();
				Cell cellcontactnumber = row.createCell(22);
				String contactnumber = cellcontactnumber.getStringCellValue();
				Cell cellphone = row.createCell(23);
				String phone = cellphone.getStringCellValue();
				Cell cellemail = row.createCell(24);
				String email = cellemail.getStringCellValue();
				Cell celldepositbank = row.createCell(25);
				String depositbank = celldepositbank.getStringCellValue();
				Cell cellbankaccount = row.createCell(26);
				String bankaccount = cellbankaccount.getStringCellValue();
				Cell cellemergencycontact = row.createCell(27);
				String emergencycontact = cellemergencycontact.getStringCellValue();
				Cell cellemergencyphone = row.createCell(28);
				String emergencyphone = cellemergencyphone.getStringCellValue();
				Cell celldateonboard = row.createCell(29);
				Date dateonboard = celldateonboard.getDateCellValue();
				Cell cellthetrialdue = row.createCell(30);
				Date thetrialdue = cellthetrialdue.getDateCellValue();
				Cell cellbirthdaydate = row.createCell(31);
				Date birthdaydate = cellbirthdaydate.getDateCellValue();
				Cell cellcontractstart = row.createCell(32);
				Date contractstart = cellcontractstart.getDateCellValue();
				Cell cellagreementends = row.createCell(33);
				Date agreementends = cellagreementends.getDateCellValue();
				Cell cellcardnumber = row.createCell(34);
				String cardnumber = cellcardnumber.getStringCellValue();
				Cell cellinternalcardno = row.createCell(35);
				String internalcardno = cellinternalcardno.getStringCellValue();
				Cell cellreferrer = row.createCell(36);
				String referrer = cellreferrer.getStringCellValue();
				Cell cellwholeorderdiscountright = row.createCell(37);
				String wholeorderdiscountright = cellwholeorderdiscountright.getStringCellValue();
				Cell celltimediscountright = row.createCell(38);
				String timediscountright = celltimediscountright.getStringCellValue();
				Cell cellrighttodiscount = row.createCell(39);
				String righttodiscount = cellrighttodiscount.getStringCellValue();
				Cell cellrightofrelief = row.createCell(40);
				String rightofrelief = cellrightofrelief.getStringCellValue();
				Cell celljobresume = row.createCell(41);
				String jobresume = celljobresume.getStringCellValue();
				Cell celleducationexperience = row.createCell(42);
				String educationexperience = celleducationexperience.getStringCellValue();
				Cell cellmemberoffamily = row.createCell(43);
				String memberoffamily = cellmemberoffamily.getStringCellValue();
				Cell celldisciplinaryrecords = row.createCell(44);
				String disciplinaryrecords = celldisciplinaryrecords.getStringCellValue();
				Cell cellemploymentadvice = row.createCell(45);
				String employmentadvice = cellemploymentadvice.getStringCellValue();
				Cell cellpicture = row.createCell(46);
				String picture = cellpicture.getStringCellValue();
				Cell cellroleid = row.createCell(47);
				Integer roleid = (int)cellroleid.getNumericCellValue();
				Cell cellisdimission = row.createCell(48);
				Integer isdimission= (int)cellisdimission.getNumericCellValue(); 
				Cell cellotherone = row.createCell(49);
				String otherone = cellotherone.getStringCellValue();
				Cell cellothertwo = row.createCell(50);
				String othertwo= cellothertwo.getStringCellValue();
				Cell cellotherthree = row.createCell(51);
				String otherthree = cellotherthree.getStringCellValue();
				Cell cellotherfour = row.createCell(52);
				String otherfour = cellotherfour.getStringCellValue();
				Cell cellotherfive = row.createCell(53);
				String otherfive = cellotherfive.getStringCellValue();
				Staff sta = new Staff(staffno, name, sex, departmentid, account, password, postid, physicalcondition, height, nativeplace, nation, maritalstatus, educationbackground, school, major, professionalqualification, property, degree, authorizedstrength, idcardno, residence, presentaddress, contactnumber, phone, email, depositbank, bankaccount, emergencycontact, emergencyphone, dateonboard, thetrialdue, birthdaydate, contractstart, agreementends, cardnumber, internalcardno, referrer, wholeorderdiscountright, timediscountright, righttodiscount, rightofrelief, jobresume, educationexperience, memberoffamily, disciplinaryrecords, employmentadvice, picture, roleid, isdimission, otherone, othertwo, otherthree, otherfour, otherfive);
				list.add(sta);
			}
			System.out.println("导出数据中...");
			list.stream().forEach(item->System.out.println(item.getStaffno()));
			for (Staff li : list) {
				if (ps.selectStaffById(li.getStaffno())>0) {
					ps.updateStaff(li);
				}else {
					ps.addStaff(li);
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
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
