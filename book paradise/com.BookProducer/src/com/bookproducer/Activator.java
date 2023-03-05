package com.bookproducer;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {

	ServiceRegistration publishServiceRegistrion;
    @Override
	public void start(BundleContext context) throws Exception {		
		BookStoreServicePublish publisherService = new BookStoreServicePublishImpl();
		publishServiceRegistrion = context.registerService(BookStoreServicePublish.class.getName(), publisherService, null);
		System.out.println("Start Book Store Service");
		
	}
    
    @Override
	public void stop(BundleContext context) throws Exception {
		
		System.out.println("Publisher Stop");
		publishServiceRegistrion.unregister();
		System.out.println("Stop Book Store Service");

    }
}
