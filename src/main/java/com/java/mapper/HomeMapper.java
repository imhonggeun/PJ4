package com.java.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.java.DTO.HomeDTO;


@Mapper
public interface HomeMapper {

	@Select({"<script>"
			+ "SELECT no, title, content, accept, regDate FROM test "
			+ "<if test='accept == 1'>WHERE accept = 1</if> "
			+ "<if test='accept == 0'>WHERE accept = 0</if> "
			+ "</script>"})
	List<HomeDTO> findlist(String accept); //전체화면

	@Select("select * from test where no = #{no}")
	HomeDTO findone(int no); //글 하나 

	

}
