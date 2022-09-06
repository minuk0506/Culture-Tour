package com.minuk.cul.model.root;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.minuk.cul.model.RuinsVO;
import com.minuk.cul.model.TourVO;
import com.minuk.cul.model.root.GetMsmartglr.Header;

import lombok.ToString;

@ToString
public class GetRuins {

	@JsonProperty("LocalCultHeritBaseInfo")
	public List<RuinsVO> LocalCultHeritBaseInfo;
	
	@JsonProperty("header")
	public Header header;
	
	public class Header{
		public String totalPage;
		public String pageNo;
		public String resultCode;
		public String totalCount;
		public String numOfRows;
		public String resultMsg;
	}
}
