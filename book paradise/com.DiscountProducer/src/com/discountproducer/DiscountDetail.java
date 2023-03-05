package com.discountproducer;

public class DiscountDetail {

	String respons;
	int amount;
	
	public DiscountDetail(String respons, int amount) {
		super();
		this.respons = respons;
		this.amount = amount;
	}

	public String getRespons() {
		return respons;
	}

	public void setRespons(String respons) {
		this.respons = respons;
	}

	public int getAmount() {
		return amount * 10/100;
	}

	public void setAmount(int amount) {
		this.amount = amount * 10/100;
	}
	
}
