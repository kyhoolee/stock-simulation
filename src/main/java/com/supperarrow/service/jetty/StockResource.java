package com.supperarrow.service.jetty;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;

import org.json.JSONObject;


@Path("/stock")
public class StockResource {
	@Path("/stock/create")
	@POST
	@Produces("text/plain;charset=utf-8")
	public Response createStock(String info, @Context HttpServletRequest req) {
		//logger.info(appId + " " + userId + " " + info);
		//long money = RedisUserAPI.getUserMoney(appId, userId);

		JSONObject result = new JSONObject();

		//result.put("money", money);

		String data = result.toString();
		return Response.ok(data).header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Methods", "PUT, GET, POST, DELETE, OPTIONS").build();
	}
	
	@Path("/stock/delete")
	@POST
	@Produces("text/plain;charset=utf-8")
	public Response deleteStock(String info, @Context HttpServletRequest req) {
		//logger.info(appId + " " + userId + " " + info);
		//long money = RedisUserAPI.getUserMoney(appId, userId);

		JSONObject result = new JSONObject();

		//result.put("money", money);

		String data = result.toString();
		return Response.ok(data).header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Methods", "PUT, GET, POST, DELETE, OPTIONS").build();
	}
	
	@Path("/stock/set-stock-info")
	@POST
	@Produces("text/plain;charset=utf-8")
	public Response setStockInfo(String info, @Context HttpServletRequest req) {
		//logger.info(appId + " " + userId + " " + info);
		//long money = RedisUserAPI.getUserMoney(appId, userId);

		JSONObject result = new JSONObject();

		//result.put("money", money);

		String data = result.toString();
		return Response.ok(data).header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Methods", "PUT, GET, POST, DELETE, OPTIONS").build();
	}
	
	
	@Path("/stock/get-stock-info")
	@POST
	@Produces("text/plain;charset=utf-8")
	public Response getStockInfo(String info, @Context HttpServletRequest req) {
		//logger.info(appId + " " + userId + " " + info);
		//long money = RedisUserAPI.getUserMoney(appId, userId);

		JSONObject result = new JSONObject();

		//result.put("money", money);

		String data = result.toString();
		return Response.ok(data).header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Methods", "PUT, GET, POST, DELETE, OPTIONS").build();
	}
	
	@Path("/stock/get-user")
	@POST
	@Produces("text/plain;charset=utf-8")
	public Response getUser(String info, @Context HttpServletRequest req) {
		//logger.info(appId + " " + userId + " " + info);
		//long money = RedisUserAPI.getUserMoney(appId, userId);

		JSONObject result = new JSONObject();

		//result.put("money", money);

		String data = result.toString();
		return Response.ok(data).header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Methods", "PUT, GET, POST, DELETE, OPTIONS").build();
	}
	
	@Path("/stock/get-buy-order")
	@POST
	@Produces("text/plain;charset=utf-8")
	public Response getBuyOrder(String info, @Context HttpServletRequest req) {
		//logger.info(appId + " " + userId + " " + info);
		//long money = RedisUserAPI.getUserMoney(appId, userId);

		JSONObject result = new JSONObject();

		//result.put("money", money);

		String data = result.toString();
		return Response.ok(data).header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Methods", "PUT, GET, POST, DELETE, OPTIONS").build();
	}
	
	@Path("/stock/get-sell-order")
	@POST
	@Produces("text/plain;charset=utf-8")
	public Response getSellOrder(String info, @Context HttpServletRequest req) {
		//logger.info(appId + " " + userId + " " + info);
		//long money = RedisUserAPI.getUserMoney(appId, userId);

		JSONObject result = new JSONObject();

		//result.put("money", money);

		String data = result.toString();
		return Response.ok(data).header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Methods", "PUT, GET, POST, DELETE, OPTIONS").build();
	}
	
	@Path("/stock/get-price-history")
	@POST
	@Produces("text/plain;charset=utf-8")
	public Response getPrefPrice(String info, @Context HttpServletRequest req) {
		//logger.info(appId + " " + userId + " " + info);
		//long money = RedisUserAPI.getUserMoney(appId, userId);

		JSONObject result = new JSONObject();

		//result.put("money", money);

		String data = result.toString();
		return Response.ok(data).header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Methods", "PUT, GET, POST, DELETE, OPTIONS").build();
	}

	@Path("/stock/get-transaction-history")
	@POST
	@Produces("text/plain;charset=utf-8")
	public Response getTransaction(String info, @Context HttpServletRequest req) {
		//logger.info(appId + " " + userId + " " + info);
		//long money = RedisUserAPI.getUserMoney(appId, userId);

		JSONObject result = new JSONObject();

		//result.put("money", money);

		String data = result.toString();
		return Response.ok(data).header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Methods", "PUT, GET, POST, DELETE, OPTIONS").build();
	}
}
