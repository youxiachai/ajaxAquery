package com.youxiachai.demo.model.api;

import java.util.List;

import android.os.Bundle;

import com.androidquery.AQuery;
import com.androidquery.callback.AjaxStatus;
import com.androidquery.callback.Transformer;
import com.youxiachai.ajax.ICallback;
import com.youxiachai.demo.model.bean.Collection;

/**
 * @author youxiachai
 * @date 2013-7-16
 */
public class CollectionListApi implements IApiMethod<CollectionListApi> ,Transformer{
	public int count;
	public int start;
	public int total;
	public List<Collection> collections;

	@Override
	public void get(Bundle queryMap, AQuery req,
			ICallback<CollectionListApi> callback) {
		// TODO Auto-generated method stub

	}

	@Override
	public void post(Bundle queryMap, AQuery req,
			ICallback<CollectionListApi> callback) {
		// TODO Auto-generated method stub

	}

	@Override
	public <T> T transform(String url, Class<T> type, String encoding,
			byte[] data, AjaxStatus status) {
		// TODO Auto-generated method stub
		return null;
	}

}
