package com.youxiachai.demo.test;

import android.test.ActivityInstrumentationTestCase2;

import com.youxiachai.demo.view.act.MainActivity;

public class UiTest extends ActivityInstrumentationTestCase2<MainActivity> {
	
	public UiTest(){
		super(MainActivity.class);
	}
	
	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		super.setUp();
	}
}
