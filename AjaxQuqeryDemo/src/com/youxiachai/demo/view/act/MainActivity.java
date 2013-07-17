package com.youxiachai.demo.view.act;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
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
		
		Bundle query = new Bundle();
		query.putInt("id", 59438626);
		
		collectionAdapter.post(query);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
