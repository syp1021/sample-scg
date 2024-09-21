package com.sample.scg.delivery.task.deliveryprocess.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.scg.delivery.task.deliveryprocess.vo.OrderInfo;

@RestController
@RequestMapping("/delivery")
public class DeliveryController {

	@GetMapping("/test")
	public String test() {
		return "ORDER RECEIPT SUCCESS";
	}
	
	@PostMapping("/receipt")
	public String orderReceipt(@RequestBody OrderInfo orderInfo) {
		return "";
	}
}
