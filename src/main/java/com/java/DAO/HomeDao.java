package com.java.DAO;

import java.util.List;
import com.java.DTO.HomeDTO;



public interface HomeDao {

	List<HomeDTO> findlist(String accept); //전체 리스트

}
