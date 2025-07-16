package com.java.DTO;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class HomeDTO {
	private int no;
	private String title;
	private String content;
	private LocalDateTime regdate;
	private boolean accept;
	
	

}
