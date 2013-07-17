package com.youxiachai.demo.app;

import com.youxiachai.api.ApiCommon;

import android.app.Application;

public class DemoApp extends Application {
	
	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
		ApiCommon.setApiHost("api.douban.com");
	}
}
