package com.bookstoresubscriber;

import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import com.bookproducer.BookCartDetail;
import com.bookproducer.BookStoreServicePublish;
import com.cartproducer.CartServicePublish;
import com.discountproducer.BookStoreDiscountPublish;
import com.paymentproducer.PaymentServicePublish;
import com.discountproducer.DiscountDetail;

public class Activator implements BundleActivator {

	ServiceReference serviceReference1, serviceReference2;
	ServiceReference serviceReferencePayment,serviceReferenceDiscount;

	public void start(BundleContext context) throws Exception {
		System.out.println("Start Book Subscriber Service");
		serviceReference1 = context.getServiceReference(BookStoreServicePublish.class.getName());
		BookStoreServicePublish bookStoreServicePublish = (BookStoreServicePublish) context.getService(serviceReference1);
		
		while(true) {
			BookCartDetail respons = bookStoreServicePublish.displayMenu();
	
			String result = respons.getRespons();

			if ("Y".equalsIgnoreCase(result)) {

				serviceReference2 = context.getServiceReference(CartServicePublish.class.getName());
				CartServicePublish cartServicePublisher = (CartServicePublish) context.getService(serviceReference2);
				String cartrespons = cartServicePublisher.cartMenue(respons.getAmount());
				
				if (cartrespons.equals("Y") || cartrespons.equals("y")) {
					serviceReferenceDiscount = context.getServiceReference( BookStoreDiscountPublish.class.getName());
					 BookStoreDiscountPublish  bookStoreDiscountPublisher = ( BookStoreDiscountPublish) context.getService(serviceReferenceDiscount);
					 String discountrespons = bookStoreDiscountPublisher.discountMenu(respons.getAmount());
					
				
	
				if (cartrespons.equals("Y") || cartrespons.equals("y")) {
					
					serviceReferencePayment = context.getServiceReference(PaymentServicePublish.class.getName());
					PaymentServicePublish paymentServicePublish = (PaymentServicePublish) context.getService(serviceReferencePayment);
					boolean isvalid = paymentServicePublish.displayMenuBuy();
	
					System.out.println(isvalid);
					
					if (isvalid == true) {
						System.out.println("Payment Successfully.");
						System.out.println("Thank You. Come Again..");
						System.out.println();
						System.out.println();
					}
				}
				}
	
			}
			System.out.println("Do you want to quit ? (Y/N)");
			Scanner qtsc = new Scanner(System.in);
			String qt =  qtsc.next();
			
			if(qt.equalsIgnoreCase("Y")) {
				System.out.println("Have a nice day !");
				
			}		
		}
		
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Stop Book Subscriber Service, Good Byee!");
		context.ungetService(serviceReference1);
	}

}
