package com.youxiachai.demo.controller.user.auth;

import com.androidquery.auth.AccountHandle;
import com.androidquery.callback.AbstractAjaxCallback;
import com.androidquery.callback.AjaxStatus;

/**
 * @author youxiachai
 * @date   2013-7-16
 */
public class UserAuthHandle extends AccountHandle{

	@Override
	public boolean authenticated() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected void auth() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean expired(AbstractAjaxCallback<?, ?> cb, AjaxStatus status) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean reauth(AbstractAjaxCallback<?, ?> cb) {
		// TODO Auto-generated method stub
		return false;
	}

}
