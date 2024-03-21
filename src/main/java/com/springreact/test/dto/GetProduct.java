package com.springreact.test.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
// para utilizar el patron builder
@Builder
public class GetProduct {

	private long productId;
	
	private String productName;
	
	private String creationDate;
	
	private GetCategory productCategory; 
	
}
