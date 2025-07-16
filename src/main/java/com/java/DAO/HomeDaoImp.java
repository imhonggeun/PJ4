package com.java.DAO;

import java.util.List;

import org.springframework.stereotype.Repository;


import com.java.DTO.HomeDTO;
import com.java.mapper.HomeMapper;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Repository
public class HomeDaoImp implements HomeDao{
	private final HomeMapper homeMapper;

	@Override
	public List<HomeDTO> findlist(String accept) {
		return homeMapper.findlist(accept);
	}

	@Override
	public HomeDTO findOne(int no) {
		return homeMapper.findone(no);
	}

}
