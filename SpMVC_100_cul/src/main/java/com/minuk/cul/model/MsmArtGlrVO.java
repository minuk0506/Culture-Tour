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
public class MsmArtGlrVO {
	//박물관, 미술관(위,경도 있음)
	@JsonProperty("totalPage")
	private String totalPage;			// 전체 페이지 수
	@JsonProperty("pageNo")
	private String pageNo;				//	페이지 번호
	@JsonProperty("resultCode")
	private String resultCode;			//	결과코드
	@JsonProperty("totalCount")
	private String totalCount;			//	데이터 총 개수
	@JsonProperty("numOfRows")
	private String numOfRows;			//	한 페이지 결과 수
	@JsonProperty("resultMsg")
	private String resultMsg;			//	결과메세지
	@JsonProperty("id")
	private String id;					//	코드
	@JsonProperty("msmArtGlrNm")
	private String msmArtGlrNm;			//	시설명
	@JsonProperty("operationRuleNm")
	private String operationRuleNm;		//	박물관미술관구분
	@JsonProperty("addrRoad")
	private String addrRoad;			//	소재지 도로명주소
	@JsonProperty("addrJibun")
	private String addrJibun;			//	소재지 지번주소
	@JsonProperty("lat")
	private String lat;					//	위치 좌표 위도
	@JsonProperty("lng")
	private String lng;					//	위치 좌표 경도
	@JsonProperty("operationAgcTel")
	private String operationAgcTel;		//	운영기관전화번호
	@JsonProperty("operationAgcNm")
	private String operationAgcNm;		//	운영기관
	@JsonProperty("homePage")
	private String homePage;			//	운영기관 홈페이지
	@JsonProperty("convFcltInfo")
	private String convFcltInfo;		//	편의시설 정보
	@JsonProperty("weekdayBeginTime")
	private String weekdayBeginTime;	//	평일 관람 시작시각
	@JsonProperty("weekdayEndTime")
	private String weekdayEndTime;		//	평일 관람 종료시각
	@JsonProperty("holidayBeginTime")
	private String holidayBeginTime;	//	공휴일 운영 시작시각
	@JsonProperty("holidayEndTime")
	private String holidayEndTime;		//	공휴일 운영 종료시각
	@JsonProperty("closeInfo")
	private String closeInfo;			//	휴관정보
	@JsonProperty("adultAdmsFee")
	private String adultAdmsFee;		//	어른관람료
	@JsonProperty("youthAdmsFee")
	private String youthAdmsFee;		//	청소년관람료
	@JsonProperty("childAdmsFee")
	private String childAdmsFee;		//	어린이관람료
	@JsonProperty("admsFeeOtherInfo")
	private String admsFeeOtherInfo;	//	관람료기타정보
	@JsonProperty("msmArtGlrIntro")
	private String msmArtGlrIntro;		//	박물관미술관 소개
	@JsonProperty("trafficInfo")
	private String trafficInfo;			//	교통안내 정보
	@JsonProperty("mngAgcTel")
	private String mngAgcTel;			//	관리기관전화번호
	@JsonProperty("mngAgcNm")
	private String mngAgcNm;			//	관리기관
	@JsonProperty("syncTime")
	private String syncTime;			//	데이터기준일자
	

}
