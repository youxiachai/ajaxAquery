package com.youxiachai.demo.test;

import java.net.HttpURLConnection;

import android.test.ActivityInstrumentationTestCase2;

import com.androidquery.AQuery;
import com.androidquery.callback.AjaxCallback;
import com.androidquery.callback.AjaxStatus;
import com.androidquery.util.AQUtility;
import com.youxiachai.demo.view.act.MainActivity;

/**
 * @author youxiachai
 * @date 2013-7-16
 */
public class MainActivityTest extends
		ActivityInstrumentationTestCase2<MainActivity> {

	public MainActivityTest() {
		super(MainActivity.class);
	}

	AQuery request;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		request = new AQuery(getActivity());
		AQUtility.setDebug(true);
		AQUtility.debug("new act", getActivity() + ":"
				+ getActivity().isFinishing());
	}
	
	public void done(){
		AQUtility.debugNotify();
	}

	public void testRequest() {
		String url = "http://www.baidu.com";
		request.ajax(url, String.class,  new AjaxCallback<String>(){
			@Override
			public void callback(String url, String object, AjaxStatus status) {
				super.callback(url, object, status);
				assertEquals(HttpURLConnection.HTTP_OK, status.getCode());
				done();
			}
		});
		AQUtility.debugWait(10000);
	}
	
	public void testBookModel(){
		
	}

	
}
