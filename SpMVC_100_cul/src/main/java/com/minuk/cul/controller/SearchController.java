package com.minuk.cul.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.minuk.cul.model.EventVO;
import com.minuk.cul.model.FestivalVO;
import com.minuk.cul.model.MsmArtGlrVO;
import com.minuk.cul.model.RuinsVO;
import com.minuk.cul.model.TourVO;
import com.minuk.cul.service.EventService;
import com.minuk.cul.service.FestivalService;
import com.minuk.cul.service.MsmartglrService;
import com.minuk.cul.service.RuinsService;
import com.minuk.cul.service.TourService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class SearchController {

	private final EventService eventService;
	private final FestivalService festivalService;
	private final MsmartglrService msmartglrService;
	private final RuinsService ruinsService;
	private final TourService tourService;
	
	public SearchController(EventService eventService, FestivalService festivalService,
			MsmartglrService msmartglrService, RuinsService ruinsService, TourService tourService) {
		this.eventService = eventService;
		this.festivalService = festivalService;
		this.msmartglrService = msmartglrService;
		this.ruinsService = ruinsService;
		this.tourService = tourService;
	}

	@ResponseBody
	@RequestMapping(value = "/search", method=RequestMethod.GET)
	public String search(Model model, @RequestParam("search") String search) {
		
		log.debug("서치 로그 {}",search);
		String eventQueryStr = eventService.EventQueryStr(null);
		String festivalQueryStr = festivalService.FestivalQueryStr(null);
		String msmartglrQueryStr = msmartglrService.MsmartglrQueryStr(null);
		String ruinsQueryStr = ruinsService.RuinsQueryStr(null);
		String tourQueryStr = tourService.tourQueryStr(null);
		
		eventService.getEventItems(eventQueryStr);
		festivalService.getFestivalItems(festivalQueryStr);
		msmartglrService.getMsmartglrItems(msmartglrQueryStr);
		ruinsService.getRuinsItems(ruinsQueryStr);
		tourService.getTourItems(tourQueryStr);
		
		List<EventVO> eventList = eventService.getEventItems(eventQueryStr);
		List<FestivalVO> festivalList = festivalService.getFestivalItems(festivalQueryStr);
		List<MsmArtGlrVO> msmartglrList = msmartglrService.getMsmartglrItems(msmartglrQueryStr);
		List<RuinsVO> ruinsList = ruinsService.getRuinsItems(ruinsQueryStr);
		List<TourVO> tourList = tourService.getTourItems(tourQueryStr);
		
//		Map<String, Object> eventList = SearchService.eventList(eventQueryStr);
//		Map<String, Object> festivalList = festivalService.getFestivalItems(festivalQueryStr);
//		Map<String, Object> msmartglrList = msmartglrService.getMsmartglrItems(msmartglrQueryStr);
//		Map<String, Object> ruinsList = ruinsService.getRuinsItems(ruinsQueryStr);
//		Map<String, Object> tourList = tourService.getTourItems(tourQueryStr);
		
		model.addAttribute("EVENTS", eventList);
		model.addAttribute("FESTIVALS", festivalList);
		model.addAttribute("MSMARTGLRS", msmartglrList);
		model.addAttribute("RUINS", ruinsList);
		model.addAttribute("TOURS", tourList);
		model.addAttribute("SEARCH", search);
		
		return "/search/search";
	}
}
