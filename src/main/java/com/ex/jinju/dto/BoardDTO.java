package com.ex.jinju.dto;

import java.sql.Date;

import lombok.Data;

@Data
public class BoardDTO {
	
	private Long board_number;
	
	private String title;
	
	private String content;
	
	private String writer;
	
	private Date date;
	
	private Long read_count;
 
}
