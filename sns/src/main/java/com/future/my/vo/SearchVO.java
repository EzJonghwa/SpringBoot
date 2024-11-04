package com.future.my.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class SearchVO extends PagingVO {

	//검색 조건에 있는 where 절을 쓰기위해서 작성함
	private String currentTime;
}
