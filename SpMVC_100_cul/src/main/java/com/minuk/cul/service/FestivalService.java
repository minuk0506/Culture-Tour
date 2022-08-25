package com.minuk.cul.service;

import java.util.List;

import com.minuk.cul.model.FestivalVO;

public interface FestivalService {
	
	public String FestivalQueryStr(String search);
	public List<FestivalVO> getFestivalItems(String queryString);
	
}
