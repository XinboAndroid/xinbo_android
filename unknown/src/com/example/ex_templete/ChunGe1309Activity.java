package com.example.ex_templete;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ChunGe1309Activity extends FragmentActivity implements OnClickListener
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_chunge1309);
		findViewById(R.id.bnt_next).setOnClickListener(this);
		initfragment();
	}

	private void initfragment()
	{
		FragmentManager fragmentManager = getSupportFragmentManager();
		FragmentTransaction ft = fragmentManager.beginTransaction();
		ft.add(R.id.content, new TouchRotateFragment());
		ft.commit();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v)
	{
		//activityÌø×ª
				
	switch (v.getId())
	{
	case R.id.bnt_next:
		Intent intent = new Intent(this,HuaCaiActivity.class);
		startActivity(intent );
		break;

	default:
		break;
	}
	}

}
