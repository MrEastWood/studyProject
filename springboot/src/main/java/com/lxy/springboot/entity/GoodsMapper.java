package com.lxy.springboot.entity;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface GoodsMapper {
	
	@Select("SELECT * FROM GOODS WHERE ID = #{id}")
	Goods findById(@Param("id") int id);
	
	@Select("SELECT * FROM GOODS")
	List<Goods> findAll();
}
