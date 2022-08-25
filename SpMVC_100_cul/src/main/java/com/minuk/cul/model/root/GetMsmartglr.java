package com.minuk.cul.model.root;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.minuk.cul.model.MsmArtGlrVO;

import lombok.ToString;

@ToString
public class GetMsmartglr {

	@JsonProperty("MsmArtGlrBaseInfo")
	public List<MsmArtGlrVO> MsmArtGlrBaseInfo;
	
}
