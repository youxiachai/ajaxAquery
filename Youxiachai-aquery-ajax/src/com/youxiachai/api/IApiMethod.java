package com.youxiachai.api;

import android.os.Bundle;

import com.androidquery.AQuery;
import com.youxiachai.ajax.ICallback;

/**
 * @author youxiachai
 * @date   2013-7-16
 */
public interface IApiMethod<T> {
	public void get(Bundle queryMap, AQuery req,ICallback<T> callback);
	public void post(Bundle queryMap, AQuery req,ICallback<T> callback);
}
