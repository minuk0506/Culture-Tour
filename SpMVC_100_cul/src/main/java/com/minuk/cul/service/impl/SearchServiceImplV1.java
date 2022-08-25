package com.minuk.cul.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.minuk.cul.config.QualifierConfig;
import com.minuk.cul.model.EventVO;
import com.minuk.cul.model.FestivalVO;
import com.minuk.cul.model.MsmArtGlrVO;
import com.minuk.cul.model.RuinsVO;
import com.minuk.cul.model.SearchVO;
import com.minuk.cul.model.TourVO;
import com.minuk.cul.persistance.SearchDto;
import com.minuk.cul.service.SearchService;

@Service(QualifierConfig.SERVICE.SEARCH_V1)
public class SearchServiceImplV1 implements SearchService {

	@Autowired
	private SearchDto searchDto;
	
	// 한 페이지에 보여질 데이터 리스트 개수
	private static final long LIST_PER_PAGE = 10;

	// 화면 하단에 페이지 번호 출력 개수
	private static final long PAGE_NO_COUNT = 10;

	@Override
	public void searchAndPage(Model model, SearchVO searchPage) {

		String search = searchPage.getSearch();
		search = search == null ? "" : search;
		searchPage.setSearch(search);

		// 검색어 조건에 맞는 모든 데이터를 일단 select
		List<EventVO> eventList = searchDto.eventSearchAndPage(searchPage);
		List<FestivalVO> festivalList = searchDto.festivalSearchAndPage(searchPage);
		List<MsmArtGlrVO> msmartglrList = searchDto.msmArtGlrSearchAndPage(searchPage);
		List<RuinsVO> ruinsList = searchDto.ruinsSearchAndPage(searchPage);
		List<TourVO> tourList = searchDto.tourSearchAndPage(searchPage);

		long totalCount = eventList.size() + festivalList.size() + msmartglrList.size() + ruinsList.size()
				+ tourList.size();

		if (totalCount < 1)
			return;

		long finalPageNo = totalCount / LIST_PER_PAGE;

		// 화면 하단의 페이지번호를 클릭했을때 전달되는 값
		long currentPageNo = searchPage.getCurrentPageNo();

		// 삼항 연산자를 사용할때
		// currentPageNo = currentPageNo > 1 ? (currentPageNo > finalPageNo ? finalPageNo : currentPageNo) : 1;

		// 일반적인 if 문을 사용할때
		if (currentPageNo > finalPageNo) {
			currentPageNo = finalPageNo;
		}
		if (currentPageNo < 1) {
			currentPageNo = 1;
		}

		// 선택된 페이지번호에 따라 화면하단 번호 리스트를 유동적으로
		// 보여주기 위한 연산
		long startPageNo = (currentPageNo / PAGE_NO_COUNT) * PAGE_NO_COUNT;
		startPageNo = startPageNo < 1 ? 1 : startPageNo;

		long endPageNo = startPageNo + PAGE_NO_COUNT - 1;
		endPageNo = endPageNo > finalPageNo ? finalPageNo : endPageNo;

		searchPage.setStartPageNo(startPageNo);
		searchPage.setEndPageNo(endPageNo);
		searchPage.setLimit(LIST_PER_PAGE);
		searchPage.setPageNoCount(PAGE_NO_COUNT);
		searchPage.setOffset((currentPageNo - 1) * PAGE_NO_COUNT);
		searchPage.setFinalPageNo(finalPageNo);

		// JSP 로 보내기 위해서 model 에 담기
		model.addAttribute("PAGE", searchPage);
	}


}