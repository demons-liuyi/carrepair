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
import org.apache.poi.ss.usermodel.CellType;
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

import com.accp.domain.Cashier;
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

	// 按条件查询岗位
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

	// 查询部门
	@GetMapping("/selectDep")
	public List<Department> selectDep() {
		return ps.queryDepTable();
	}

	// 用来新增的部门信息
	@PostMapping("/selectDeplist")
	@ResponseBody
	public List<Department> selectDeplist() {
		return deps.selectAllDepartment();
	}

	// 按条件查询员工信息
	@PostMapping("/selectStaff")
	@ResponseBody
	public List<Staff> selectStaffByNameByidByPhone(String str) {
		System.out.println("查询符合条件的staff，条件:" + str);
		return ps.selectStaffTable(str);
	}

	// 新增一条岗位信息
	@PostMapping("/addPost")
	@ResponseBody
	public Integer addPosition(@RequestBody Post po) {
		if (ps.selectPostById(po) == 0) {
			System.out.println("查询无此条记录。");
			return ps.addPost(po);
		}
		System.out.println("查询有此记录故此返回0。");
		return 0;
	}

	// 修改一条岗位信息
	@PostMapping("/updatePost")
	@ResponseBody
	public Integer upadatePost(@RequestBody Post po) {
		if (ps.selectPostById(po) > 0) {
			System.out.println("查询到存在该数据，进行修改操作。");
			return ps.updatePost(po);

		}
		System.out.println("查无数据故返回0。");
		return 0;
	}

	// 删除一条post数据
	@PostMapping("/deletePost")
	@ResponseBody
	public Integer deletePostById(@RequestBody Post po) {
		if (ps.selectPostById(po) > 0) {
			System.out.println("查询到存在该数据，进行删除操作。");
			return ps.deletePost(po);
		}
		return 0;

	}

	@GetMapping("/exportExcel")
	public ResponseEntity<byte[]> exportExcel(Post pos) {
		List<Post> list = ps.selectPost(pos);

		Workbook wb = new XSSFWorkbook();
		Sheet sheet = wb.createSheet("岗位数据");
		Row titrow = sheet.createRow(0);
		titrow.createCell(0).setCellValue("岗位编号");
		titrow.createCell(1).setCellValue("岗位名称");
		for (int i = 0; i < list.size(); i++) {
			Row row = sheet.createRow(i + 1);
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
		HttpHeaders headers = new HttpHeaders();
		try {
			headers.setContentDispositionFormData("attachment",
					new String("岗位数据.xlsx".getBytes("utf-8"), "iso-8859-1"));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
		return new ResponseEntity<byte[]>(baos.toByteArray(), headers, HttpStatus.OK);
	}

	@GetMapping("/exportExcel1")
	public ResponseEntity<byte[]> exportExcel(String str) {
		
		List<Staff> staff = ps.SelectStaffTableAll(str);
		Workbook wb = new XSSFWorkbook();
		Sheet sheet = wb.createSheet("员工信息");
		Row titrow = sheet.createRow(0);
		titrow.createCell(0).setCellValue("员工编号");
		titrow.createCell(1).setCellValue("名字");
		titrow.createCell(2).setCellValue("员工性别");
		titrow.createCell(3).setCellValue("部门id");
		titrow.createCell(4).setCellValue("员工账户");
		titrow.createCell(5).setCellValue("密码");
		titrow.createCell(6).setCellValue("员工岗位id");
		titrow.createCell(7).setCellValue("身体状况");
		titrow.createCell(8).setCellValue("身高");
		titrow.createCell(9).setCellValue("籍贯");
		titrow.createCell(10).setCellValue("民族");
		titrow.createCell(11).setCellValue("婚姻状态");
		titrow.createCell(12).setCellValue("学历");
		titrow.createCell(13).setCellValue("毕业学校");
		titrow.createCell(14).setCellValue("专业");
		titrow.createCell(15).setCellValue("专业资格");
		titrow.createCell(16).setCellValue("属性");
		titrow.createCell(17).setCellValue("学位");
		titrow.createCell(18).setCellValue("编制");
		titrow.createCell(19).setCellValue("身份证号码");
		titrow.createCell(20).setCellValue("户口地址");
		titrow.createCell(21).setCellValue("现住地址");
		titrow.createCell(22).setCellValue("联系电话");
		titrow.createCell(23).setCellValue("手机");
		titrow.createCell(24).setCellValue("email");
		titrow.createCell(25).setCellValue("开户银行");
		titrow.createCell(26).setCellValue("银行账号");
		titrow.createCell(27).setCellValue("紧急联系人");
		titrow.createCell(28).setCellValue("紧急联系人联系电话");
		titrow.createCell(29).setCellValue("入职日期");
		titrow.createCell(30).setCellValue("试用到期");
		titrow.createCell(31).setCellValue("出生日期");
		titrow.createCell(32).setCellValue("合同开始");
		titrow.createCell(33).setCellValue("合同结束");
		titrow.createCell(34).setCellValue("卡自编号");
		titrow.createCell(35).setCellValue("卡内部号");
		titrow.createCell(36).setCellValue("推荐人");
		titrow.createCell(37).setCellValue("整单折扣权");
		titrow.createCell(38).setCellValue("工时折扣权");
		titrow.createCell(39).setCellValue("商品折扣权");
		titrow.createCell(40).setCellValue("减免权");
		titrow.createCell(41).setCellValue("工作简历");
		titrow.createCell(42).setCellValue("教育经历");
		titrow.createCell(43).setCellValue("家庭成员");
		titrow.createCell(44).setCellValue("奖惩记录");
		titrow.createCell(45).setCellValue("聘用意见");
		titrow.createCell(46).setCellValue("员工相片");
		titrow.createCell(47).setCellValue("外键角色表id");
		titrow.createCell(48).setCellValue("是否离职");
		titrow.createCell(49).setCellValue("备用1");
		titrow.createCell(50).setCellValue("备用2");
		titrow.createCell(51).setCellValue("备用3");
		titrow.createCell(52).setCellValue("备用4");
		titrow.createCell(53).setCellValue("备用5");
		for (int i = 0; i < staff.size(); i++) {
			Row row = sheet.createRow(i + 1);
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
			System.out.println("输出：" + staff.get(i).getStaffno());
			cellname.setCellValue(staff.get(i).getName());
			cellsex.setCellValue(staff.get(i).getSex());
			celldepartmentid.setCellValue(staff.get(i).getDepartmentid());
			cellaccount.setCellValue(staff.get(i).getAccount());
			cellpassword.setCellValue(staff.get(i).getPassword());
			cellpostid.setCellValue(staff.get(i).getPostid());
			cellphysicalcondition.setCellValue(staff.get(i).getPhysicalcondition());
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

			cellroleid.setCellValue((staff.get(i).getRoleid() == null ? 0 : staff.get(i).getRoleid()));
			cellisdimission.setCellValue((staff.get(i).getIsdimission() == null ? 0 : staff.get(i).getIsdimission()));

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
			headers.setContentDispositionFormData("attachment",
					new String("员工信息.xlsx".getBytes("utf-8"), "iso-8859-1"));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);

		return new ResponseEntity<byte[]>(baos.toByteArray(), headers, HttpStatus.OK);
	}

	@PostMapping("/importExcel")
	public String importExcel(MultipartFile file) {
		List<Staff> list = new ArrayList<Staff>();
		try {
			Workbook book = new XSSFWorkbook(file.getInputStream());
			book.getNumberOfSheets();// 获取当前excel中的sheet页个数
			Sheet sheet = book.getSheetAt(0);// 根据表获取sheet页个数
			int rows = sheet.getPhysicalNumberOfRows();// 得到当前sheet页中的个数
			for (int i = 1; i < rows; i++) {
				Row row = sheet.getRow(i);
				Cell cellstaffno = row.getCell(0);
				String staffno = cellstaffno.getStringCellValue();

				System.out.println(cellstaffno.getStringCellValue() + "<---编号----条数--->" + i);

				Cell cellname = row.getCell(1);
				String name = cellname.getStringCellValue() == null ? "" : cellname.getStringCellValue();
				Cell cellsex = row.getCell(2);
				String sex = cellsex.getStringCellValue() == null ? "" : cellsex.getStringCellValue();
				Cell celldepartmentid = row.getCell(3);
				Integer departmentid = (int) celldepartmentid.getNumericCellValue();
				Cell cellaccount = row.getCell(4);
				String account = cellaccount.getStringCellValue() == null ? "" : cellaccount.getStringCellValue();
				Cell cellpassword = row.getCell(5);
				String password = cellpassword.getStringCellValue() == null ? "" : cellpassword.getStringCellValue();
				Cell cellpostid = row.getCell(6);
				Integer postid = (int) cellpostid.getNumericCellValue();
				Cell cellphysicalcondition = row.getCell(7);
				String physicalcondition = cellphysicalcondition.getStringCellValue() == null ? ""
						: cellphysicalcondition.getStringCellValue();
				Cell cellheight = row.getCell(8);
				cellheight.setCellType(CellType.STRING);
				String height = cellheight.getStringCellValue() == null ? "" : cellheight.getStringCellValue();
				System.out.println("身高" + height);
				Cell cellnativeplace = row.getCell(9);
				String nativeplace = cellnativeplace.getStringCellValue();
				Cell cellnation = row.getCell(10);
				String nation = cellnation.getStringCellValue();
				Cell cellmaritalstatus = row.getCell(11);
				String maritalstatus = cellmaritalstatus.getStringCellValue();
				Cell celleducationbackground = row.getCell(12);
				String educationbackground = celleducationbackground.getStringCellValue();
				Cell cellschool = row.getCell(13);
				String school = cellschool.getStringCellValue();
				Cell cellmajor = row.getCell(14);
				String major = cellmajor.getStringCellValue();
				Cell cellprofessionalqualification = row.getCell(15);
				String professionalqualification = cellprofessionalqualification.getStringCellValue();
				Cell cellproperty = row.getCell(16);
				String property = cellproperty.getStringCellValue();
				Cell celldegree = row.getCell(17);
				String degree = celldegree.getStringCellValue();
				Cell cellauthorizedstrength = row.getCell(18);
				String authorizedstrength = cellauthorizedstrength.getStringCellValue();
				Cell cellidcardno = row.getCell(19);
				String idcardno = cellidcardno.getStringCellValue();
				Cell cellresidence = row.getCell(20);
				String residence = cellresidence.getStringCellValue();
				Cell cellpresentaddress = row.getCell(21);
				String presentaddress = cellpresentaddress.getStringCellValue();
				Cell cellcontactnumber = row.getCell(22);
				String contactnumber = cellcontactnumber.getStringCellValue();
				Cell cellphone = row.getCell(23);
				String phone = cellphone.getStringCellValue();
				Cell cellemail = row.getCell(24);
				String email = cellemail.getStringCellValue();
				Cell celldepositbank = row.getCell(25);
				String depositbank = celldepositbank.getStringCellValue();
				Cell cellbankaccount = row.getCell(26);
				String bankaccount = cellbankaccount.getStringCellValue();
				Cell cellemergencycontact = row.getCell(27);
				String emergencycontact = cellemergencycontact.getStringCellValue();
				Cell cellemergencyphone = row.getCell(28);
				String emergencyphone = cellemergencyphone.getStringCellValue();
				Cell celldateonboard = row.getCell(29);
				Date dateonboard = celldateonboard.getDateCellValue();
				Cell cellthetrialdue = row.getCell(30);
				Date thetrialdue = cellthetrialdue.getDateCellValue();
				Cell cellbirthdaydate = row.getCell(31);
				Date birthdaydate = cellbirthdaydate.getDateCellValue();
				Cell cellcontractstart = row.getCell(32);
				Date contractstart = cellcontractstart.getDateCellValue();
				Cell cellagreementends = row.getCell(33);
				Date agreementends = cellagreementends.getDateCellValue();
				Cell cellcardnumber = row.getCell(34);
				String cardnumber = cellcardnumber.getStringCellValue();
				Cell cellinternalcardno = row.getCell(35);
				String internalcardno = cellinternalcardno.getStringCellValue();
				Cell cellreferrer = row.getCell(36);
				String referrer = cellreferrer.getStringCellValue();
				Cell cellwholeorderdiscountright = row.getCell(37);
				String wholeorderdiscountright = cellwholeorderdiscountright.getStringCellValue();
				Cell celltimediscountright = row.getCell(38);
				String timediscountright = celltimediscountright.getStringCellValue();
				Cell cellrighttodiscount = row.getCell(39);
				String righttodiscount = cellrighttodiscount.getStringCellValue();
				Cell cellrightofrelief = row.getCell(40);
				String rightofrelief = cellrightofrelief.getStringCellValue();
				Cell celljobresume = row.getCell(41);
				String jobresume = celljobresume.getStringCellValue();
				Cell celleducationexperience = row.getCell(42);
				String educationexperience = celleducationexperience.getStringCellValue();
				Cell cellmemberoffamily = row.getCell(43);
				String memberoffamily = cellmemberoffamily.getStringCellValue();
				Cell celldisciplinaryrecords = row.getCell(44);
				String disciplinaryrecords = celldisciplinaryrecords.getStringCellValue();
				Cell cellemploymentadvice = row.getCell(45);
				String employmentadvice = cellemploymentadvice.getStringCellValue();
				Cell cellpicture = row.getCell(46);
				String picture = cellpicture.getStringCellValue();
				Cell cellroleid = row.getCell(47);
				Integer roleid = (int) cellroleid.getNumericCellValue();
				Cell cellisdimission = row.getCell(48);
				Integer isdimission = (int) cellisdimission.getNumericCellValue();
				Cell cellotherone = row.getCell(49);
				String otherone = cellotherone.getStringCellValue();
				Cell cellothertwo = row.getCell(50);
				String othertwo = cellothertwo.getStringCellValue();
				Cell cellotherthree = row.getCell(51);
				String otherthree = cellotherthree.getStringCellValue();
				Cell cellotherfour = row.getCell(52);
				String otherfour = cellotherfour.getStringCellValue();
				Cell cellotherfive = row.getCell(53);
				String otherfive = cellotherfive.getStringCellValue();
				Staff sta = new Staff(staffno, name, sex, departmentid, account, password, postid, physicalcondition,
						height, nativeplace, nation, maritalstatus, educationbackground, school, major,
						professionalqualification, property, degree, authorizedstrength, idcardno, residence,
						presentaddress, contactnumber, phone, email, depositbank, bankaccount, emergencycontact,
						emergencyphone, dateonboard, thetrialdue, birthdaydate, contractstart, agreementends,
						cardnumber, internalcardno, referrer, wholeorderdiscountright, timediscountright,
						righttodiscount, rightofrelief, jobresume, educationexperience, memberoffamily,
						disciplinaryrecords, employmentadvice, picture, roleid, isdimission, otherone, othertwo,
						otherthree, otherfour, otherfive);
				list.add(sta);
			}
			list.stream().forEach(item -> System.out.println(item.getStaffno()));
			for (Staff li : list) {
				if (ps.selectStaffById(li.getStaffno()) > 0) {
					int up = ps.updateStaff(li);
					System.out.println("修改完成：" + up + li.getName());
				} else {
					int add = ps.addStaff(li);
					System.out.println("*新增完成：" + add + li.getName());
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	// -->staff的增删改
	@PostMapping("/addStaff")
	@ResponseBody
	public Integer addStaff(@RequestBody Staff sta) {
		sta.setStaffno(addStaffNo());
		sta.setPassword("88888888");
		return ps.addStaff(sta);
	}
	//删除一条staff
	@PostMapping("/delStaff")
	@ResponseBody
	public Integer delStaff(String staffno) {
		return ps.delStaff(staffno);
	}
	//修改staff 
	@PostMapping("/upStaff")
	@ResponseBody
	public Integer upStaff(@RequestBody Staff sta) {
		return ps.updateStaff(sta);
	}
	//查询staff 条件是编号
	@PostMapping("/selectStaffByNo")
	@ResponseBody
	public Staff selectStaffByNo(String staffno) {
		return ps.selecStaffByNo(staffno);
	}
	//生成staff编号
	public String addStaffNo() {
		String no = "DZW00";
		String input = ps.selecLastStaff().getStaffno();
		String regex = "\\d+(\\\\d+)?";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);
		Integer id = 0;
		while (matcher.find()) {
			id = Integer.parseInt(matcher.group()) + 1;
		}
		boolean bo = true;
		while (bo) {

			if (ps.selectStaffById(no + id) > 0) {
				id = id + 1;
			} else {

				no = no + id;
				bo = false;
			}
		}
		System.out.println("生成staff编号：" + no);
		return no;
	}

	// <-- staff增删改代码
	// 重置密码
	@PostMapping("/newPassword")
	@ResponseBody
	public int newPassword(String no, String pwd1, String pwd2) {
		if (ps.selectStaffByNoAndPass(no, pwd1) > 0) {
			Staff st = new Staff();
			st.setStaffno(no);
			st.setPassword(pwd2);
			return ps.updatePasswrod(st);
		}
		return 0;
	}

	// 删除一条数据
	@PostMapping("/deleteStaffById")
	@ResponseBody
	public Integer deleteStaffById(String staffno) {
		System.out.println("staffno:" + staffno);
		if (ps.selectStaffById(staffno) > 0) {
			return ps.delStaff(staffno);
		}
		return 0;
	}

	// 按条件查询员工信息
	@PostMapping("/selectStaffByDepId")
	@ResponseBody
	public List<Staff> selectStaffByDepId(Integer depid) {
		return ps.selectStaffByDepId(depid);
	}

	// 新增结账
	@PostMapping("/addCashier")
	@ResponseBody
	public Integer addCashier(@RequestBody Cashier record) {
		return ps.addCashier(record);
	}
	//按照模态框内的条件查询staff
	@PostMapping("/selectStaffByMany")
	@ResponseBody
	public List<Staff> selectStaffByMany(@RequestBody Staff staff) {
		return ps.selectStaffByMany(staff);
	}
	

}
