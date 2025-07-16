package com.java.DAO;

import java.util.List;
import com.java.DTO.HomeDTO;



public interface HomeDao {

	public List<HomeDTO> findlist(String accept); //전체 리스트

	public HomeDTO findOne(int no); //한개 정보 가져오기

	public int edit(HomeDTO homeDTO); //글 수정

	public int input(HomeDTO homeDTO); //글 추가

	public int accept(HomeDTO homeDTO); // 승인,미승인
	
	

}
