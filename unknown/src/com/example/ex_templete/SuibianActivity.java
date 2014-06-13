package com.example.ex_templete;
//hemeiwu  2014-04-12 10:12
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SuibianActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_suibian);
		ImageView image = (ImageView) findViewById(R.id.suibian_imageView1);
		Animation animation = AnimationUtils.loadAnimation(this, R.anim.suibian_animation);
		image.startAnimation(animation);
		// test 
		findViewById(R.id.suibian_button1).setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// 注释
				Intent intent=new Intent();
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.suibian, menu);
		return true;
	}

}
