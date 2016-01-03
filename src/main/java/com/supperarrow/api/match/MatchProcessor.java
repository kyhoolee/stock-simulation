package com.supperarrow.api.match;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.supperarrow.api.base.MarketAPI;
import com.supperarrow.api.model.Order;

public class MatchProcessor {
	
	public static void matchOrder() {
		Set<Long> stocks = MarketAPI.getAllStock();
		
		for(Long stockId : stocks) {
			matchOrder(stockId);
		}
				
	}
	
	
	public static void matchOrder(long stockId) {
		List<Order> buyList = MarketAPI.getBuyOrder(stockId);
		List<Order> sellList = MarketAPI.getSellOrder(stockId);
		
		buyList = sortBuy(buyList);
		sellList = sortSell(sellList);
		
	}
	
	
	public static List<Order> sortBuy(List<Order> buyList) {
		//List<Order> result = new ArrayList<Order>();
		
		int n = buyList.size();
		for(int i = 0 ; i < n ; i ++) {
			for(int j = i + 1 ; j < n ; j ++) {
				if(buyList.get(i).price < buyList.get(j).price) {
					Order tmp = buyList.get(i);
					buyList.set(i, buyList.get(j));
					buyList.set(j, tmp);
					
				} else if (buyList.get(i).price == buyList.get(j).price) {
					if(buyList.get(i).timeStamp > buyList.get(j).timeStamp) {
						Order tmp = buyList.get(i);
						buyList.set(i, buyList.get(j));
						buyList.set(j, tmp);
					}
				}
			}
		}
		
		
		return buyList;
	}
	
	public static List<Order> sortSell(List<Order> sellList) {
		//List<Order> result = new ArrayList<Order>();

		int n = sellList.size();
		for(int i = 0 ; i < n ; i ++) {
			for(int j = i + 1 ; j < n ; j ++) {
				if(sellList.get(i).price > sellList.get(j).price) {
					Order tmp = sellList.get(i);
					sellList.set(i, sellList.get(j));
					sellList.set(j, tmp);
					
				} else if (sellList.get(i).price == sellList.get(j).price) {
					if(sellList.get(i).timeStamp > sellList.get(j).timeStamp) {
						Order tmp = sellList.get(i);
						sellList.set(i, sellList.get(j));
						sellList.set(j, tmp);
					}
				}
			}
		}
		
		
		return sellList;
	}
	
	

}
