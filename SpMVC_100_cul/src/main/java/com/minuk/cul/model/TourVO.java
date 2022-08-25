package com.minuk.cul.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TourVO {
	//관광지(위,경도 있음)
	@JsonProperty("totalPage")
	private String totalPage;				//전체 페이지 수
	
	@JsonProperty("pageNo")
	private String pageNo;					//페이지 번호
	
	@JsonProperty("resultCode")
	private String resultCode;				//결과코드
	
	@JsonProperty("totalCount")
	private String totalCount;				//데이터 총 개수
	
	@JsonProperty("numOfRows")
	private String numOfRows;				//한 페이지 결과 수
	
	@JsonProperty("resultMsg")
	private String resultMsg;				//결과메세지
	
	@JsonProperty("id")
	private String id;						//코드
	
	@JsonProperty("tourDestNm")
	private String tourDestNm;				//관광지명
	
	@JsonProperty("operationRuleNm")
	private String operationRuleNm;			//관광지 구분
	
	@JsonProperty("addrRoad")
	private String addrRoad;				//소재지 도로명주소
	
	@JsonProperty("addrJibun")
	private String addrJibun;				//소재지 지번주소
	
	@JsonProperty("lat")
	private String lat;						//위치 좌표 위도
	
	@JsonProperty("lng")
	private String lng;						//위치 좌표 경도
	
	@JsonProperty("area")
	private String area;					//면적
	
	@JsonProperty("publicConvFcltInfo")
	private String publicConvFcltInfo;		//공공편익시설 정보
	
	@JsonProperty("accomInfo")
	private String accomInfo;				//숙박시설 정보
	
	@JsonProperty("sportsEnterFcltInfo")
	private String sportsEnterFcltInfo;		//운동 및 오락시설 정보
	
	@JsonProperty("recreationalCultFcltInfo")
	private String recreationalCultFcltInfo;//휴양 및 문화시설 정보
	
	@JsonProperty("hospitalityFcltInfo")
	private String hospitalityFcltInfo;		//접객시설 정보
	
	@JsonProperty("supportFcltInfo")
	private String supportFcltInfo;			//지원시설 정보
	
	@JsonProperty("dsgnDate")
	private String dsgnDate;				//지정일자
	
	@JsonProperty("capacity")
	private String capacity;				//수용인원수
	
	@JsonProperty("availParkingCnt")
	private String availParkingCnt;			//주차가능수
	
	@JsonProperty("tourDestIntro")
	private String tourDestIntro;			//관광지소개
	
	@JsonProperty("mngAgcTel")
	private String mngAgcTel;				//관리기관전화번호
	
	@JsonProperty("mngAgcNm")
	private String mngAgcNm;				//관리기관
	
	@JsonProperty("syncTime")
	private String syncTime;				//데이터기준일자

}
