package com.minuk.cul.model.root;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.ToString;

@ToString
public class ApiRoot {

	
	@JsonProperty("getTour")
	public GetTour getTour;
	
	@JsonProperty("getRuins")
	public GetRuins getRuins;
	
	@JsonProperty("getMsmartglr")
	public GetMsmartglr getMsmartglr;
	
	@JsonProperty("getFestival")
	public GetFestival getFestival;
	
	@JsonProperty("getEvent")
	public GetEvent getEvent;
}
