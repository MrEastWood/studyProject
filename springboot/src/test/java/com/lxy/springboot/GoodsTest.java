package com.lxy.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lxy.springboot.entity.Goods;
import com.lxy.springboot.entity.GoodsMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SpringbootApplication.class)
public class GoodsTest {
	@Autowired
	private GoodsMapper goodsMapper;
	
	@Test
	public void findByName(){
		Goods goods = goodsMapper.findById(1);
		System.out.println(goods.getName());
	}
}
