package com.mianshi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import com.mianshi.dao.DistinationDao;
import com.mianshi.entity.Distination;
import com.mianshi.service.DistinationService;


@Controller
@Service("distinationService")
public class DistinationServiceImpl implements DistinationService {
	
	@Autowired
	DistinationDao  distinationDao;



	@Override
	public List<Distination> listForPage(Distination distination) {
		
		return distinationDao.listForPage(distination);
	}
	

}
