package com.minuk.cul.service.impl;

import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.minuk.cul.config.ApiConfig;
import com.minuk.cul.config.QualifierConfig;
import com.minuk.cul.model.EventVO;
import com.minuk.cul.model.FestivalVO;
import com.minuk.cul.model.MsmArtGlrVO;
import com.minuk.cul.model.RuinsVO;
import com.minuk.cul.model.TourVO;
import com.minuk.cul.model.root.GetEvent;
import com.minuk.cul.model.root.GetFestival;
import com.minuk.cul.model.root.GetMsmartglr;
import com.minuk.cul.model.root.GetRuins;
import com.minuk.cul.model.root.GetTour;
import com.minuk.cul.service.SearchService;
import com.minuk.cul.utils.HttpRequestInterceptorV1;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service(QualifierConfig.SERVICE.SEARCH_V1)
public class SearchServiceImplV1 implements SearchService {

	@Override
	public String SearchEventQueryStr(String search) {
		log.debug("서비스 서치 로그{}",search);
		String eventQueryStr = ApiConfig.API_EVENT_URL;
		String encodeParams = null;

		try {
			encodeParams = "?" + URLEncoder.encode("serviceKey", "UTF-8");
			encodeParams += "=" + ApiConfig.SERVICE_KEY;

			encodeParams += "&" + URLEncoder.encode("type", "UTF-8");
			encodeParams += "=json";

			encodeParams += "&" + URLEncoder.encode("eventNm", "UTF-8");
			encodeParams += "="+search;

		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		eventQueryStr += encodeParams;
		log.debug("쿼리 문자열 {}", eventQueryStr);

		return eventQueryStr;
	}

	@Override
	public String SearchFestivalQueryStr(String search) {

		String festivalQueryStr = ApiConfig.API_FESTIVAL_URL;
		String encodeParams = null;
		
		try {
			encodeParams = "?" + URLEncoder.encode("serviceKey", "UTF-8");
			encodeParams += "=" + ApiConfig.SERVICE_KEY;

			encodeParams += "&" + URLEncoder.encode("type", "UTF-8");
			encodeParams += "=json";

			encodeParams += "&" + URLEncoder.encode("festivalNm", "UTF-8");
			encodeParams += "="+search;

		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		festivalQueryStr += encodeParams;
		log.debug("쿼리 문자열 {}", festivalQueryStr);

		return festivalQueryStr;
	}

	@Override
	public String SearchMsmArtGlrQueryStr(String search) {
		String msmartglrQueryStr = ApiConfig.API_MSMARTGLR_URL;
		String encodeParams = null;
		
		try {
			encodeParams = "?" + URLEncoder.encode("serviceKey","UTF-8");
			encodeParams += "=" + ApiConfig.SERVICE_KEY;
			
			encodeParams += "&" + URLEncoder.encode("type","UTF-8");
			encodeParams += "=json";
			
			encodeParams += "&" + URLEncoder.encode("msmArtGlrNm", "UTF-8");
			encodeParams += "="+search;
			
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		msmartglrQueryStr += encodeParams;
		log.debug("쿼리 문자열 {}", msmartglrQueryStr);
		
		return msmartglrQueryStr;
	}

	@Override
	public String SearchRuinsQueryStr(String search) {
		String RuinsQueryStr = ApiConfig.API_RUINS_URL;
		String encodeParams = null;
		
		try {
			encodeParams = "?" + URLEncoder.encode("serviceKey","UTF-8");
			encodeParams += "=" + ApiConfig.SERVICE_KEY;
			
			encodeParams += "&" + URLEncoder.encode("type","UTF-8");
			encodeParams += "=json";
			
			encodeParams += "&" + URLEncoder.encode("localCultHeritNm", "UTF-8");
			encodeParams += "="+search;
			
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		RuinsQueryStr += encodeParams;
		log.debug("쿼리 문자열 {}", RuinsQueryStr);
		
		return RuinsQueryStr;
	}

	@Override
	public String SearchTourQueryStr(String search) {
		String tourQueryStr = ApiConfig.API_TOUR_URL;
		String encodeParams = null;
		
		try {
			encodeParams = "?" + URLEncoder.encode("serviceKey","UTF-8");
			encodeParams += "=" + ApiConfig.SERVICE_KEY;
			
			encodeParams += "&" + URLEncoder.encode("type","UTF-8");
			encodeParams += "=json";
			
			encodeParams += "&" + URLEncoder.encode("tourDestNm", "UTF-8");
			encodeParams += "="+search;
			
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		tourQueryStr += encodeParams;
		log.debug("Tour쿼리 문자열 {}", tourQueryStr);
		
		return tourQueryStr;
	}

}
