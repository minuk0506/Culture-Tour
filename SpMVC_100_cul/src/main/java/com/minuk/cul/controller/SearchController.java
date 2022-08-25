package com.minuk.cul.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.minuk.cul.model.EventVO;
import com.minuk.cul.model.FestivalVO;
import com.minuk.cul.model.MsmArtGlrVO;
import com.minuk.cul.model.RuinsVO;
import com.minuk.cul.model.SearchVO;
import com.minuk.cul.model.TourVO;
import com.minuk.cul.service.SearchService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class SearchController {

	private final SearchService searchService;
	public SearchController(SearchService searchService) {
		this.searchService = searchService;
	}
	
	@RequestMapping(value = "/search", method=RequestMethod.GET)
	public String search(Model model , 
			@RequestParam(name = "pageno",required = false, defaultValue = "1") int pageno,
			SearchVO searchPage) {
		
		searchPage.setCurrentPageNo(pageno);
		// 페이지 계산
		searchService.searchAndPage(model,searchPage);
		log.debug("페이지 계산 {}",searchPage.toString());
		
		// 데이터 가져오기
//		List<EventVO> eventList = searchService.eventSearchAndPage(searchPage);
//		List<FestivalVO> festivalList = searchService.festivalSearchAndPage(searchPage);
//		List<MsmArtGlrVO> msmartglrList = searchService.msmArtGlrSearchAndPage(searchPage);
//		List<RuinsVO> ruinsList = searchService.ruinsSearchAndPage(searchPage);
//		List<TourVO> tourList = searchService.tourSearchAndPage(searchPage);
		
//		model.addAttribute("EVENT", eventList);
//		model.addAttribute("FESTIVAL", festivalList);
//		model.addAttribute("MSMARTGLR", msmartglrList);
//		model.addAttribute("RUINS", ruinsList);
//		model.addAttribute("TOUR", tourList);
		
		return "/search";
	}
}
