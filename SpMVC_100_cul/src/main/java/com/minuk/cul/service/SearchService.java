package com.minuk.cul.service;

import java.util.List;

import com.minuk.cul.model.EventVO;
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
	
}
