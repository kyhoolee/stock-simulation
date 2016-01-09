package com.supperarrow.service.jetty;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;

import org.apache.log4j.Logger;
import org.json.JSONObject;

import com.supperarrow.utils.LoggerUtil;


@Path("/user")
public class UserResource {
	public static Logger logger = LoggerUtil.getDailyLogger("UserResource");
	
	@Path("/account/create")
	@POST
	@Produces("text/plain;charset=utf-8")
	public Response createAccount(String info, @Context HttpServletRequest req) {
		//logger.info(appId + " " + userId + " " + info);
		//long money = RedisUserAPI.getUserMoney(appId, userId);

		JSONObject result = new JSONObject();

		//result.put("money", money);

		String data = result.toString();
		return Response.ok(data).header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Methods", "PUT, GET, POST, DELETE, OPTIONS").build();
	}
	
	@Path("/account/update")
	@POST
	@Produces("text/plain;charset=utf-8")
	public Response updateAccount(String info, @Context HttpServletRequest req) {
		//logger.info(appId + " " + userId + " " + info);
		//long money = RedisUserAPI.getUserMoney(appId, userId);

		JSONObject result = new JSONObject();

		//result.put("money", money);

		String data = result.toString();
		return Response.ok(data).header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Methods", "PUT, GET, POST, DELETE, OPTIONS").build();
	}
	
	@Path("/account/get")
	@POST
	@Produces("text/plain;charset=utf-8")
	public Response getAccount(String info, @Context HttpServletRequest req) {
		//logger.info(appId + " " + userId + " " + info);
		//long money = RedisUserAPI.getUserMoney(appId, userId);

		JSONObject result = new JSONObject();

		//result.put("money", money);

		String data = result.toString();
		return Response.ok(data).header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Methods", "PUT, GET, POST, DELETE, OPTIONS").build();
	}
	
	@Path("/account/delete")
	@POST
	@Produces("text/plain;charset=utf-8")
	public Response deleteAccount(String info, @Context HttpServletRequest req) {
		//logger.info(appId + " " + userId + " " + info);
		//long money = RedisUserAPI.getUserMoney(appId, userId);

		JSONObject result = new JSONObject();

		//result.put("money", money);

		String data = result.toString();
		return Response.ok(data).header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Methods", "PUT, GET, POST, DELETE, OPTIONS").build();
	}
	
	
	
	
	
	
	
	
	@Path("/order/create")
	@POST
	@Produces("text/plain;charset=utf-8")
	public Response createOrder(String info, @Context HttpServletRequest req) {
		//logger.info(appId + " " + userId + " " + info);
		//long money = RedisUserAPI.getUserMoney(appId, userId);

		JSONObject result = new JSONObject();

		//result.put("money", money);

		String data = result.toString();
		return Response.ok(data).header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Methods", "PUT, GET, POST, DELETE, OPTIONS").build();
	}
	

	
	@Path("/order/get")
	@POST
	@Produces("text/plain;charset=utf-8")
	public Response getOrder(String info, @Context HttpServletRequest req) {
		//logger.info(appId + " " + userId + " " + info);
		//long money = RedisUserAPI.getUserMoney(appId, userId);

		JSONObject result = new JSONObject();

		//result.put("money", money);

		String data = result.toString();
		return Response.ok(data).header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Methods", "PUT, GET, POST, DELETE, OPTIONS").build();
	}
	
	@Path("/order/delete")
	@POST
	@Produces("text/plain;charset=utf-8")
	public Response deleteOrder(String info, @Context HttpServletRequest req) {
		//logger.info(appId + " " + userId + " " + info);
		//long money = RedisUserAPI.getUserMoney(appId, userId);

		JSONObject result = new JSONObject();

		//result.put("money", money);

		String data = result.toString();
		return Response.ok(data).header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Methods", "PUT, GET, POST, DELETE, OPTIONS").build();
	}
	
	
	
	@Path("/stock/get-stock")
	@POST
	@Produces("text/plain;charset=utf-8")
	public Response getStock(String info, @Context HttpServletRequest req) {
		//logger.info(appId + " " + userId + " " + info);
		//long money = RedisUserAPI.getUserMoney(appId, userId);

		JSONObject result = new JSONObject();

		//result.put("money", money);

		String data = result.toString();
		return Response.ok(data).header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Methods", "PUT, GET, POST, DELETE, OPTIONS").build();
	}
	
	@Path("/stock/get-money")
	@POST
	@Produces("text/plain;charset=utf-8")
	public Response getMoney(String info, @Context HttpServletRequest req) {
		//logger.info(appId + " " + userId + " " + info);
		//long money = RedisUserAPI.getUserMoney(appId, userId);

		JSONObject result = new JSONObject();

		//result.put("money", money);

		String data = result.toString();
		return Response.ok(data).header("Access-Control-Allow-Origin", "*")
				.header("Access-Control-Allow-Methods", "PUT, GET, POST, DELETE, OPTIONS").build();
	}

}
