package com.minuk.cul.service;

import java.util.List;

import com.minuk.cul.model.RuinsVO;

public interface RuinsService {
	
	public String RuinsQueryStr(String search);
	public List<RuinsVO> getRuinsItems(String queryString);
	
}
