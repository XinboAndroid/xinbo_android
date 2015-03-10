package com.example.ex_templete;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class TestActivity2 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_test_activity2);
		// 初始化UI
		initUI();
	}

	private void initUI() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.test_activity2, menu);
		return true;
	}

}
