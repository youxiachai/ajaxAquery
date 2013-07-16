package com.youxiachai.demo.model.api;

import java.util.List;

import android.os.Bundle;

import com.androidquery.AQuery;
import com.youxiachai.ajax.ICallback;
import com.youxiachai.demo.model.Collection;

/**
 * @author youxiachai
 * @date 2013-7-16
 */
public class CollectionList implements IApiMethod<CollectionList> {
	public int count;
	public int start;
	public int total;
	public List<Collection> collections;

	@Override
	public void get(Bundle queryMap, AQuery req,
			ICallback<CollectionList> callback) {
		// TODO Auto-generated method stub

	}

	@Override
	public void post(Bundle queryMap, AQuery req,
			ICallback<CollectionList> callback) {
		// TODO Auto-generated method stub

	}

}
