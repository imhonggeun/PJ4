package com.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.java.service.HomeService;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class Homecontroller {
	private final HomeService homeService;
	
	@GetMapping("/")// 전체 리스트 화면
	public String findlist(Model model,HttpServletRequest req) {
		return homeService.findlist(model,req);
	}
	

}
