package com.example._xinbo09;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

import com.example.ex_templete.AndyActivity;
import com.example.ex_templete.R;

public class HuChunJieActivity extends Activity {

	/**
	 * sadfasdf21212121
	 * 
	 * @param v
	 */
	public void xinbo_btn(View v) {
		Intent intent = new Intent();
		intent.setClass(this, AndyActivity.class);
		startActivity(intent);
		finish();
		int a;
		int b;
		int c;
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// û�в����ļ�
		// setContentView(R.layout.activity_hu_chun_jie);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.andy, menu);
		return true;
	}

}
