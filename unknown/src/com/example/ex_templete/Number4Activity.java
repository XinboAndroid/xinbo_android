package com.example.ex_templete;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;

public class Number4Activity extends Activity {

	private Button mButton;
	private ImageView mImageView;

	public void next(View v){
		System.out.println("MainBB");
		startActivity(new Intent(this,ZwtActivity5.class));
		finish();
	}
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_number4);
		
		initUI();
		System.out.println("Maincc");
		mImageView.setVisibility(View.VISIBLE);	
		Log.e("Main", "onCreateAAA()");	
		Animation loadAnimation = AnimationUtils.loadAnimation(this, R.anim.set);
		mImageView.startAnimation(loadAnimation);
		loadAnimation.setAnimationListener(new AnimationListener() {
			
			@Override
			public void onAnimationStart(Animation animation) {
			}
			
			@Override
			public void onAnimationRepeat(Animation animation) {
			}
			
			@Override
			public void onAnimationEnd(Animation animation) {
				mButton.setVisibility(View.VISIBLE);				
			}
		});
	}
	
	public void initUI() {
		
		System.out.println("initUI");
		mButton = (Button) findViewById(R.id.btn_num4);
		mImageView = (ImageView) findViewById(R.id.imageView1);
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.number4, menu);
		return true;
	}

}
