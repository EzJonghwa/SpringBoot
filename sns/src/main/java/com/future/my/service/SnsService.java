package com.future.my.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.future.my.dao.ISnsDAO;
import com.future.my.vo.SearchVO;
import com.future.my.vo.SnsVO;

@Service
public class SnsService {
	@Autowired
	ISnsDAO dao;
	
	public ArrayList<SnsVO> getSns(SearchVO vo){
		int cnt = dao.getSnsTotalCount(vo);
		System.out.println("전체 :" + cnt);
		vo.setTotalRowCount(cnt);
		vo.pageSetting();
		return dao.getSns(vo);
	}

}
