package com.java.service;

import org.springframework.ui.Model;

import jakarta.servlet.http.HttpServletRequest;

public interface HomeService {

	public String findlist(Model model, HttpServletRequest req); //전체 리스트

	public String findeone(Model model, HttpServletRequest req); //한개 정보 가져오기

}
