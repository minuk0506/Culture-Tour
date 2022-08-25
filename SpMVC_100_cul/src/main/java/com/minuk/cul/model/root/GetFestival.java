package com.minuk.cul.model.root;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.minuk.cul.model.FestivalVO;

import lombok.ToString;

@ToString
public class GetFestival {

	@JsonProperty("FestivalBaseInfo")
	public List<FestivalVO> FestivalBaseInfo;
	
}
