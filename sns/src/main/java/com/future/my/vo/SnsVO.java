package com.future.my.vo;

import lombok.Data;

//loombok 으로 추가 
@Data
public class SnsVO {
	private int postId;
	private String author;
	private String authorImg;
	private String content;
	private String postTime;
	private String relativeTime;
	private String rnum;
}
