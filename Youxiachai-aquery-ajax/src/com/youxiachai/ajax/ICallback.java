package com.youxiachai.ajax;

import com.androidquery.callback.AjaxStatus;

public interface ICallback<T> {
//	public void onSuccess(T result, int id,AjaxStatus status);
	public void onSuccess(T result, Enum<?> type,AjaxStatus status);
	public void onError(int code,String message);
}
