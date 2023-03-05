package com.cartproducer;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {

	ServiceRegistration publishServiceRegistrion;
	
	public void start(BundleContext context) throws Exception {
		CartServicePublish cartpublisherService = new CartServicePublishImpl();
		publishServiceRegistrion = context.registerService(CartServicePublish.class.getName(), cartpublisherService, null);
		System.out.println("Start Cart Service");
	}

	public void stop(BundleContext context) throws Exception {
		publishServiceRegistrion.unregister();
		System.out.println("Stop Cart Service");
	}

}
