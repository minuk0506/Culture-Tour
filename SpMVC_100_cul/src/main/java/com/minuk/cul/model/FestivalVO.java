package com.minuk.cul.model;

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
	private String totalPage;			//전체 페이지 수
	private String pageNo;				//	페이지 번호
	private String resultCode;			//	결과코드
	private String totalCount;			//	데이터 총 개수
	private String numOfRows;			//	한 페이지 결과 수
	private String resultMsg;			//	결과메세지
	private String id;					//	코드
	private String festivalNm;			//	축제명
	private String festivalVenue;		//	개최장소
	private String festivalBeginDate;	//	축제 시작일자
	private String festivalEndDate;		//	축제 종료일자
	private String festivalInfo;		//	축제 내용
	private String manageAgcNm;			//	주관기관
	private String auspiceAgcNm;		//	주최기관
	private String sponsorAgcNm;		//	후원기관
	private String tel;					//	전화번호
	private String homePage;			//	홈페이지주소
	private String relatedInfo;			//	관련정보
	private String addrRoad;			//	소재지 도로명주소
	private String addrJibun;			//	소재지 지번주소
	private String lat;					//	위치 좌표 위도
	private String lng;					//	위치 좌표 경도
	private String syncTime;			//	데이터기준일자

}
