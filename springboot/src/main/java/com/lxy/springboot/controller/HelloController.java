package com.lxy.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lxy.springboot.entity.Goods;
import com.lxy.springboot.service.GoodService;

@Controller
public class HelloController {
	
	@Autowired
	private GoodService goodService;
	
	@RequestMapping("/hello")
	public String index(){
		return "hello world!" ;
	}
	
	@RequestMapping("/showpage")
	public String showMessage(ModelMap map){
		
		map.addAttribute("host1", "http://blog.didispace.com");
		return "index";
		
	}
	
	@RequestMapping("/list")
	public String showList(ModelMap map) {
		
		List<Goods> goodsList = goodService.showall();
		map.addAttribute("goodList", goodsList);
		return "list";
	}
	
	@RequestMapping("/vueTest")
	public String showListJson(ModelMap map) {
		
		return "vueTest";
	}
}
