package com.minuk.cul.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.minuk.cul.model.MsmArtGlrVO;
import com.minuk.cul.service.MsmartglrService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping(value = "/travel")
public class MsmartglrController {
	
	private final MsmartglrService msmartglrService;
	
	public MsmartglrController(MsmartglrService msmartglrService) {
		this.msmartglrService = msmartglrService;
	}

	@RequestMapping(value="/facility", method=RequestMethod.GET)
	public String home(Model model) {
		String msmartglrQueryStr = msmartglrService.MsmartglrQueryStr(null);
		msmartglrService.getMsmartglrItems(msmartglrQueryStr);
		log.debug("Msmartglr 받은 데이터 {}",msmartglrQueryStr);
		List<MsmArtGlrVO> Msmartglrjson = msmartglrService.getMsmartglrItems(msmartglrQueryStr);
		model.addAttribute("MSMARTGLRS", Msmartglrjson);
		return "/travel/facility";
	}

}