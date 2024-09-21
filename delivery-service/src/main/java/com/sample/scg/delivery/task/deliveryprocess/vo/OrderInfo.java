package com.sample.scg.delivery.task.deliveryprocess.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderInfo {
	
	private int orderNo;
	private int userId;
	private String userName;
	private String phoneNo;
	private String Address;
	private int productId;
	private String productName;

}
