package com.youxiachai.demo.test;

import android.test.ActivityInstrumentationTestCase2;

import com.jayway.android.robotium.solo.Solo;
import com.youxiachai.demo.view.act.MainActivity;

public class UiTest extends ActivityInstrumentationTestCase2<MainActivity> {
	
	private Solo solo;
	
	public UiTest(){
		super(MainActivity.class);
	}
	
	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		super.setUp();
		solo = new Solo(getInstrumentation(), getActivity());
	}
	
	public void testWait(){
//		solo.
	}
	
	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
		solo.finishOpenedActivities();
	}
}
