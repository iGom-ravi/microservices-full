package com.example.demo2.demo2.values;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class FundTransferValues {
	
	
	@Id
	@GeneratedValue
	private int accNum;
	private int recAccNum;
	private int amount;
	private int rAmount;
	private int sentAmount;
	private int sRecAccBal;
	private int rRecAccBal;
	
	public FundTransferValues() {
		super();
		
	}
	
	public FundTransferValues(int accNum, int recAccNum, int amount, int rAmount, int sentAmount, int sRecAccBal,
			int rRecAccBal) {
		super();
		this.accNum = accNum;
		this.recAccNum = recAccNum;
		this.amount = amount;
		this.rAmount = rAmount;
		this.sentAmount = sentAmount;
		this.sRecAccBal = sRecAccBal;
		this.rRecAccBal = rRecAccBal;
	}

	public int getrAmount() {
		return rAmount;
	}
	public void setrAmount(int rAmount) {
		this.rAmount = rAmount;
	}
	public int getsRecAccBal() {
		return sRecAccBal;
	}
	public void setsRecAccBal(int sRecAccBal) {
		this.sRecAccBal = sRecAccBal;
	}
	public int getrRecAccBal() {
		return rRecAccBal;
	}
	public void setrRecAccBal(int rRecAccBal) {
		this.rRecAccBal = rRecAccBal;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getSentAmount() {
		return sentAmount;
	}
	public void setSentAmount(int sentAmount) {
		this.sentAmount = sentAmount;
	}
	public int getAccNum() {
		return accNum;
	}
	public void setAccNum(int accNum) {
		this.accNum = accNum;
	}
	public int getRecAccNum() {
		return recAccNum;
	}
	public void setRecAccNum(int recAccNum) {
		this.recAccNum = recAccNum;
	}
	
	

}
