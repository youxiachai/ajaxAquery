package com.youxiachai.demo.controller.collections.adapter;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Toast;

import com.androidquery.AQuery;
import com.androidquery.callback.AjaxStatus;
import com.youxiachai.ajax.ICallback;
import com.youxiachai.controller.adapter.IAdapterMethod;
import com.youxiachai.demo.R;
import com.youxiachai.demo.model.api.CollectionListApi;
import com.youxiachai.demo.model.bean.BookInfo;
import com.youxiachai.demo.model.bean.Collection;

/**
 * @author youxiachai
 * @date   2013-7-17
 */
public class CollectionsAdapter extends BaseAdapter implements IAdapterMethod {
	private AQuery query;
	private CollectionListApi collections;
	private List<Collection> collectionList = new ArrayList<Collection>();
	private LayoutInflater mInflater;

	public CollectionsAdapter(AQuery request) {
		this.query = request;
		this.mInflater = request.getActivity().getLayoutInflater();
		collections = new CollectionListApi();
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return collectionList.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return collectionList.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		if (convertView == null) {
			convertView = mInflater.inflate(R.layout.item_list, null);
		}
		AQuery itemQy = query.recycle(convertView);
		BookInfo book = collectionList.get(position).book;
		itemQy.id(R.id.imageView1).image(book.image, true, true);
		return convertView;
	}

	@Override
	public void post(Bundle queryMap) {
		collections.get(queryMap, query, new ICallback<CollectionListApi>() {

			@Override
			public void onSuccess(CollectionListApi result, Enum<?> type,
					AjaxStatus status) {
				// TODO Auto-generated method stub
				collectionList = result.collections;
				total = result.total;
				notifyDataSetInvalidated();
			}

			@Override
			public void onError(int code, String message) {
				// TODO Auto-generated method stub

			}
		});
	}
	
	static int total;
	
	static boolean isLoad = false;
	/**
	 * 获取更多
	 */
	@Override
	public void put(Bundle queryMap) {
		if(total > getCount() && !isLoad){
			isLoad = true;
			queryMap.putInt(CollectionListApi.Path.START, getCount());
			Log.d("AQuery", "count-->" + getCount());
			collections.get(queryMap, query, new ICallback<CollectionListApi>() {

				@Override
				public void onSuccess(CollectionListApi result, Enum<?> type,
						AjaxStatus status) {
					collectionList.addAll(result.collections);
					isLoad = false;
					notifyDataSetChanged();
				}

				@Override
				public void onError(int code, String message) {
					// TODO Auto-generated method stub

				}
			});
		}else{
			Toast.makeText(query.getContext(), "没有更多了..", Toast.LENGTH_SHORT).show();
		}
	}

}
