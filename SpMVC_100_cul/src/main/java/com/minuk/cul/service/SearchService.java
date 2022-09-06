package com.minuk.cul.service;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import com.minuk.cul.model.FestivalVO;
import com.minuk.cul.model.MsmArtGlrVO;
import com.minuk.cul.model.RuinsVO;
import com.minuk.cul.model.TourVO;

public interface SearchService {
	
	public String SearchEventQueryStr(String search);
	public String SearchFestivalQueryStr(String search);
	public String SearchMsmArtGlrQueryStr(String search);
	public String SearchRuinsQueryStr(String search);
	public String SearchTourQueryStr(String search);
	
	List<FestivalVO> getFestivalItems(String queryString);
	List<MsmArtGlrVO> getMsmArtGlrItems(String queryString);
	List<RuinsVO> getRuinsItems(String queryString);
	List<TourVO> getTourItems(String queryString);
	List<Map<String, Object>> getEventItems(String queryString);
}
