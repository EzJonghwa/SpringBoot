package com.future.my.member.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.future.my.member.dao.IMemberDAO;
import com.future.my.member.vo.MemberVO;

@Service
public class MemberService {

	@Autowired
	IMemberDAO dao;
	public ArrayList<MemberVO> memList(){
		return dao.memList();
	}
	
}
