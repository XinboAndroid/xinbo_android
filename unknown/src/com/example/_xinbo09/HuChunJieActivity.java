package com.example._xinbo09;

import com.example.ex_templete.R;
import com.example.ex_templete.R.layout;
import com.example.ex_templete.R.menu;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;

public class HuChunJieActivity extends Activity {
	
	public void xinbo_btn(View v) {
		//Intent intent=new Intent();
//		startActivity(intent);
//		finish();

	}
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	//没有布局文件
	//	setContentView(R.layout.activity_hu_chun_jie);
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
	//	getMenuInflater().inflate(R.menu.hu_chun_jie, menu);
		return true;
	}

}
