package com.java.DAO;

import java.util.List;
import com.java.DTO.HomeDTO;



public interface HomeDao {

	public List<HomeDTO> findlist(String accept); //전체 리스트

	public HomeDTO findOne(int no); //한개 정보 가져오기

	public int edit(HomeDTO homeDTO);
	
	

}
