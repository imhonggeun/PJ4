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

	@Override //전체 리스트
	public List<HomeDTO> findlist(String accept) {
		return homeMapper.findlist(accept);
	}

	@Override // 한개 정보 가져오기
	public HomeDTO findOne(int no) {
		return homeMapper.findone(no);
	}

	@Override // 글 수정
	public int edit(HomeDTO homeDTO) {
		return homeMapper.edit(homeDTO);
	}

	@Override // 글 추가
	public int input(HomeDTO homeDTO) {
		return homeMapper.input(homeDTO);
	}

}
