package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.Carinfo;
import com.accp.domain.ClientAndCar;
import com.accp.domain.Commodity;
import com.accp.domain.Ewitem;
import com.accp.domain.Getgood;
import com.accp.domain.ItemRepair;
import com.accp.domain.MaintainHistary;
import com.accp.domain.Maintenanceitems;
import com.accp.domain.Repair;
import com.accp.service.ItemRepairService;
import com.accp.service.RepairService;
import com.accp.service.carInfoService;

@Controller
@RequestMapping("/repair")
public class RepairController {
			@Autowired
			RepairService repairService;
			@Autowired
			carInfoService cs;
			@Autowired
			ItemRepairService itemRepairService;
		@RequestMapping("/selectRepairAndRescue")
		@ResponseBody
		public List<Repair> selectRepairAndResuce(String type,String content,String cpc){
			System.out.println("11"+cpc);
			System.out.println(content);
			System.out.println(type);
			
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
		@RequestMapping("/selectwl")
		@ResponseBody
		public List<MaintainHistary> selectwl(String type,String content){
			
			return repairService.selectwl(type, content);
		}
		@RequestMapping("/selectCarInfo")
		@ResponseBody
		public Carinfo selectCarinfo(String carNumber){
			System.out.println("车牌号"+carNumber);
			return cs.selectCarinfo(carNumber);
		}
		@RequestMapping("/selectById")
		@ResponseBody
		public Maintenanceitems selectById(Integer id){
		
			return itemRepairService.selectById(id);
		}
		@RequestMapping("/selectGoodById")
		@ResponseBody
		public Commodity selectGoodById(String id){
		
			return repairService.selectGoodByid(id);
		}
		@RequestMapping("/addRepair")
		@ResponseBody
		public int addRepair(@RequestBody Repair repair){
		System.out.println(repair);
			return repairService.addRepair(repair);
		}
		@RequestMapping("/addEwitem")
		@ResponseBody
		public int addEwitem(@RequestBody List<Ewitem> list){
		
			return repairService.addEwitem(list);
		}
		@RequestMapping("/addGetgood")
		@ResponseBody
		public int addGetgood(@RequestBody List<Getgood> list){
		
			return repairService.addGetgood(list);
		}
		@RequestMapping("/addItemRepair")
		@ResponseBody
		public int addItemRepair(@RequestBody List<ItemRepair> list){
		
			return repairService.addItemRepair(list);
		}
}
