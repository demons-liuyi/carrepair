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
import com.accp.domain.Completed;
import com.accp.domain.Ewitem;
import com.accp.domain.Getgood;
import com.accp.domain.ItemRepair;
import com.accp.domain.JunGong;
import com.accp.domain.MaintainHistary;
import com.accp.domain.Maintenanceitems;
import com.accp.domain.QueryGetGoods;
import com.accp.domain.QueryItemRepair;
import com.accp.domain.Repair;
import com.accp.domain.Rescue;
import com.accp.domain.Staff;
import com.accp.service.ItemRepairService;
import com.accp.service.JunGongService;
import com.accp.service.RepairService;
import com.accp.service.carInfoService;
import com.accp.service.staffService;

@Controller
@RequestMapping("/repair")
public class RepairController {
			@Autowired
			RepairService repairService;
			@Autowired
			carInfoService cs;
			@Autowired
			ItemRepairService itemRepairService;
			@Autowired
			JunGongService ser;
			@Autowired
			staffService ss;			
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
		@RequestMapping("/addRescue")
		@ResponseBody
		public int addRescue(@RequestBody Rescue repair){

			return repairService.addRescue(repair);
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
		@RequestMapping("/selectJunGong")
		@ResponseBody
		public List<JunGong> selectJunGong(String tj,String date1,String date2,String number,String carnumber,String carnumber1){
		System.out.println(11);
			return ser.selectJunGong(tj, date1, date2, number, carnumber, carnumber1);
		}
		@RequestMapping("/queryGetGoods")
		@ResponseBody
		public List<QueryGetGoods> queryGetGoods(String tab,String number){

			return repairService.queryGetGoods(tab,number);
		}
		@RequestMapping("/queryRepair")
		@ResponseBody
		public Repair queryRepair(String number){

			return repairService.queryRepair(number);
		}
		@RequestMapping("/queryItemRepair")
		@ResponseBody
		public List<QueryItemRepair> queryItemRepair(String tab,String number){

			return repairService.queryItemRepair(tab,number);
		}
		@RequestMapping("/queryRescue")
		@ResponseBody
		public Rescue queryRescue(String number){

			return repairService.queryRescue(number);
		}
		@RequestMapping("/queryEwitem")
		@ResponseBody
		public List<Ewitem> queryEwitem(String number){

			return repairService.queryEwitem(number);
		}
		@RequestMapping("/queryRescueEwitem")
		@ResponseBody
		public List<Ewitem> queryRescueEwitem(String number){

			return repairService.queryRescueEwitem(number);
		}
		@RequestMapping("/rollBackRepair")
		@ResponseBody
		public int rollBackRepair(String number){

			return repairService.rollBackRepair(number);
		}
		@RequestMapping("/rollBackRescue")
		@ResponseBody
		public int rollBackRescue(String number){

			return repairService.rollBackRescue(number);
		}
		@RequestMapping("/updateRepair")
		@ResponseBody
		public int updateRepair(@RequestBody Repair repair){
		System.out.println(repair);
			return repairService.updateRepair(repair);
		}
		@RequestMapping("/updateRescue")
		@ResponseBody
		public int updateRescue(@RequestBody Rescue repair){
	
			return repairService.updateRescue(repair);
		}

		@RequestMapping("/updateEwitem")
		@ResponseBody
		public int updateEwitem(@RequestBody List<Ewitem> list){
		
			return repairService.updateEwitem(list);
		}
		@RequestMapping("/updateGetgood")
		@ResponseBody
		public int updateGetgood(@RequestBody List<Getgood> list){
		
			return repairService.updateGetgood(list);
		}
		@RequestMapping("/updateItemRepair")
		@ResponseBody
		public int updateItemRepair(@RequestBody List<ItemRepair> list){
		
			return repairService.updateItemRepair(list);
		}
		@RequestMapping("/queryCom")
		@ResponseBody
		public int queryCom(String number){
		
			return repairService.queryCom(number);
		}
		@RequestMapping("/addCom")
		@ResponseBody
		public int queryCom(@RequestBody Completed com){
		
			return repairService.addCom(com);
		}
		@RequestMapping("/addRescueCom")
		@ResponseBody
		public int addRescueCom(@RequestBody Completed com){
		
			return repairService.addRescueCom(com);
		}
		@RequestMapping("/selectAllCar")
		@ResponseBody
		public List<Carinfo> selectAllCar(){
		
			return repairService.selectAllCar();
		}
		@RequestMapping("/selectAllStaff")
		@ResponseBody
		public List<Staff> selectAllStaff(){
		
			return ss.selectAllStaff();
		}
		@RequestMapping("/selectAllItem")
		@ResponseBody
		public List<Maintenanceitems> selectAllItem(){
		
			return repairService.selectAllItem();
		}
		@RequestMapping("/selectAllCommodity")
		@ResponseBody
		public List<Commodity> selectAllCommodity(){
		
			return repairService.selectAllCommodity();
		}
		
		
}
