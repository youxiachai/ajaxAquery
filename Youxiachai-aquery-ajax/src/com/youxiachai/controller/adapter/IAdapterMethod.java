package com.youxiachai.controller.adapter;

import android.os.Bundle;

/**
 * @author youxiachai
 * @date   2013-7-17
 */
public interface IAdapterMethod {
	
	/** 通知adapter 生成 列表
	 * @param query
	 */
	public void post(Bundle querParams);
	
	/** 更新当前列表
	 * @param query
	 */
	public void put(Bundle querParams);
}
