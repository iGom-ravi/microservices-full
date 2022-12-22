package com.example.demo2.demo2.Service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo2.demo2.repository.FundTransferRepository;
import com.example.demo2.demo2.values.FundTransferValues;

@Service
public class FundTransferService {
	@Autowired
	FundTransferRepository fundTransferRepository;
	FundTransferValues fundTransferValues;
	
	public List<FundTransferValues> fundstransfer() {
		return fundTransferRepository.findAll();
		
	}
	public FundTransferValues postTransfer(FundTransferValues fundTransferValues) {
		return fundTransferRepository.save(fundTransferValues);
		
	}
	public FundTransferValues putTransfer(FundTransferValues fundTransferValues) {
		return fundTransferRepository.save(fundTransferValues);
		
	}	
}
