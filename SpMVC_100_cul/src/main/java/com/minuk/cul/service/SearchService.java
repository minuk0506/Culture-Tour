package com.minuk.cul.service;

import java.util.List;

import org.springframework.ui.Model;

import com.minuk.cul.model.EventVO;
import com.minuk.cul.model.FestivalVO;
import com.minuk.cul.model.MsmArtGlrVO;
import com.minuk.cul.model.RuinsVO;
import com.minuk.cul.model.SearchVO;
import com.minuk.cul.model.TourVO;

public interface SearchService{
	List<EventVO> eventSearchAndPage(SearchVO searchPage);
	List<FestivalVO> festivalSearchAndPage(SearchVO searchPage);
	List<MsmArtGlrVO> msmArtGlrSearchAndPage(SearchVO searchPage);
	List<RuinsVO> ruinsSearchAndPage(SearchVO searchPage);
	List<TourVO> tourSearchAndPage(SearchVO searchPage);
	public void searchAndPage(Model model,SearchVO searchPage);
	
}
