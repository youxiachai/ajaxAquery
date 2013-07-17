package com.youxiachai.demo.app;

import android.app.Application;

import com.youxiachai.api.ApiCommon;

public class DemoApp extends Application {
	
	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
		ApiCommon.setApiHost("api.douban.com");
		
//		BitmapAjaxCallback.setMaxPixelLimit(8000000);
//		BitmapAjaxCallback.setCacheLimit(50);
//		AjaxCallback.setNetworkLimit(8);
	}
}
