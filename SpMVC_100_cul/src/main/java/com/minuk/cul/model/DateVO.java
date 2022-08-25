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
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DateVO {

	private String year;
	private String month;
	private String date;
	private String dateValue;
	private String schedule;
	private String schedule_detail;
	
}
