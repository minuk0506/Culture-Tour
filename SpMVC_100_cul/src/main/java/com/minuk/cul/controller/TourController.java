package com.minuk.cul.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.minuk.cul.model.RuinsVO;
import com.minuk.cul.model.TourVO;
import com.minuk.cul.service.RuinsService;
import com.minuk.cul.service.TourService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping(value = "/travel")
public class TourController {
	
	private final TourService tourService;
	private final RuinsService ruinsService;
	
	public TourController(TourService tourService, RuinsService ruinsService) {
		this.tourService = tourService;
		this.ruinsService = ruinsService;
		
	}

	@RequestMapping(value="/tour", method=RequestMethod.GET)
	public String tour(Model model) {
		String tourQueryStr = tourService.tourQueryStr(null);
		tourService.getTourItems(tourQueryStr);
		log.debug("Tour 받은 데이터 {}",tourQueryStr);
		List<TourVO> tourJson = tourService.getTourItems(tourQueryStr);
		model.addAttribute("TOURS", tourJson);

		return "/travel/tour";
	}

	@RequestMapping(value="/ruins", method=RequestMethod.GET)
	public String ruins(Model model) {

		String ruinsQueryStr = ruinsService.RuinsQueryStr(null);
		ruinsService.getRuinsItems(ruinsQueryStr);
		log.debug("Ruins 받은 데이터 {}",ruinsQueryStr);
		List<RuinsVO> ruinsJson = ruinsService.getRuinsItems(ruinsQueryStr);
		model.addAttribute("RUINS", ruinsJson);
		
		return "/travel/ruins";
	}
}