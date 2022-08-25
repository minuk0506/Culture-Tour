package com.minuk.cul.model.root;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.minuk.cul.model.EventVO;

import lombok.ToString;

@ToString
public class GetEvent {

	@JsonProperty("EventBaseInfo")
	public List<EventVO> EventBaseInfo;
	
}
