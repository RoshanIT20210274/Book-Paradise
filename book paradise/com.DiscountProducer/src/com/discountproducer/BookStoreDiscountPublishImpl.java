package com.discountproducer;

import java.util.HashMap;
import java.util.Scanner;

public class BookStoreDiscountPublishImpl implements BookStoreDiscountPublish {
	
	public String discountMenu(int total) {	
		System.out.print("If the total amount is more than 1500? (Y/N): ");
		Scanner disRes = new Scanner(System.in);
		String disResponse = disRes.next();
		if(total>=1500) {
		System.out.println("Your discout is : Rs." +(total*10/100));
		System.out.println("Your total is is : Rs." +(total-(total*10/100)));
		}
		return disResponse;
		
	}
			
	

	
}
