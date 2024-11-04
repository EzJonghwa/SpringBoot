package com.future.my.web;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.future.my.service.SnsService;
import com.future.my.vo.SearchVO;
import com.future.my.vo.SnsVO;

@Controller
public class SnsController {
	@Autowired
	SnsService service;
	
	@GetMapping("/")
	public String index (Model model, @ModelAttribute("serachVO") SearchVO searchVO) {
		
		ArrayList<SnsVO> snsList = service.getSns(searchVO);
		System.out.println(snsList);
		model.addAttribute("snsList", snsList);
		
		
		return "index";
	}
}
