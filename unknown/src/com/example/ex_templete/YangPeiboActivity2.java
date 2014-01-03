package com.example.ex_templete;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

//page 2
//next LeadActivity3
public class YangPeiboActivity2 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_yang_peibo_activity2);
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.yang_peibo_activity2, menu);
		return true;
	}
	
	public void btnClick(View v)
	{
		//��һҳ��ť
		startActivity(new Intent(YangPeiboActivity2.this, LeadActivity3.class));
		finish();
	}
	

}
