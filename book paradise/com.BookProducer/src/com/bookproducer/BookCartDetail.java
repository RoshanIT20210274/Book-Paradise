package com.bookproducer;

public class BookCartDetail {

	String respons;
	int amount;
	
	public BookCartDetail(String respons, int amount) {
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
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
}
