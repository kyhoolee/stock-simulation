package com.supperarrow.api.base;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.supperarrow.api.model.Transaction;

public class StockAPI {

	public static long registerStock(String stockCode) {
		return -1;
	}
	
	public static boolean setStockData(Map<String, String> data) {
		
		return false;
	}
	
	public static long getQuantity(long stockId) {
		return 0;
	}
	
	public static boolean setQuantity(long stockId) {
		
		return false;
	}
	
	public static long getPrefPrice(long stockId) {
		
		return -1;
	}
	
	public static boolean setPrefPrice(long stockId) {
		
		return false;
	}
	
	public static Map<Long, Long> getPriceHistory(long stockId) {
		Map<Long, Long> result = new HashMap<Long, Long>();
		
		return result;
	}
	
	public static List<Transaction> getTransHistory(long stockId) {
		List<Transaction> result = new ArrayList<Transaction>();
		
		return result;
	}
	
	
}
