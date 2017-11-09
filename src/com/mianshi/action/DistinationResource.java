package com.mianshi.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mianshi.entity.Distination;
import com.mianshi.service.DistinationService;


@Controller
@RequestMapping("admin/v1/distination")
public class DistinationResource {
	
	@Autowired
	private DistinationService distinationService;



	@RequestMapping("list")
	public String listForAdmin(Distination distination,Model model){
		List<Distination> listForPage = distinationService.listForPage(distination);
		for (Distination distination2 : listForPage) {
			System.out.println(distination2.getName());
		}
		model.addAttribute("list",listForPage);
		return "/jsp/1";
	}

	
	
	
	
}
