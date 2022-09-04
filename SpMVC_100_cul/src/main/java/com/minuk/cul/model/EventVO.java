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
public class EventVO {
	// 행사, 공연정보
	@JsonProperty("totalPage")
	private String totalPage;			//	전체 페이지 수
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
	@JsonProperty("eventNm")
	private String eventNm;				//	행사명
	@JsonProperty("eventVenue")
	private String eventVenue;			//	장소
	@JsonProperty("eventInfo")
	private String eventInfo;			//	행사내용
	@JsonProperty("eventBeginDate")
	private String eventBeginDate;		//	행사 시작일자
	@JsonProperty("eventEndDate")
	private String eventEndDate;		//	행사 종료일자
	@JsonProperty("eventBeginTime")
	private String eventBeginTime;		//	행사 시작시각
	@JsonProperty("eventEndTime")
	private String eventEndTime;		//	행사 종료시각
	@JsonProperty("payYn")
	private String payYn;				//	요금정보
	@JsonProperty("manageAgcNm")
	private String manageAgcNm;			//	주관기관
	@JsonProperty("auspiceAgcNm")
	private String auspiceAgcNm;		//	주최기관
	@JsonProperty("tel")
	private String tel;					//	전화번호
	@JsonProperty("sponsorAgcNm")
	private String sponsorAgcNm;		//	후원기관
	@JsonProperty("seatCount")
	private String seatCount;			//	객석수
	@JsonProperty("price")
	private String price;				//	관람요금
	@JsonProperty("enterAge")
	private String enterAge;			//	입장연령
	@JsonProperty("discountInfo")
	private String discountInfo;		//	할인정보
	@JsonProperty("notice")
	private String notice;				//	유의사항
	@JsonProperty("homePage")
	private String homePage;			//	홈페이지주소
	@JsonProperty("rsrvtInfo")
	private String rsrvtInfo;			//	예매정보
	@JsonProperty("parkingLotAvail")
	private String parkingLotAvail;		//	주차장보유여부
	@JsonProperty("addrRoad")
	private String addrRoad;			//	소재지 도로명 주소
	@JsonProperty("addrJibun")
	private String addrJibun;			//	소재지 지번 주소
	@JsonProperty("lat")
	private String lat;					//	위치 좌표 위도
	@JsonProperty("lng")
	private String lng;					//	위치 좌표 경도
	@JsonProperty("syncTime")
	private String syncTime;			//	데이터기준일자

}
