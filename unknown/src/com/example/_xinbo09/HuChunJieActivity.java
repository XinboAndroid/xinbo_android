package com.example._xinbo09;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

import com.example.ex_templete.AndyActivity;
import com.example.ex_templete.R;

/**
 * 测试Activity
 * @author Administrator
 * @since 1.0
 *
 */
public class HuChunJieActivity extends Activity {

	/**
	 * @param v
	 */
	public void xinbo_btn(View v) {
		Intent intent = new Intent(this, AndyActivity.class);
		startActivity(intent);
		finish();
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// 我也试试有没效果
		// 设置界面
//		 setContentView(R.layout.activity_hu_chun_jie);
		Log.e("lin", "lin");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		MenuInflater menuInflater = getMenuInflater();
		menuInflater.inflate(R.menu.andy, menu);
		return true;
	}

}
