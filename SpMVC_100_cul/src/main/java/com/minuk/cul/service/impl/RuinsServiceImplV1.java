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
import com.minuk.cul.model.RuinsVO;
import com.minuk.cul.model.root.GetRuins;
import com.minuk.cul.service.RuinsService;
import com.minuk.cul.utils.HttpRequestInterceptorV1;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service(QualifierConfig.SERVICE.RUINS_V1)
public class RuinsServiceImplV1 implements RuinsService{

	@Override
	public String RuinsQueryStr(String search) {
		
		String RuinsQueryStr = ApiConfig.API_RUINS_URL;
		String encodeParams = null;
		
		try {
			encodeParams = "?" + URLEncoder.encode("serviceKey","UTF-8");
			encodeParams += "=" + ApiConfig.SERVICE_KEY;
			
			encodeParams += "&" + URLEncoder.encode("type","UTF-8");
			encodeParams += "=json";
			
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		RuinsQueryStr += encodeParams;
		log.debug("쿼리 문자열 {}", RuinsQueryStr);
		
		return RuinsQueryStr;
	}

	@Override
	public List<RuinsVO> getRuinsItems(String queryString) {
		
		URI RuinsRestURI = null;
		
		try {
			RuinsRestURI = new URI(queryString);
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// API 에 JSON type 으로 데이터를 요청하기 위한 헤더 생성
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		
		HttpEntity<String> headerEntity = new HttpEntity<String>("parameter",headers);
		
		// 데이터를 수신하여 VO 로 변환하기 위한 객체 선언
		RestTemplate restTemp = new RestTemplate();
		
		// String type 으로 데이터를 수신하여 어떤형태로
		// 데이터가 수신되는지 확인하는 절차
		ResponseEntity<String> resString = null;
		resString = restTemp.exchange(RuinsRestURI, HttpMethod.GET, headerEntity, String.class);
		
		log.debug("=".repeat(100));
		log.debug("{}",resString.getBody());
		log.debug("=".repeat(100));
		
		// 수신된 데이터를 VO 로 변환하기
		ResponseEntity<GetRuins> resRuinsObject = null;
		
		// RestTemplate 이 수신한 데이터를 중간에 가로채서 조작하기
		restTemp.getInterceptors().add(new HttpRequestInterceptorV1());
		resRuinsObject = restTemp.exchange(RuinsRestURI, HttpMethod.GET, headerEntity, GetRuins.class);
		
		log.debug("수신된 데이터 {}", resRuinsObject.getBody().LocalCultHeritBaseInfo);
		
		return resRuinsObject.getBody().LocalCultHeritBaseInfo;
	}

}
