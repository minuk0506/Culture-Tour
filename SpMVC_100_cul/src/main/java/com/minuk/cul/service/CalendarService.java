package com.minuk.cul.service;

import java.util.Map;

import com.minuk.cul.model.DateVO;

public interface CalendarService {

	public void makeCalendar();
	public Map<String, Integer> today_info(DateVO dateVO);
}
