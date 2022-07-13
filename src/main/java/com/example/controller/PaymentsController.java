package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment-provider")
public class PaymentsController {
	
	@GetMapping("/paynow/{dueAmount}")
	public String payNow(@PathVariable("dueAmount") double price) {
		return "payment due: "+price;
	}

}
