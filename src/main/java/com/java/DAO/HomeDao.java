package com.java.DAO;

import java.util.List;
import com.java.DTO.HomeDTO;



public interface HomeDao {

	public List<HomeDTO> findlist(String accept); //전체 리스트

	public HomeDTO findOne(int no); //하나 선택

}
