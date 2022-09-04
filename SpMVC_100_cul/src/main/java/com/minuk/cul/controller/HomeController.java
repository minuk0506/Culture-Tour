package com.minuk.cul.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
public class HomeController {
	
	private final EventService eventService;
	private final FestivalService festivalService;
	private final MsmartglrService msmartglrService;
	private final RuinsService ruinsService;
	private final TourService tourService;
	
	public HomeController(EventService eventService, FestivalService festivalService, MsmartglrService msmartglrService,
			RuinsService ruinsService, TourService tourService) {
		this.eventService = eventService;
		this.festivalService = festivalService;
		this.msmartglrService = msmartglrService;
		this.ruinsService = ruinsService;
		this.tourService = tourService;
	}

	@RequestMapping(value={"/",""}, method=RequestMethod.GET)
	public String home(Model model) {
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
		
		model.addAttribute("EVENTS", eventList);
		model.addAttribute("FESTIVALS", festivalList);
		model.addAttribute("MSMARTGLRS", msmartglrList);
		model.addAttribute("RUINS", ruinsList);
		model.addAttribute("TOURS", tourList);
		return "home";
	}

}