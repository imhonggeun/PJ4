package com.java.service;

import org.springframework.ui.Model;

import jakarta.servlet.http.HttpServletRequest;

public interface HomeService {

	public String findlist(Model model, HttpServletRequest req); //전체 리스트

}
