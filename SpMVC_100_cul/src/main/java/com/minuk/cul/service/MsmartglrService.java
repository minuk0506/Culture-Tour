package com.minuk.cul.service;

import java.util.List;

import com.minuk.cul.model.MsmArtGlrVO;

public interface MsmartglrService {
	
	public String MsmartglrQueryStr(String search);
	public List<MsmArtGlrVO> getMsmartglrItems(String queryString);
	
}
