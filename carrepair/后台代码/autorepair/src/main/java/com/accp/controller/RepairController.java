package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.Repair;
import com.accp.service.RepairService;

@Controller
@RequestMapping("/repair")
public class RepairController {
			@Autowired
			RepairService repairService;
		@RequestMapping("/selectRepairAndRescue")
		@ResponseBody
		public List<Repair> selectRepairAndResuce(String type,String content){
			
			return  repairService.selectRepairAndRescue(type,content);
		}
}
