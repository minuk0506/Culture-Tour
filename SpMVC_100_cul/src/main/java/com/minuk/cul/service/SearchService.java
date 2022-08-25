package com.minuk.cul.service;

import org.springframework.ui.Model;

import com.minuk.cul.model.SearchVO;

public interface SearchService{
	public void searchAndPage(Model model,SearchVO searchPage);
	
}
