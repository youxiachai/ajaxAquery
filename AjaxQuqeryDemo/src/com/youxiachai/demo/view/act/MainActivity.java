package com.youxiachai.demo.view.act;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ListView;

import com.androidquery.AQuery;
import com.youxiachai.demo.R;
import com.youxiachai.demo.controller.collections.adapter.CollectionsAdapter;

public class MainActivity extends Activity {
	
	AQuery query;
	CollectionsAdapter collectionAdapter;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		query = new AQuery(this);
		
		ListView lv = query.id(android.R.id.list).getListView();
		
		collectionAdapter = new CollectionsAdapter(query);
		
		lv.setEmptyView(findViewById(android.R.id.empty));
		
		lv.setAdapter(collectionAdapter);
		
		Bundle queryParams = new Bundle();
		queryParams.putString("id", "youxiachai");
		//创建列表
		collectionAdapter.post(queryParams);
		
		query.id(android.R.id.button1).clicked(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Bundle queryParams = new Bundle();
				queryParams.putString("id", "youxiachai");
				collectionAdapter.put(queryParams);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
