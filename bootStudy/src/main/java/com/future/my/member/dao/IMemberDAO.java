package com.future.my.member.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import com.future.my.member.vo.MemberVO;

@Mapper 
public interface IMemberDAO {
	public ArrayList<MemberVO> memList();
}
