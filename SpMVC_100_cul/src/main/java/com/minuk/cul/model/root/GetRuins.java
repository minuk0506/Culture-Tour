package com.minuk.cul.model.root;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.minuk.cul.model.RuinsVO;
import com.minuk.cul.model.TourVO;

import lombok.ToString;

@ToString
public class GetRuins {

	@JsonProperty("LocalCultHeritBaseInfo")
	public List<RuinsVO> LocalCultHeritBaseInfo;
	
}
