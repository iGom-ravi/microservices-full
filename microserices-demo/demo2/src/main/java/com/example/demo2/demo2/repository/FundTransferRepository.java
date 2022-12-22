package com.example.demo2.demo2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo2.demo2.values.FundTransferValues;

public interface FundTransferRepository extends JpaRepository<FundTransferValues,Integer>{

}
