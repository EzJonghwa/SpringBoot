package com.future.my.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

import com.future.my.vo.SearchVO;
import com.future.my.vo.SnsVO;

@Mapper
public interface ISnsDAO {
	
	public int getSnsTotalCount(SearchVO vo);
	
	public ArrayList<SnsVO> getSns(SearchVO vo);
	
	
}
