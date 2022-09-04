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
public class RuinsVO {
	//향토문화유적(위,경도 있음)
	@JsonProperty("totalPage")
	private String totalPage;				//전체 페이지 수
	@JsonProperty("pageNo")
	private String pageNo;					//	페이지 번호
	@JsonProperty("resultCode")
	private String resultCode;				//	결과코드
	@JsonProperty("totalCount")
	private String totalCount;				//	데이터 총 개수
	@JsonProperty("numOfRows")
	private String numOfRows;				//	한 페이지 결과 수
	@JsonProperty("resultMsg")
	private String resultMsg;				//	결과메세지
	@JsonProperty("id")
	private String id;						//	코드
	@JsonProperty("localCultHeritNm")
	private String localCultHeritNm;		//	향토문화유적명
	@JsonProperty("localCultHeritCode")
	private String localCultHeritCode;		//	향토문화유적지정번호
	@JsonProperty("classifiLocalCultHeri")
	private String classifiLocalCultHeri;	//	향토문화유적구분
	@JsonProperty("localCultHeritTypeNm")
	private String localCultHeritTypeNm;	//	향토문화유적종류
	@JsonProperty("addrRoad")
	private String addrRoad;				//	소재지 도로명주소
	@JsonProperty("addrJibun")
	private String addrJibun;				//	소재지 지번주소
	@JsonProperty("lat")
	private String lat;						//	위치 좌표 위도
	@JsonProperty("lng")
	private String lng;						//	위치 좌표 경도
	@JsonProperty("dsgnDate")
	private String dsgnDate;				//	지정일자
	@JsonProperty("operationRuleNm")
	private String operationRuleNm;			//	소유주체 구분
	@JsonProperty("ownerNm")
	private String ownerNm;					//	소유자명
	@JsonProperty("scale")
	private String scale;					//	규모
	@JsonProperty("eraCreation")
	private String eraCreation;				//	조성시대
	@JsonProperty("photo")
	private String photo;					//	이미지 정보
	@JsonProperty("localCultHeritIntro")
	private String localCultHeritIntro;		//	향토문화유적 소개
	@JsonProperty("mngAgcTel")
	private String mngAgcTel;				//	관리기관전화번호
	@JsonProperty("mngAgcNm")
	private String mngAgcNm;				//	관리기관
	@JsonProperty("syncTime")
	private String syncTime;				//	데이터기준일자

}
