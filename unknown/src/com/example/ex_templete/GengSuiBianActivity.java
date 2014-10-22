package com.example.ex_templete;

import com.example._xinbo09.Xinbo09Activity;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class GengSuiBianActivity extends Activity
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		//4444444
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_geng_sui_bian);
	}
//东东
	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.geng_sui_bian, menu);
		return true;
	}
	public void btn(View v)
	{
		// TODO Auto-generated method stub
		Intent intent=new Intent(this,Xinbo09Activity.class);
		startActivity(intent);
	}
}
