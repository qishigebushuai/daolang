package com.mianshi.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.mianshi.entity.Distination;


public interface DistinationDao {

	public List<Distination> listForPage(@Param("distination")Distination distination);
	
	
	
	
}
