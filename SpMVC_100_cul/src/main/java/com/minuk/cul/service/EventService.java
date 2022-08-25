package com.minuk.cul.service;

import java.util.List;

import com.minuk.cul.model.EventVO;

public interface EventService {
	
	public String EventQueryStr(String search);
	public List<EventVO> getEventItems(String queryString);
	
}
