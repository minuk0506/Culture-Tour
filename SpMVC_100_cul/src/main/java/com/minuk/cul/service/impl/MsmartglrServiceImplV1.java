package com.minuk.cul.service.impl;

import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.minuk.cul.config.ApiConfig;
import com.minuk.cul.config.QualifierConfig;
import com.minuk.cul.model.MsmArtGlrVO;
import com.minuk.cul.model.root.GetMsmartglr;
import com.minuk.cul.service.MsmartglrService;
import com.minuk.cul.utils.HttpRequestInterceptorV1;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service(QualifierConfig.SERVICE.MSMARTGLR_V1)
public class MsmartglrServiceImplV1 implements MsmartglrService{

	@Override
	public String MsmartglrQueryStr(String search) {
		
		String msmartglrQueryStr = ApiConfig.API_MSMARTGLR_URL;
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
		
		msmartglrQueryStr += encodeParams;
		log.debug("쿼리 문자열 {}", msmartglrQueryStr);
		
//		ObjectMapper mapper = new ObjectMapper();
//		Map<String, Object> map = new HashMap<String, Object>();
//		try {
//			map = mapper.readValue(msmartglrQueryStr.toString(),  new TypeReference <Map<String,Object>>(){});
//			log.debug("일단 맵 로그 {}",map);
//		} catch (JsonProcessingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		Map<String, Object> getItem = (Map<String, Object>) map.get("MsmArtGlrBaseInfo");
//		log.debug("겟아이템 맵 로그 {}",getItem);
//		List<Map<String , Object>> itemList = (List<Map<String, Object>>) getItem.get("MsmArtGlrBaseInfo");
//		
//		log.debug("박물관 맵 로그 {}",itemList);
		return msmartglrQueryStr;
	}

	@Override
	public List<MsmArtGlrVO> getMsmartglrItems(String queryString) {
		
		URI msmartglrRestURI = null;
		
		try {
			msmartglrRestURI = new URI(queryString);
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
		resString = restTemp.exchange(msmartglrRestURI, HttpMethod.GET, headerEntity, String.class);
		// 수신된 데이터를 VO 로 변환하기
		ResponseEntity<GetMsmartglr> resMsmartglrObject = null;
		
		// RestTemplate 이 수신한 데이터를 중간에 가로채서 조작하기
		restTemp.getInterceptors().add(new HttpRequestInterceptorV1());
		resMsmartglrObject = restTemp.exchange(msmartglrRestURI, HttpMethod.GET, headerEntity, GetMsmartglr.class);
		
//		ObjectMapper mapper = new ObjectMapper();
//		Map<String, Object> map = new HashMap<String, Object>();
//		map = objectMapper.readValue(MsmartglrQueryStr(queryString).toString(),  new TypeReference <Map<String,Object>>(){});
//		List<Map<String , Object>> itemList = (List<Map<String, Object>>) MsmArtGlrVO.class;
//		log.debug("박물관 맵 로그 {}",map);
		
//		MultiValueMap<String, Object> msmMap = new LinkedMultiValueMap<>();
//		msmMap = (MultiValueMap<String, Object>) restTemp.exchange(msmartglrRestURI, HttpMethod.GET, headerEntity, GetMsmartglr.class);
//		log.debug("맵 로그 {}", msmMap);
		return resMsmartglrObject.getBody().MsmArtGlrBaseInfo;
	}

}
