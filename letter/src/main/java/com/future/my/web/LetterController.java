package com.future.my.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.future.my.service.LetterService;
import com.future.my.vo.LetterVO;

@Controller
public class LetterController {
	
	@Autowired
	LetterService service;
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("nm","pengsu");
		return "index";
	}
	@GetMapping("/letterForm")
	public String letterForm() {
		return "letterForm";
	}
	@PostMapping("/sendLetter")
	public String sendLetter(LetterVO vo) {
		try {
			service.sendLetter(vo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:/";
	}
}
