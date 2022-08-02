package com.xworkz.DTO;

import java.io.Serializable;

import com.xwork.Constant.BarType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor




public class BarDTO  implements Serializable{
	
	private Integer id;
	private String barName;
	private String location;
	private BarType type = BarType.DEFAULT;
	private Double avrCollectionPerDay;
	private Double avrCollectionPerMonth;
	
	

	
	
	
}