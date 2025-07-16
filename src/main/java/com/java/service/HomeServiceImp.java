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

	@Override // 전체 리스트
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

	@Override //한개 정보 가져오기
	public String findeone(Model model, HttpServletRequest req) {
		//그대로 가져다가 씀
		try {
			int no = Integer.parseInt(req.getParameter("no"));// getInteger(x) -> parserInt
			HomeDTO homeDTO =homeDao.findOne(no);
			model.addAttribute("result",homeDTO);
			return "detail";
		}catch (NumberFormatException e) {
			e.printStackTrace();
			return "redirect:/";
		}
		
		//int no = Integer.getInteger(req.getParameter("no"));
		//String title = req.getParameter("title");
		//String content = req.getParameter("content");
		//List<HomeDTO> homeDTO = HomeDTO.builder().no(no).title(title).content(content).build();
		//homeDTO = homeDao.findone(homeDTO);
		//model.addAttribute(homeDTO);
		
	}

	@Override // 글 수정
	public String edit(HttpServletRequest req) {
		int no = Integer.parseInt(req.getParameter("no"));
		String title = req.getParameter("title");
		String content = req.getParameter("content");
		HomeDTO homeDTO = HomeDTO.builder().no(no).title(title).content(content).build();
		homeDao.edit(homeDTO);
		return "redirect:/";
	}

}
