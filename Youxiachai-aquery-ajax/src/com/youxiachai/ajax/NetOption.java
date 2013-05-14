package com.youxiachai.ajax;

/**
 * @author youxiachai
 * @date 2013/5/12
 */
public class NetOption {
	public String url;
	public Enum<?> callbackType;
	public long expire = -1;
	public ICallback<?> iCallback;
	public NetOption(String apiPath){
		this.url = apiPath;
	}
	
	public NetOption(String apiPath,Enum<?> type){
		this.url = apiPath;
		this.callbackType = type;
	}
}
