package com.java.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.java.DAO.HomeDao;
import com.java.DTO.HomeDTO;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class HomeServiceImp  implements HomeService{
	private final HomeDao homeDao;

	@Override
	public String findlist(Model model, HttpServletRequest req) {
		String accept = req.getParameter("accept");
		System.out.println(accept == null);
		if(accept == null|| accept == "") accept = "2";
		List<HomeDTO> HomeDTO = homeDao.findlist(accept);
		System.out.print(HomeDTO);
		model.addAttribute("result",HomeDTO);
		return "findlist";
		
		
		//List<HomeDTO> homeDTO = homeDao.findlist(model, req); 전체 화면 가져오는것
		//model.addAttribute("result", homeDTO);
		
		//String title = req.getParameter("title"); 그냥 생각나는데로 적음
		//List<HomeDTO> homeDTO = HomeDTO
		//homeDTO = homeDao.findlist(model, req);
		//model.addAttribute("result", homeDTO);
		
	}

}
