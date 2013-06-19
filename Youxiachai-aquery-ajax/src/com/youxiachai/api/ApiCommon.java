package com.youxiachai.api;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import org.apache.http.protocol.HTTP;

import android.os.Bundle;

/**
 * @author youxiachai
 * @date   2013-6-18
 */
public class ApiCommon {
	private static String apiHost = "";
	private final static String URLHEADER = "http://";

	/**get host string
	 * @return
	 */
	public static String getApiHost() {
		return apiHost;
	}

	/**set api host
	 * @param hostStr
	 */
	public static void setApiHost(String hostStr) {
		if(!hostStr.contains(URLHEADER)){
			StringBuilder sb = new StringBuilder();
			sb.append(URLHEADER);
			sb.append(hostStr);
			apiHost = sb.toString();
		}else{
			apiHost = hostStr;
		}
	}

	/**
	 * 解析参数
	 * 
	 * @param parameters
	 * @return
	 */
	public static String encodeUrl(Bundle parameters) {
		if (parameters == null) {
			return "";
		}

		StringBuilder sb = new StringBuilder();
		boolean first = true;
		for (String key : parameters.keySet()) {
			if (first) {
				first = false;
				sb.append("?");
			} else {
				sb.append("&");
			}
			try {
				sb.append(key
						+ "="
						+ URLEncoder.encode(
								String.valueOf(parameters.get(key)), HTTP.UTF_8));
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
				return null;
			}
		}

		return sb.toString();
	}

}
