package com.minuk.cul.model.root;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.minuk.cul.model.EventVO;

import lombok.ToString;

@ToString
public class GetEvent {

	@JsonProperty("EventBaseInfo")
	public List<EventVO> EventBaseInfo;
	
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
