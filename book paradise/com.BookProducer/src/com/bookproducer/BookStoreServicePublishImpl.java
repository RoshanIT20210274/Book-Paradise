package com.bookproducer;

import java.util.HashMap;
import java.util.Scanner;


public class BookStoreServicePublishImpl implements BookStoreServicePublish{
	
	public BookCartDetail displayMenu() {
		String con = "Y";
		int amount = 0;

			System.out.println("Book Publisher start");
			System.out.println("######################################################################");
			System.out.println("########--------Welcome to Book Paradise--------######################");
			System.out.println("########---------------Book List----------------######################");
			System.out.println("########----------------------------------------######################");
			System.out.println("මඩොල් දූව							           =1");
			System.out.println("The White Queen						           =2");
			System.out.println("A Gentleman in Moscow					           =3");
			System.out.println("චරිත තුනක්						                   =4");
			System.out.println("The Constant Princess					           =5");
			System.out.println("ගම්පෙරළිය							           =6");
			System.out.println("මඟුල් කෑම							           =7");
			System.out.println("සුනඛ ශාපය සහ හොඳම ෂර්ලොක් හෝම්ස් කථා			           =8");
			System.out.println("බව තරණය						                   =9");
			System.out.println("විජයබා කොල්ලය						           =10");
			System.out.println("########------------End Of Book List------------######################");
			System.out.println("######################################################################");

			String conBuy = "N";
			while (conBuy.equalsIgnoreCase("N")) {

				System.out.print("Enter Book Number :");
				Scanner optionKey = new Scanner(System.in);
				int selector = optionKey.nextInt();

				HashMap priceMap = new HashMap();
				priceMap.put(1, 1500);
				priceMap.put(2, 1200);
				priceMap.put(3, 1500);
				priceMap.put(4, 1400);
				priceMap.put(5, 1800);
				priceMap.put(6, 1500);
				priceMap.put(7, 1350);
				priceMap.put(8, 1800);
				priceMap.put(9, 1250);
				priceMap.put(10,1350);

				switch (selector) {

				case 1:
					amount = amount + (Integer)priceMap.get(1);
					System.out.println("Book Price : "+ priceMap.get(1));
					break;

				case 2:
					amount = amount + (Integer)priceMap.get(2);
					System.out.println("Book Price : "+ priceMap.get(2));
					break;

				case 3:
					amount = amount + (Integer)priceMap.get(3);
					System.out.println("Book Price : "+ priceMap.get(3));
					break;

				case 4:
					amount = amount + (Integer)priceMap.get(4);
					System.out.println("Book Price : "+ priceMap.get(4));
					break;
				case 5:
					amount = amount + (Integer)priceMap.get(5);
					System.out.println("Book Price : "+ priceMap.get(5));
					break;

				case 6:
					amount = amount + (Integer)priceMap.get(6);
					System.out.println("Book Price : "+ priceMap.get(6));
					break;
					
				case 7:
					amount = amount + (Integer)priceMap.get(7);
					System.out.println("Book Price : "+ priceMap.get(7));
					break;
					
				case 8:
					amount = amount + (Integer)priceMap.get(8);
					System.out.println("Book Price : "+ priceMap.get(8));
					break;

				case 9:
					amount = amount + (Integer)priceMap.get(9);
					System.out.println("Book Price : "+ priceMap.get(9));
					break;
					
				case 10:
					amount = amount + (Integer)priceMap.get(10);
					System.out.println("Book Price : "+ priceMap.get(10));
					break;


				default:
					System.out.println("Invalid Book number. Please enter valid number");
					continue;
				}
				
				System.out.print("Do you Want to ADD To Cart? (Y/N): ");
				Scanner contuBUY = new Scanner(System.in);
				
				conBuy = contuBUY.next();
			}
		
			return new BookCartDetail(conBuy, amount);
	}


}
