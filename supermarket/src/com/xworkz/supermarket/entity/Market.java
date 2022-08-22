package com.xworkz.supermarket.entity;

import java.time.LocalDateTime;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString


public class Market {

	private LocalDateTime createdDate;
	private String createdBy;
	private LocalDateTime updatedDate;
	private String updatedBy;
	
}
