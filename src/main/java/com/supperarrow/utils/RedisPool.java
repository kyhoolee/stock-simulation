package com.supperarrow.utils;

import java.util.Properties;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.apache.log4j.Logger;


import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class RedisPool {
	public static Logger logError = LoggerUtil.getDailyLogger("RedisPool_err");
	
	private static JedisPool _instance = null;
	
	public static String CONFIG_PATH = "/default_redis.properties";
	
	public static String redis_host = "localhost";
	public static int redis_port = 6379;
	public static String redis_pass = null;
	public static int redis_index = 0;
	
	
	public static String configPath() {
		return CONFIG_PATH;
	}
	
	public static void load(String path) {
		Properties properties = new Properties();
		try {
			properties.load(RedisPool.class.getResourceAsStream(path));
			
			redis_host = properties.getProperty("redis_host");
			redis_port = Integer.parseInt(properties.getProperty("redis_port"));
			redis_pass = properties.getProperty("redis_pass");
			redis_index = Integer.parseInt(properties.getProperty("redis_index"));
			
		} catch (Exception e) {
			logError.error(ExceptionUtils.getStackTrace(e));
		}
		
	}



	public synchronized static JedisPool getInstance(String path) {

		if (_instance == null) {
			load(path);
			JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
			jedisPoolConfig.setMaxTotal(100);
			jedisPoolConfig.setMaxIdle(100);
			jedisPoolConfig.setMaxWaitMillis(10000);
			jedisPoolConfig.setMinIdle(10);
			jedisPoolConfig.setTimeBetweenEvictionRunsMillis(5000);
			jedisPoolConfig.setMinEvictableIdleTimeMillis(1000);
			jedisPoolConfig.setTestWhileIdle(true);
			System.out.println(redis_pass);
			System.out.println(redis_host);
			System.out.println(redis_port);
			_instance = new JedisPool(
					jedisPoolConfig, 
					redis_host, redis_port, 
					10000, redis_pass);

		}
		
		return _instance;
	}

	public synchronized static Jedis getJedis(String path) {
		try {
			Jedis jedis = RedisPool.getInstance(path).getResource();
			jedis.select(redis_index);
			return jedis;
		} catch (Exception e) {
			logError.error(ExceptionUtils.getStackTrace(e));
		}
		
		return null;
	}
	
	public synchronized static Jedis getJedis() {
		try {
			Jedis jedis = RedisPool.getInstance(CONFIG_PATH).getResource();
			jedis.select(redis_index);
			return jedis;
		} catch (Exception e) {
			logError.error(ExceptionUtils.getStackTrace(e));
		}
		
		return null;
	}
	

}
