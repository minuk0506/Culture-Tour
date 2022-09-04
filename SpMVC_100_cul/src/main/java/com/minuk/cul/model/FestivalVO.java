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
public class FestivalVO {
	// 축제정보
	@JsonProperty("totalPage")
	private String totalPage;			//전체 페이지 수
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
	@JsonProperty("festivalNm")
	private String festivalNm;			//	축제명
	@JsonProperty("festivalVenue")
	private String festivalVenue;		//	개최장소
	@JsonProperty("festivalBeginDate")
	private String festivalBeginDate;	//	축제 시작일자
	@JsonProperty("festivalEndDate")
	private String festivalEndDate;		//	축제 종료일자
	@JsonProperty("festivalInfo")
	private String festivalInfo;		//	축제 내용
	@JsonProperty("manageAgcNm")
	private String manageAgcNm;			//	주관기관
	@JsonProperty("auspiceAgcNm")
	private String auspiceAgcNm;		//	주최기관
	@JsonProperty("sponsorAgcNm")
	private String sponsorAgcNm;		//	후원기관
	@JsonProperty("tel")
	private String tel;					//	전화번호
	@JsonProperty("homePage")
	private String homePage;			//	홈페이지주소
	@JsonProperty("relatedInfo")
	private String relatedInfo;			//	관련정보
	@JsonProperty("addrRoad")
	private String addrRoad;			//	소재지 도로명주소
	@JsonProperty("addrJibun")
	private String addrJibun;			//	소재지 지번주소
	@JsonProperty("lat")
	private String lat;					//	위치 좌표 위도
	@JsonProperty("lng")
	private String lng;					//	위치 좌표 경도
	@JsonProperty("syncTime")
	private String syncTime;			//	데이터기준일자

}
