package com.example.demo2.demo2.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo2.demo2.Service.*;
import com.example.demo2.demo2.values.FundTransferValues;

@RestController

public class FundTransferController {
	@Autowired
	FundTransferService fundTransferService;
	FundTransferValues fundTransferValues;
	
	@GetMapping("/transfer")
	public List<FundTransferValues> FundTrnafer() {
		return fundTransferService.fundstransfer();
	}

	@PostMapping("/post")
	public FundTransferValues posting(@RequestBody  FundTransferValues fundTransferValues){
		return fundTransferService.postTransfer(fundTransferValues);
	}
	
	@PutMapping("/putnew")
	public FundTransferValues puting(@RequestBody FundTransferValues fundTransferValues) {
		return fundTransferService.putTransfer(fundTransferValues);
	}
}
