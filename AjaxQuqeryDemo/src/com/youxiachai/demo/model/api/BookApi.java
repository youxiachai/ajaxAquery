package com.youxiachai.demo.model.api;

import android.os.Bundle;

import com.androidquery.AQuery;
import com.androidquery.callback.AjaxStatus;
import com.androidquery.callback.Transformer;
import com.youxiachai.ajax.ICallback;
import com.youxiachai.demo.model.bean.BookInfo;

public class BookApi implements IApiMethod<BookInfo>,Transformer{

	@Override
	public <T> T transform(String url, Class<T> type, String encoding,
			byte[] data, AjaxStatus status) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void get(Bundle queryMap, AQuery req, ICallback<BookInfo> callback) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void post(Bundle queryMap, AQuery req, ICallback<BookInfo> callback) {
		// TODO Auto-generated method stub
		
	}

}
