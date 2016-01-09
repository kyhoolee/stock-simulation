package com.supperarrow.service.jetty;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;


public class StockApplication extends Application {
	private Set<Object> singletons = new HashSet<Object>();
	private Set<Class<?>> empty = new HashSet<Class<?>>();

	public StockApplication() {
		singletons.add(new StockResource());
		singletons.add(new UserResource());
	}

	@Override
	public Set<Class<?>> getClasses() {
		return empty;
	}

	@Override
	public Set<Object> getSingletons() {
		return singletons;
	}
}
