package com.discountproducer;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;


public class Activator implements BundleActivator {

	ServiceRegistration publishServiceRegistrion;
    @Override
	public void start(BundleContext context) throws Exception {		
		BookStoreDiscountPublish discountpublisherService = new BookStoreDiscountPublishImpl();
		publishServiceRegistrion = context.registerService(BookStoreDiscountPublish.class.getName(), discountpublisherService, null);
		System.out.println("Start Discount Service");
		
	}
    
    @Override
	public void stop(BundleContext context) throws Exception {
		
		System.out.println("Publisher Stop");
		publishServiceRegistrion.unregister();
		System.out.println("Stop Discount Service");

    }

}
