package com.supperarrow.api.base;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.supperarrow.api.model.Order;
import com.supperarrow.api.model.OrderType;
import com.supperarrow.api.model.Transaction;

public class UserAPI {
	
	public static long registerUser(String userName, String password) {
		
		return -1;
	}
	
	
	public static long checkUser(String userName, String password) {
		
		return -1;
	}

	
	public static boolean createOrder(long userId, long stockId, long quantity, OrderType type) {
		
		
		return false;
	}
	
	public static boolean cancelOrder(long userId, long orderId) {
		
		
		return false;
	}
	
	public static List<Order> getUserOrder(long userId, long stockId, OrderType type) {
		List<Order> result = new ArrayList<Order>();
		
		
		return result;
		
	}
	
	public static List<Order> getUserOrder(long userId, OrderType type) {
		List<Order> result = new ArrayList<Order>();
		
		
		return result;
		
	}
	
	public static List<Transaction> getTransHistory(long userId, long start, long length) {
		List<Transaction> result = new ArrayList<Transaction>();
		
		
		return result;
	}
	
	public static List<Transaction> getTransHistory(long userId, long stockId, long start, long length) {
		List<Transaction> result = new ArrayList<Transaction>();
		
		
		return result;
	}
	
	public static Map<Long, Long> getUserStock(long userId) {
		Map<Long, Long> result = new HashMap<Long, Long>();
		
		
		return result;
	}
	
	public static long getUserMoney(long userId) {
		
		return 0;
	}
	
}
