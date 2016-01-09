package com.supperarrow.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Calendar;
import java.util.Date;

import org.codehaus.jackson.map.ObjectMapper;



public class CommonUtil {
	public static String toString(Object o) throws Exception {
		return getObjectMapper().writeValueAsString(o);
	}

	private static ObjectMapper _objectMapper = null;

	public static ObjectMapper getObjectMapper() {
		if (_objectMapper == null)
			_objectMapper = new ObjectMapper();

		return _objectMapper;

	}

	public static String timeStamp() {
		return (new Date()).toString();
	}

	public static long currentHourTime() {
		Calendar c = Calendar.getInstance();
		// System.out.println(c.getTimeInMillis());
		// c.set(Calendar.HOUR_OF_DAY, 0);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		c.set(Calendar.MILLISECOND, 0);
		// System.out.println(c.toString());
		long time = c.getTimeInMillis();

		// Date date = new Date(time);
		// System.out.println(date.toString());
		return time;
	}

	public static long currentDayTime() {
		Calendar c = Calendar.getInstance();
		// System.out.println(c.getTimeInMillis());
		c.set(Calendar.HOUR_OF_DAY, 0);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		c.set(Calendar.MILLISECOND, 0);
		// System.out.println(c.toString());
		long time = c.getTimeInMillis();

		// Date date = new Date(time);
		// System.out.println(date.toString());
		return time;
	}

	public static long time() {
		return System.currentTimeMillis();
	}

	public static long duration(long start) {
		return System.currentTimeMillis() - start;
	}

	public static byte[] stringToBytes(String input) {
		return input.getBytes();
	}

	public static String bytesToString(byte[] input) {
		return new String(input);
	}

	public static String bytes(byte[] input) {
		String result = "";
		for (int i = 0; i < input.length; i++) {
			result += input[i];
		}

		return result;
	}

	public static String readInputStream(InputStream is) {
		BufferedReader br = null;
		StringBuilder sb = new StringBuilder();
		try {
			br = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
			String line;
			while ((line = br.readLine()) != null) {
				sb.append(line);
			}
		} catch (IOException localIOException) {
			if (br != null)
				try {
					br.close();
				} catch (IOException localIOException1) {
				}
		} finally {
			if (br != null)
				try {
					br.close();
				} catch (IOException localIOException2) {
				}
		}
		return sb.toString();
	}





}
