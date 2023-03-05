package com.cartproducer;

import java.util.Scanner;

public class CartServicePublishImpl implements CartServicePublish{

	public String cartMenue(int total) {
		
		System.out.println("Your total cost is : Rs." +total);
		
		System.out.print("Do you want to buy Books? (Y/N): ");
		Scanner buyRes = new Scanner(System.in);
		String buyResponse = buyRes.next();
		return buyResponse;
		
	}
}
