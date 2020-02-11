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

import com.accp.domain.Carinfo;
import com.accp.domain.Client;
import com.accp.domain.Coll;
import com.accp.domain.Dimission;
import com.accp.domain.Staff;
import com.accp.service.carInfoService;
import com.accp.service.clientService;
import com.accp.service.dimissionService;
import com.accp.service.staffService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

 

@RestController
@RequestMapping("/excel")
public class excelController {

	
	@Autowired
	staffService ss;
	@Autowired
	dimissionService ds;
	@Autowired
	carInfoService cis;
	@Autowired
	clientService cs;
	
	@PostMapping("/clientExportExcel")
	public ResponseEntity<byte []> clientExportExcel(String carinfo,String client){
		ObjectMapper mapper = new ObjectMapper();
		List<Client> alist=new ArrayList<Client>();	
		List<Client> list=cs.selectClientInfo();
		List<Client> lastlist=new ArrayList<Client>();
		Carinfo car=null;
		Client clt=null;
		checkObjectIsNullUtils checkUtils= new checkObjectIsNullUtils();
		try {
			 car = mapper.readValue(carinfo, Carinfo.class);
			 clt = mapper.readValue(client,Client.class);
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(clt.getCheck()==true) {
			alist=cs.queryClientInfoByCondition(clt.getName());
			lastlist=alist;
		}else {
			boolean flag1=checkUtils.objCheckIsNull(car);
			boolean flag2=checkUtils.objCheckIsNull(clt);
			System.out.println(flag1+"+"+flag2);
			if(flag1==true&&flag2==true) {
				lastlist=list;	
			}else if(flag1==true&&flag2==false) {
				List<Client> clientList=cs.selectClientByCondition(clt);
				for(int a=0;a<list.size();a++) {	 
					for(int b=0;b<clientList.size();b++) {
						if(list.get(a).getStaffno().equals(clientList.get(b).getStaffno())) {			
							alist.add(list.get(a));
							break;
						}				
					}			 
				}
				lastlist=alist;	
			}else if(flag1==false&&flag2==true) {
				List<Carinfo> carinfolist=cis.selectClientByCondition(car);
				for(int a=0;a<list.size();a++) {	 
					for(int b=0;b<carinfolist.size();b++) {
						if(list.get(a).getStaffno().equals(carinfolist.get(b).getClientid())) {				 							 			 
							alist.add(list.get(a));
							break;
						}				
					}			 
				}
				lastlist=alist;	
			}else if(flag1==false&&flag2==false) {
				List<Client> clientList=cs.selectClientByCondition(clt);
				for(int a=0;a<list.size();a++) {	 
					for(int b=0;b<clientList.size();b++) {
						if(list.get(a).getNumber().equals(clientList.get(b).getNumber())) {			
							alist.add(list.get(a));
							break;
						}				
					}			 
				}
				List<Carinfo> carinfolist=cis.selectClientByCondition(car);
				for(int a=0;a<alist.size();a++) {	 
					for(int b=0;b<carinfolist.size();b++) {
						if(alist.get(a).getNumber().equals(carinfolist.get(b).getClientid())) {	
							lastlist.add(alist.get(a));
							break;
						}				
					}			 
				}		 					
			}		
		}
		
		Workbook wb = new XSSFWorkbook();
		CellStyle cellStyle = wb.createCellStyle();
		DataFormat format= wb.createDataFormat();
        cellStyle.setDataFormat(format.getFormat("yyyy年m月d日"));
		Sheet sheet = wb.createSheet("车辆资料");
		Row titleRow = sheet.createRow(0);
		titleRow.createCell(0).setCellValue("客户编号");
		titleRow.createCell(1).setCellValue("客户名称");
		titleRow.createCell(2).setCellValue("详细地址");
		titleRow.createCell(3).setCellValue("联系人");
		titleRow.createCell(4).setCellValue("手机");
		titleRow.createCell(5).setCellValue("客户生日");
		titleRow.createCell(6).setCellValue("客户类别");
		titleRow.createCell(7).setCellValue("会员卡号");
		titleRow.createCell(8).setCellValue("入会日期");
		titleRow.createCell(9).setCellValue("会员到期");
		titleRow.createCell(10).setCellValue("备注");
		titleRow.createCell(11).setCellValue("建档日期");
		titleRow.createCell(12).setCellValue("服务顾问");
		titleRow.createCell(13).setCellValue("业务员电话");
		titleRow.createCell(14).setCellValue("账期(天)");
		titleRow.createCell(15).setCellValue("挂账额度");
		titleRow.createCell(16).setCellValue("累计积分");
		titleRow.createCell(17).setCellValue("定金金额");
		titleRow.createCell(18).setCellValue("客户省");
		titleRow.createCell(19).setCellValue("客户市");
		titleRow.createCell(20).setCellValue("客户区");
		titleRow.createCell(21).setCellValue("纳税人识别号");
		titleRow.createCell(22).setCellValue("注册电话");
		titleRow.createCell(23).setCellValue("开户银行");
		titleRow.createCell(24).setCellValue("银行账号");
		titleRow.createCell(25).setCellValue("注册地址");
		for(int i=0;i<lastlist.size();i++) {
			Row row = sheet.createRow(i+1);
			Cell cellStaffno = row.createCell(0);
			Cell cellName = row.createCell(1);
			Cell cellAddress = row.createCell(2);
			Cell cellLinkman = row.createCell(3);
			Cell cellPhone = row.createCell(4);
			Cell cellBornDate = row.createCell(5);
			Cell cellAffiliation = row.createCell(6);
			Cell cellDrivinglicence = row.createCell(7);
			Cell cellCarnumber1 = row.createCell(8);
			Cell cellEngineNumber = row.createCell(9);
			
			Cell cellRemark = row.createCell(10);
			Cell cellDate = row.createCell(11);
			Cell cellStaffname = row.createCell(12);
			
			Cell cellCounselorname = row.createCell(13);
			Cell cellPaymentdays = row.createCell(14);
			Cell cellPaymentsize = row.createCell(15);
			
			Cell cellIntegral = row.createCell(16);
			Cell cellJqinsurance = row.createCell(17);
			
			Cell cellSheng = row.createCell(18);
			Cell cellShi = row.createCell(19);
			Cell cellQv = row.createCell(20);		
			Cell cellTaxpayernumber = row.createCell(21);
			Cell cellRegisterphone = row.createCell(22);
			Cell cellBank = row.createCell(23);
			Cell cellBanknumber = row.createCell(24);
			Cell cellRegisteraddress = row.createCell(25);
			if(lastlist.get(i).getStaffno()!=null&&lastlist.get(i).getStaffno().length()>0) {
				cellStaffno.setCellValue(lastlist.get(i).getStaffno());
			}else {
				cellStaffno.setCellValue("");
			}
			
			if(lastlist.get(i).getName()!=null&&lastlist.get(i).getName().length()>0) {
				cellName.setCellValue(lastlist.get(i).getName());
			}else {
				cellName.setCellValue("");
			}
		
			if(lastlist.get(i).getAddress()!=null&&lastlist.get(i).getAddress().length()>0) {
				cellAddress.setCellValue(lastlist.get(i).getAddress());
			}else {
				cellAddress.setCellValue("");
			}
			
			if(lastlist.get(i).getLinkman()!=null&&lastlist.get(i).getLinkman().length()>0) {
				cellLinkman.setCellValue(lastlist.get(i).getLinkman());
			}else {
				cellLinkman.setCellValue("");
			}
			 
			if(lastlist.get(i).getPhone()!=null&&lastlist.get(i).getPhone().length()>0) {
				cellPhone.setCellValue(lastlist.get(i).getPhone());
			}else {
				cellPhone.setCellValue("");
			}
			 
			if(lastlist.get(i).getBorndate()!=null) {
				cellBornDate.setCellValue(lastlist.get(i).getBorndate());
			}else {
				cellBornDate.setCellValue("");
			}
					 
				cellAffiliation.setCellValue("");	
			 		 
				cellDrivinglicence.setCellValue("");
			 		 
				cellCarnumber1.setCellValue("");
			  	 
				cellEngineNumber.setCellValue("");
			 			
			if(lastlist.get(i).getRemark()!=null&&lastlist.get(i).getRemark().length()>0) {
				cellRemark.setCellValue(lastlist.get(i).getRemark());	
			}else {
				cellRemark.setCellValue("");	
			} 
			
			if(lastlist.get(i).getDate()!=null) {
				cellDate.setCellValue(lastlist.get(i).getDate());
			}else {
				cellDate.setCellValue("");	
			}
			
			if(lastlist.get(i).getStaffname()!=null&&lastlist.get(i).getStaffname().length()>0) {
				cellStaffname.setCellValue(lastlist.get(i).getStaffname());
			}else {
				cellStaffname.setCellValue("");	
			} 
			
			if(lastlist.get(i).getCounselorname()!=null&&lastlist.get(i).getCounselorname().length()>0) {
				cellCounselorname.setCellValue(lastlist.get(i).getCounselorname());
			}else {
				cellCounselorname.setCellValue("");
			} 
			 
			if(lastlist.get(i).getPaymentdays()!=null&&lastlist.get(i).getPaymentdays()>0) {
				cellPaymentdays.setCellValue(lastlist.get(i).getPaymentdays());		
			}else {
				cellPaymentdays.setCellValue("");		
			}  
			  
			if(lastlist.get(i).getPaymentsize()!=null&&lastlist.get(i).getPaymentsize()>0) {
				cellPaymentsize.setCellValue(lastlist.get(i).getPaymentsize());
			}else {
				cellPaymentsize.setCellValue("");		
			}
			
			if(lastlist.get(i).getIntegral()!=null&&lastlist.get(i).getIntegral()>0) {
				cellIntegral.setCellValue(lastlist.get(i).getIntegral());
			}else {
				cellIntegral.setCellValue("");
			}
			 
			 
				cellJqinsurance.setCellValue("");
			 
			
			if(lastlist.get(i).getSheng()!=null&&lastlist.get(i).getSheng().length()>0) {
				cellSheng.setCellValue(lastlist.get(i).getSheng());
			}else {
				cellSheng.setCellValue("");
			}
			 
			if(lastlist.get(i).getShi()!=null&&lastlist.get(i).getShi().length()>0) {
				cellShi.setCellValue(lastlist.get(i).getShi());
			}else {
				cellShi.setCellValue("");
			} 
			
			if(lastlist.get(i).getQv()!=null&&lastlist.get(i).getQv().length()>0) {
				cellQv.setCellValue(lastlist.get(i).getQv());	
			}else {
				cellQv.setCellValue("");	
			}
			 
			if(lastlist.get(i).getTaxpayernumber()!=null&&lastlist.get(i).getTaxpayernumber().length()>0) {
				cellTaxpayernumber.setCellValue(lastlist.get(i).getTaxpayernumber());
			}else {
				cellTaxpayernumber.setCellValue("");
			} 
			
			if(lastlist.get(i).getRegisterphone()!=null&&lastlist.get(i).getRegisterphone().length()>0) {
				cellRegisterphone.setCellValue(lastlist.get(i).getRegisterphone());
			}else {
				cellRegisterphone.setCellValue("");
			} 
			 
			
			if(lastlist.get(i).getBank()!=null&&lastlist.get(i).getBank().length()>0) {
				cellBank.setCellValue(lastlist.get(i).getBank());
			}else {
				cellBank.setCellValue("");
			}  
			 
			if(lastlist.get(i).getBanknumber()!=null&&lastlist.get(i).getBanknumber().length()>0) {
				cellBanknumber.setCellValue(lastlist.get(i).getBanknumber());	
			}else {
				cellBanknumber.setCellValue("");
			} 
			
			if(lastlist.get(i).getRegisteraddress()!=null&&lastlist.get(i).getRegisteraddress().length()>0) {
				cellRegisteraddress.setCellValue(lastlist.get(i).getRegisteraddress());	
			}else {
				cellRegisteraddress.setCellValue("");
			} 
			
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
			headers.setContentDispositionFormData("attachment", new String("客户资料.xlsx".getBytes("utf-8"),"iso-8859-1"));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
		System.out.println("成功！");
		return new ResponseEntity<byte[]>(baos.toByteArray(),headers,HttpStatus.OK);
	}
	
	
	
	
	@PostMapping("/carInfoExportExcel")
	public ResponseEntity<byte []> carInfoExportExcel(String carinfo,String client){
		ObjectMapper mapper = new ObjectMapper();
		List<Carinfo> alist=new ArrayList<Carinfo>();	
		List<Carinfo> list=cis.selectAllCarInfo();
		List<Carinfo> lastlist=new ArrayList<Carinfo>();
		Carinfo car=null;
		Client clt=null;
		checkObjectIsNullUtils checkUtils= new checkObjectIsNullUtils();
		try {
			 car = mapper.readValue(carinfo, Carinfo.class);
			 clt = mapper.readValue(client,Client.class);
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(car.getCheck()==true) {
			alist= cis.queryCarInformationByCondition(car.getCarer());
			lastlist=alist;
		}else {
			boolean flag1=checkUtils.objCheckIsNull(car);
			boolean flag2=checkUtils.objCheckIsNull(clt);
			System.out.println(flag1+"+"+flag2);
			if(flag1==true&&flag2==true) {
				lastlist=list;	
			}else if(flag1==true&&flag2==false) {
				List<Client> clientList=cs.selectClientByCondition(clt);
				for(int a=0;a<list.size();a++) {	 
					for(int b=0;b<clientList.size();b++) {
						if(list.get(a).getClientid().equals(clientList.get(b).getNumber())) {			
							alist.add(list.get(a));
							break;
						}				
					}			 
				}
				lastlist=alist;	
			}else if(flag1==false&&flag2==true) {
				List<Carinfo> carinfolist=cis.selectClientByCondition(car);
				for(int a=0;a<list.size();a++) {	 
					for(int b=0;b<carinfolist.size();b++) {
						if(list.get(a).getId().equals(carinfolist.get(b).getId())) {				 							 			 
							alist.add(list.get(a));
							break;
						}				
					}			 
				}
				lastlist=alist;	
			}else if(flag1==false&&flag2==false) {
				List<Client> clientList=cs.selectClientByCondition(clt);
				for(int a=0;a<list.size();a++) {	 
					for(int b=0;b<clientList.size();b++) {
						if(list.get(a).getClientid().equals(clientList.get(b).getNumber())) {			
							alist.add(list.get(a));
							break;
						}				
					}			 
				}
				List<Carinfo> carinfolist=cis.selectClientByCondition(car);
				for(int a=0;a<alist.size();a++) {	 
					for(int b=0;b<carinfolist.size();b++) {
						if(alist.get(a).getId().equals(carinfolist.get(b).getId())) {	
							lastlist.add(alist.get(a));
							break;
						}				
					}			 
				}		 					
			}		
		}		
		Workbook wb = new XSSFWorkbook();
		CellStyle cellStyle = wb.createCellStyle();
		DataFormat format= wb.createDataFormat();
        cellStyle.setDataFormat(format.getFormat("yyyy年m月d日"));
		Sheet sheet = wb.createSheet("车辆资料");
		Row titleRow = sheet.createRow(0);
		titleRow.createCell(0).setCellValue("车牌号码");
		titleRow.createCell(1).setCellValue("车辆品牌");
		titleRow.createCell(2).setCellValue("车辆型号");
		titleRow.createCell(3).setCellValue("驾驶员");
		titleRow.createCell(4).setCellValue("驾驶员电话");
		titleRow.createCell(5).setCellValue("出生日期");
		titleRow.createCell(6).setCellValue("车辆归属");
		titleRow.createCell(7).setCellValue("驾证到期");
		titleRow.createCell(8).setCellValue("车架号");
		titleRow.createCell(9).setCellValue("发动机号");
		titleRow.createCell(10).setCellValue("发动机品牌");
		titleRow.createCell(11).setCellValue("车辆年款");
		titleRow.createCell(12).setCellValue("里程");
		titleRow.createCell(13).setCellValue("载重");
		titleRow.createCell(14).setCellValue("购买日期");
		titleRow.createCell(15).setCellValue("商品日期");
		titleRow.createCell(16).setCellValue("车检到期");
		titleRow.createCell(17).setCellValue("交强险保险公司");
		titleRow.createCell(18).setCellValue("交强险到期");
		titleRow.createCell(19).setCellValue("商业险保险公司");
		titleRow.createCell(20).setCellValue("商业险到期");
		titleRow.createCell(21).setCellValue("在我投保车");
		titleRow.createCell(22).setCellValue("燃油类别");
		titleRow.createCell(23).setCellValue("下次保养里程");
		titleRow.createCell(24).setCellValue("下次保养日期");
		for(int i=0;i<lastlist.size();i++) {
			Row row = sheet.createRow(i+1);
			Cell cellCarNumber = row.createCell(0);
			Cell cellCarBrandName = row.createCell(1);
			Cell cellCarTypeName = row.createCell(2);
			Cell cellCarer = row.createCell(3);
			Cell cellCarerPhone = row.createCell(4);
			Cell cellBornDate = row.createCell(5);
			Cell cellAffiliation = row.createCell(6);
			Cell cellDrivinglicence = row.createCell(7);
			Cell cellCarnumber1 = row.createCell(8);
			Cell cellEngineNumber = row.createCell(9);
			Cell cellEnginebrandname = row.createCell(10);
			Cell cellYearPrice = row.createCell(11);
			Cell cellMileage = row.createCell(12);
			Cell cellDeadWeight = row.createCell(13);
			Cell cellBuyDate = row.createCell(14);
			Cell cellDutyDate = row.createCell(15);
			Cell cellCarcheckDate = row.createCell(16);
			Cell cellJqinsurance = row.createCell(17);
			Cell cellJqinsuranceDate = row.createCell(18);
			Cell cellSyinsurance = row.createCell(19);
			Cell cellSyinsuranceDate = row.createCell(20);		
			Cell cellInsuredCar = row.createCell(21);
			Cell cellFueloilType = row.createCell(22);
			Cell cellMaintain = row.createCell(23);
			Cell cellMaintainDate = row.createCell(24);
			if(lastlist.get(i).getCarnumber()!=null&&lastlist.get(i).getCarnumber().length()>0) {
				cellCarNumber.setCellValue(lastlist.get(i).getCarnumber());
			}else {
				cellCarNumber.setCellValue("");
			}
			
			if(lastlist.get(i).getCarbrandname()!=null&&lastlist.get(i).getCarbrandname().length()>0) {
				cellCarBrandName.setCellValue(lastlist.get(i).getCarbrandname());
			}else {
				cellCarBrandName.setCellValue("");
			}
		
			if(lastlist.get(i).getCartypename()!=null&&lastlist.get(i).getCartypename().length()>0) {
				cellCarTypeName.setCellValue(lastlist.get(i).getCartypename());
			}else {
				cellCarTypeName.setCellValue("");
			}
			
			if(lastlist.get(i).getCarer()!=null&&lastlist.get(i).getCarer().length()>0) {
				cellCarer.setCellValue(lastlist.get(i).getCarer());
			}else {
				cellCarer.setCellValue("");
			}
			 
			if(lastlist.get(i).getCarerphone()!=null&&lastlist.get(i).getCarerphone().length()>0) {
				cellCarerPhone.setCellValue(lastlist.get(i).getCarerphone());
			}else {
				cellCarerPhone.setCellValue("");
			}
			 
			if(lastlist.get(i).getBorndate()!=null) {
				cellBornDate.setCellValue(lastlist.get(i).getBorndate());
			}else {
				cellBornDate.setCellValue("");
			}
			
			if(lastlist.get(i).getAffiliation()!=null&&lastlist.get(i).getAffiliation().length()>0) {
				cellAffiliation.setCellValue(lastlist.get(i).getAffiliation());	
			}else {
				cellAffiliation.setCellValue("");	
			}
			
			if(lastlist.get(i).getDrivinglicence()!=null) {
				cellDrivinglicence.setCellValue(lastlist.get(i).getDrivinglicence());
			}else {
				cellDrivinglicence.setCellValue("");
			} 
			
			if(lastlist.get(i).getCarnumber1()!=null&&lastlist.get(i).getCarnumber1().length()>0) {
				cellCarnumber1.setCellValue(lastlist.get(i).getCarnumber1());
			}else {
				cellCarnumber1.setCellValue("");
			}  
			
			if(lastlist.get(i).getEnginenumber()!=null&&lastlist.get(i).getEnginenumber().length()>0) {
				cellEngineNumber.setCellValue(lastlist.get(i).getEnginenumber());
			}else {
				cellEngineNumber.setCellValue("");
			} 
			
			if(lastlist.get(i).getEnginebrandname()!=null&&lastlist.get(i).getEnginebrandname().length()>0) {
				cellEnginebrandname.setCellValue(lastlist.get(i).getEnginebrandname());	
			}else {
				cellEnginebrandname.setCellValue("");	
			} 
			
			if(lastlist.get(i).getYearprice()!=null&&lastlist.get(i).getYearprice()>0) {
				cellYearPrice.setCellValue(lastlist.get(i).getYearprice());
			}else {
				cellYearPrice.setCellValue("");	
			}
			
			if(lastlist.get(i).getMileage()!=null&&lastlist.get(i).getMileage()>0) {
				cellMileage.setCellValue(lastlist.get(i).getMileage());
			}else {
				cellMileage.setCellValue("");	
			} 
			
			if(lastlist.get(i).getDeadweight()!=null&&lastlist.get(i).getDeadweight().length()>0) {
				cellDeadWeight.setCellValue(lastlist.get(i).getDeadweight());
			}else {
				cellDeadWeight.setCellValue("");
			} 
			 
			if(lastlist.get(i).getBuydate()!=null) {
				cellBuyDate.setCellValue(lastlist.get(i).getBuydate());		
			}else {
				cellBuyDate.setCellValue("");		
			}  
			  
			if(lastlist.get(i).getDutydate()!=null) {
				cellDutyDate.setCellValue(lastlist.get(i).getDutydate());
			}else {
				cellDutyDate.setCellValue("");		
			}
			
			if(lastlist.get(i).getCarcheckdate()!=null) {
				cellCarcheckDate.setCellValue(lastlist.get(i).getCarcheckdate());
			}else {
				cellCarcheckDate.setCellValue("");
			}
			 
			if(lastlist.get(i).getJqinsurance()!=null&&lastlist.get(i).getJqinsurance().length()>0) {
				cellJqinsurance.setCellValue(lastlist.get(i).getJqinsurance());
			}else {
				cellJqinsurance.setCellValue("");
			}  
			
			if(lastlist.get(i).getJqinsurancedate()!=null) {
				cellJqinsuranceDate.setCellValue(lastlist.get(i).getJqinsurancedate());
			}else {
				cellJqinsuranceDate.setCellValue("");
			}
			 
			if(lastlist.get(i).getSyinsurance()!=null&&lastlist.get(i).getSyinsurance().length()>0) {
				cellSyinsurance.setCellValue(lastlist.get(i).getSyinsurance());
			}else {
				cellSyinsurance.setCellValue("");
			} 
			
			if(lastlist.get(i).getSyinsurancedate()!=null) {
				cellSyinsuranceDate.setCellValue(lastlist.get(i).getSyinsurancedate());	
			}else {
				cellSyinsuranceDate.setCellValue("");	
			}
			 
			if(lastlist.get(i).getInsuredcar()!=null&&lastlist.get(i).getInsuredcar().length()>0) {
				cellInsuredCar.setCellValue(lastlist.get(i).getInsuredcar());
			}else {
				cellInsuredCar.setCellValue("");
			} 
			
			if(lastlist.get(i).getFueloiltype()!=null&&lastlist.get(i).getFueloiltype().length()>0) {
				cellFueloilType.setCellValue(lastlist.get(i).getFueloiltype());
			}else {
				cellFueloilType.setCellValue("");
			} 
			 
			
			if(lastlist.get(i).getMaintain()!=null&&lastlist.get(i).getMaintain()>0) {
				cellMaintain.setCellValue(lastlist.get(i).getMaintain());
			}else {
				cellMaintain.setCellValue("");
			}  
			 
			if(lastlist.get(i).getMaintaindate()!=null) {
				cellMaintainDate.setCellValue(lastlist.get(i).getMaintaindate());	
			}else {
				cellMaintainDate.setCellValue("");
			} 
			
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
			headers.setContentDispositionFormData("attachment", new String("车辆资料.xlsx".getBytes("utf-8"),"iso-8859-1"));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
		System.out.println("成功！");
		return new ResponseEntity<byte[]>(baos.toByteArray(),headers,HttpStatus.OK);
	}
	
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
