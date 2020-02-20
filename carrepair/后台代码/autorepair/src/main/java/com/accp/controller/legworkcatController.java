package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.Artisanclass;
import com.accp.domain.Legworkcat;
import com.accp.service.legworkcarService;

@Controller
@RequestMapping("/leg")
public class legworkcatController {
			@Autowired
			legworkcarService legService;
			@RequestMapping("/queryAll")
			@ResponseBody
			public List<Legworkcat> queryAll(){
				return legService.queryAll();
			}
			@RequestMapping("/selectNodes")
			@ResponseBody
			public List<Artisanclass> selectNodes(){
				System.out.println(111);
				return legService.selectNodes();
			}
			@RequestMapping("/selectAll")
			@ResponseBody
			public List<Artisanclass> selectAll(){
				return legService.selectall();
			}
			@RequestMapping("/add")
			@ResponseBody
			public int add(@RequestBody Legworkcat level){
				return legService.add(level);
			}
			@RequestMapping("/update")
			@ResponseBody
			public int  update(@RequestBody Legworkcat level){
				return legService.update(level);
			}
			@RequestMapping("/delete")
			@ResponseBody
			public int delete(Integer id){
				return legService.delete(id);
			}
			@RequestMapping("/nodesAdd")
			@ResponseBody
			public int nodesAdd(@RequestBody Artisanclass al){
				return legService.nodesAdd(al);
			}
			@RequestMapping("/nodesUpdate")
			@ResponseBody
			public int  nodesUpdate(@RequestBody Artisanclass al){
				return legService.nodesUpdate(al);
			}
			@RequestMapping("/nodesDelete")
			@ResponseBody
			public int nodesDelete(Integer id){
				return legService.nodesDelete(id);
			}
}
