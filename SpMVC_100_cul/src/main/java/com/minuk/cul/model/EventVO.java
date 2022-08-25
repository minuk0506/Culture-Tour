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
public class EventVO {
	// 행사, 공연정보
	private String totalPage;			//	전체 페이지 수
	private String pageNo;				//	페이지 번호
	private String resultCode;			//	결과코드
	private String totalCount;			//	데이터 총 개수
	private String numOfRows;			//	한 페이지 결과 수
	private String resultMsg;			//	결과메세지
	private String id;					//	코드
	private String eventNm;				//	행사명
	private String eventVenue;			//	장소
	private String eventInfo;			//	행사내용
	private String eventBeginDate;		//	행사 시작일자
	private String eventEndDate;		//	행사 종료일자
	private String eventBeginTime;		//	행사 시작시각
	private String eventEndTime;		//	행사 종료시각
	private String payYn;				//	요금정보
	private String manageAgcNm;			//	주관기관
	private String auspiceAgcNm;		//	주최기관
	private String tel;					//	전화번호
	private String sponsorAgcNm;		//	후원기관
	private String seatCount;			//	객석수
	private String price;				//	관람요금
	private String enterAge;			//	입장연령
	private String discountInfo;		//	할인정보
	private String notice;				//	유의사항
	private String homePage;			//	홈페이지주소
	private String rsrvtInfo;			//	예매정보
	private String parkingLotAvail;		//	주차장보유여부
	private String addrRoad;			//	소재지 도로명 주소
	private String addrJibun;			//	소재지 지번 주소
	private String lat;					//	위치 좌표 위도
	private String lng;					//	위치 좌표 경도
	private String syncTime;			//	데이터기준일자

}
