package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.Carinfo;
import com.accp.domain.ClientAndCar;
import com.accp.domain.MaintainHistary;
import com.accp.domain.Repair;
import com.accp.service.RepairService;
import com.accp.service.carInfoService;

@Controller
@RequestMapping("/repair")
public class RepairController {
			@Autowired
			RepairService repairService;
			@Autowired
			carInfoService cs;
		@RequestMapping("/selectRepairAndRescue")
		@ResponseBody
		public List<Repair> selectRepairAndResuce(String type,String content,String cpc){
			System.out.println("11"+cpc);
			
			return  repairService.selectRepairAndRescue(type,content,cpc);
		}
		@RequestMapping("/selectClientAndCar")
		@ResponseBody
		public ClientAndCar selectClientAndCar(String carNumber){
			
			return cs.selectClientAndCar(carNumber);
		}
		@RequestMapping("/selectHistary")
		@ResponseBody
		public List<MaintainHistary> selectHistary(String type,String content){
			
			return repairService.selectHistary(type, content);
		}
		@RequestMapping("/selectRepairItem")
		@ResponseBody
		public List<MaintainHistary> selectRepairItem(String type,String content){
			
			return repairService.selectRepairItem(type, content);
		}
		@RequestMapping("/selectCarInfo")
		@ResponseBody
		public Carinfo selectCarinfo(String carNumber){
			System.out.println("车牌号"+carNumber);
			return cs.selectCarinfo(carNumber);
		}
}
