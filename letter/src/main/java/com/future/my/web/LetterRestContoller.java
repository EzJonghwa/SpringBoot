package com.future.my.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.future.my.service.LetterService;
import com.future.my.vo.LetterVO;

@RestController
@CrossOrigin(origins="*",allowedHeaders = "*")
public class LetterRestContoller {
	
	@Autowired
	LetterService service;
	
	@PostMapping("/getCard")
	public LetterVO getLetter(LetterVO vo) {
		System.out.println(vo);
		LetterVO msg = service.getLetter(vo);
		return msg;
	}
}
