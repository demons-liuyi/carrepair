package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.Artisan;
import com.accp.domain.Artisanlevel;
import com.accp.service.artisanlevelService;

@Controller
@RequestMapping("/level")
public class artisanlevelController {
		@Autowired
		artisanlevelService alService;
		@RequestMapping("/query")
		@ResponseBody
		public List<Artisanlevel> query(){
			return alService.query();
		}
		@RequestMapping("/add")
		@ResponseBody
		public int add(@RequestBody Artisanlevel level){
			return alService.add(level);
		}
		@RequestMapping("/update")
		@ResponseBody
		public int  update(@RequestBody Artisanlevel level){
			return alService.update(level);
		}
		@RequestMapping("/delete")
		@ResponseBody
		public int delete(Integer id){
			return alService.delete(id);
		}
		@RequestMapping("/selectByWhere")
		@ResponseBody
		public List<Artisan> selectByWhere(String bzid,String sel){
			System.out.println(bzid);
			return alService.selectByWhere(bzid,sel);
		}
		@RequestMapping("/addArtisan")
		@ResponseBody
		public int addArtisan(@RequestBody Artisan artisan){
			return alService.addArtisan(artisan);
		}
		@RequestMapping("/updateArtisan")
		@ResponseBody
		public int  updateArtisan(@RequestBody Artisan artisan){
			return alService.updateArtisan(artisan);
		}
		@RequestMapping("/deleteArtisan")
		@ResponseBody
		public int deleteArtisan(String artisanno){
			return alService.deleteArtisan(artisanno);
		}
		
}
