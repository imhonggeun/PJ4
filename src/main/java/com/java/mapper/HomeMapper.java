package com.java.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

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
	HomeDTO findone(int no); //한개 정보 가져오기

	@Update("update test set title=#{title},content=#{content} where no=#{no} ")
	public int edit(HomeDTO homeDTO); //글 수정

	@Insert("INSERT INTO test (title,content) VALUES (#{title},#{content})")
	int input(HomeDTO homeDTO); //글 추가

	

}
