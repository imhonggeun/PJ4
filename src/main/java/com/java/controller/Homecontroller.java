package com.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

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
	
	@GetMapping("/detail") // 한개 정보 가져오기
	public String findone(Model model,HttpServletRequest req) {
		return homeService.findeone(model,req);
	}
	@PostMapping("edit") // 글 수정
	public String edit(HttpServletRequest req) {
		return homeService.edit(req);
	}
	
	@GetMapping("/input") // 글 추가 화면이동
	public String input() {
		return "/input";
	}	
	
	@PostMapping("/input") //글 추가
	public String input(HttpServletRequest req) {
		return homeService.input(req);
	}
	@GetMapping("/accept") // 승인,미승인
	public String accept(HttpServletRequest req) {
		return homeService.accept(req);
	}
	
}
