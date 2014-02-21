package com.example.ex_templete;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;


public class ShankeActivity extends Activity
{

	private ImageView iv_star;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_shanke);
		initUI();
	}

	private void initUI()
	{
		iv_star = (ImageView) findViewById(R.id.imageView1_star);
		iv_star.startAnimation(AnimationUtils.loadAnimation(this, R.anim.set1));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.shanke, menu);
		return true;
	}

}
