package com.minuk.cul.persistance;

import java.util.List;

import com.minuk.cul.model.EventVO;
import com.minuk.cul.model.FestivalVO;
import com.minuk.cul.model.MsmArtGlrVO;
import com.minuk.cul.model.RuinsVO;
import com.minuk.cul.model.SearchVO;
import com.minuk.cul.model.TourVO;

public interface SearchDto {
	public List<EventVO> eventSearchAndPage(SearchVO searchPage);
	public List<FestivalVO> festivalSearchAndPage(SearchVO searchPage);
	public List<MsmArtGlrVO> msmArtGlrSearchAndPage(SearchVO searchPage);
	public List<RuinsVO> ruinsSearchAndPage(SearchVO searchPage);
	public List<TourVO> tourSearchAndPage(SearchVO searchPage);
}
