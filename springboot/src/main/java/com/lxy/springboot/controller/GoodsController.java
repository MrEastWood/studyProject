package com.lxy.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lxy.springboot.entity.Goods;
import com.lxy.springboot.service.GoodService;

@RestController
@RequestMapping("/vue")
public class GoodsController {
	
	@Autowired
	private GoodService goodService;
	
	@RequestMapping("/hello")
	public String index(){
		return "hello world!" ;
	}
	
	@RequestMapping("/list")
	public List<Goods> goodsList(){
		return goodService.showall();
		
	}
}
