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
public class MsmArtGlrVO {
	//박물관, 미술관(위,경도 있음)
	private String totalPage;			// 전체 페이지 수
	private String pageNo;				//	페이지 번호
	private String resultCode;			//	결과코드
	private String totalCount;			//	데이터 총 개수
	private String numOfRows;			//	한 페이지 결과 수
	private String resultMsg;			//	결과메세지
	private String id;					//	코드
	private String msmArtGlrNm;			//	시설명
	private String operationRuleNm;		//	박물관미술관구분
	private String addrRoad;			//	소재지 도로명주소
	private String addrJibun;			//	소재지 지번주소
	private String lat;					//	위치 좌표 위도
	private String lng;					//	위치 좌표 경도
	private String operationAgcTel;		//	운영기관전화번호
	private String operationAgcNm;		//	운영기관
	private String homePage;			//	운영기관 홈페이지
	private String convFcltInfo;		//	편의시설 정보
	private String weekdayBeginTime;	//	평일 관람 시작시각
	private String weekdayEndTime;		//	평일 관람 종료시각
	private String holidayBeginTime;	//	공휴일 운영 시작시각
	private String holidayEndTime;		//	공휴일 운영 종료시각
	private String closeInfo;			//	휴관정보
	private String adultAdmsFee;		//	어른관람료
	private String youthAdmsFee;		//	청소년관람료
	private String childAdmsFee;		//	어린이관람료
	private String admsFeeOtherInfo;	//	관람료기타정보
	private String msmArtGlrIntro;		//	박물관미술관 소개
	private String trafficInfo;			//	교통안내 정보
	private String mngAgcTel;			//	관리기관전화번호
	private String mngAgcNm;			//	관리기관
	private String syncTime;			//	데이터기준일자

}
