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
public class RuinsVO {
	//향토문화유적(위,경도 있음)
	private String totalPage;				//전체 페이지 수
	private String pageNo;					//	페이지 번호
	private String resultCode;				//	결과코드
	private String totalCount;				//	데이터 총 개수
	private String numOfRows;				//	한 페이지 결과 수
	private String resultMsg;				//	결과메세지
	private String id;						//	코드
	private String localCultHeritNm;		//	향토문화유적명
	private String localCultHeritCode;		//	향토문화유적지정번호
	private String classifiLocalCultHeri;	//	향토문화유적구분
	private String localCultHeritTypeNm;	//	향토문화유적종류
	private String addrRoad;				//	소재지 도로명주소
	private String addrJibun;				//	소재지 지번주소
	private String lat;						//	위치 좌표 위도
	private String lng;						//	위치 좌표 경도
	private String dsgnDate;				//	지정일자
	private String operationRuleNm;			//	소유주체 구분
	private String ownerNm;					//	소유자명
	private String scale;					//	규모
	private String eraCreation;				//	조성시대
	private String photo;					//	이미지 정보
	private String localCultHeritIntro;		//	향토문화유적 소개
	private String mngAgcTel;				//	관리기관전화번호
	private String mngAgcNm;				//	관리기관
	private String syncTime;				//	데이터기준일자

}
