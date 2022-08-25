package com.minuk.cul.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.minuk.cul.model.EventVO;
import com.minuk.cul.model.FestivalVO;
import com.minuk.cul.service.EventService;
import com.minuk.cul.service.FestivalService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping(value = "/active")
public class EventController {
	
	private final EventService eventService;
	private final FestivalService festivalService;
	
	public EventController(EventService eventService, FestivalService festivalService) {
		this.eventService = eventService;
		this.festivalService = festivalService;
	}

	@RequestMapping(value="/event", method=RequestMethod.GET)
	public String event(Model model) {
		String eventQueryStr = eventService.EventQueryStr(null);
		eventService.getEventItems(eventQueryStr);
		log.debug("Event 받은 데이터 {}",eventQueryStr);
		List<EventVO> EventJson = eventService.getEventItems(eventQueryStr);
		model.addAttribute("EVENTS", EventJson);
		return "/active/event";
	}
	
	
	@RequestMapping(value="/festival", method=RequestMethod.GET)
	public String festival(Model model) {
		String festivalQueryStr = festivalService.FestivalQueryStr(null);
		festivalService.getFestivalItems(festivalQueryStr);
		log.debug("Festival 받은 데이터 {}",festivalQueryStr);
		List<FestivalVO> FestivalJson = festivalService.getFestivalItems(festivalQueryStr);
		model.addAttribute("FESTIVALS", FestivalJson);
		
		return "/active/festival";
	}
}