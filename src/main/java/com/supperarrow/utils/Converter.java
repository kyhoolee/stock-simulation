package com.supperarrow.utils;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.apache.log4j.Logger;


public class Converter {
	public static Logger logger = LoggerUtil.getDailyLogger("StringConverter_log");
	
	public static long getLong(String data) {
		if(data == null)
			return 0;
		try {
			long result = Long.parseLong(data);
			return result;
		} catch (Exception e) {
			logger.error(ExceptionUtils.getStackTrace(e));
		}
		
		return 0;
	}
	
	public static long getLong(Double data) {
		if(data == null)
			return 0;
		try {
			long result = data.longValue();
			return result;
		} catch (Exception e) {
			logger.error(ExceptionUtils.getStackTrace(e));
		}
		
		return 0;
	}

	
	public static int getInt(String data, int value) {
		if(data == null) {
			return value;
		}
		
		try {
			int result = Integer.parseInt(data);
			return result;
		} catch (Exception e) {
			logger.error(ExceptionUtils.getStackTrace(e));
		}
		
		return value;
	}
}
