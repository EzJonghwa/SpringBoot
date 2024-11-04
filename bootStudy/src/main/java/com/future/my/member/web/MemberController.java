package com.future.my.member.web;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.future.my.member.service.MemberService;
import com.future.my.member.vo.MemberVO;

@Controller
public class MemberController {
	
	@Autowired
	MemberService memberService;
	
	@GetMapping
	public String home(Model model) {
		ArrayList<MemberVO> memList = memberService.memList();
		System.out.println(memList);
		model.addAttribute("memList",memList);
		return "index";
	}
	
}
