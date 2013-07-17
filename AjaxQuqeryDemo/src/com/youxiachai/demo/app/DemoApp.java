package com.youxiachai.demo.app;

import android.app.Application;

import com.androidquery.callback.AjaxCallback;
import com.androidquery.callback.BitmapAjaxCallback;
import com.youxiachai.api.ApiCommon;

public class DemoApp extends Application {
	
	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
		ApiCommon.setApiHost("api.douban.com");
		
		BitmapAjaxCallback.setCacheLimit(20);
		AjaxCallback.setNetworkLimit(8);
	}
}
