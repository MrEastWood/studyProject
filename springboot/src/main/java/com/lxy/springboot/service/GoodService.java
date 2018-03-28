package com.lxy.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lxy.springboot.entity.Goods;
import com.lxy.springboot.entity.GoodsMapper;

@Service
public class GoodService {
	
	@Autowired
	private GoodsMapper goodsMapper;
	
	
	public List<Goods> showall(){
		
		return goodsMapper.findAll();
	}
}
