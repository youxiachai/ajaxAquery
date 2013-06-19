package com.youxiachai.ajax;

import com.androidquery.callback.AjaxCallback;
import com.androidquery.callback.AjaxStatus;

public class NetCallback<T> extends AjaxCallback<T> {
	private ICallback<T> callbackListener;
	private Enum<?> callBackType;
	public NetCallback(Class<T> dataType, NetOption cbOption, ICallback<T> callback) {
		this.type(dataType);
		this.url(cbOption.url);
	
		this.callbackListener = callback;
		
		if(cbOption.callbackType != null){
			this.callBackType = cbOption.callbackType;
		}
		setExpire(cbOption.expire);
	}
	

	
	private void setExpire(long cacheTime){
		this.fileCache = true;
		this.expire(cacheTime);
	}
	
	public void setCallback(ICallback<T> callback){
		this.callbackListener = callback;
	}

	@Override
	public void callback(String url, T object, AjaxStatus status) {
		// TODO Auto-generated method stub
		super.callback(url, object, status);
		callbackListener.onSuccess(object, callBackType,
				status);
	}

}
