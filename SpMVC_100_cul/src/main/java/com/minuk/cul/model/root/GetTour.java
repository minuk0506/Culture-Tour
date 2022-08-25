package com.minuk.cul.model.root;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.minuk.cul.model.TourVO;

import lombok.ToString;

@ToString
public class GetTour {

	@JsonProperty("TourDestBaseInfo")
	public List<TourVO> TourDestBaseInfo;
	
}
