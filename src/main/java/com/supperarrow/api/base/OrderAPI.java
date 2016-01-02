package com.supperarrow.api.base;


import com.supperarrow.api.model.Order;

public class OrderAPI {
	
	public static long createOrder(long userId, long stockId, long quantity, long timeStamp) {
		
		return -1;
	}
	
	public static boolean cancelOrder(long orderId) {
		
		return false;
	}
	
	public static Order getOrder(long orderId) {
		
		Order result = new Order();
		
		
		return result;
	}
	
	
	public static boolean finishOrder(long orderId) {
		return true;
	}
	
	public static boolean updateOrder(long orderId, long quantity) {
		
		return true;
	}
	


}
