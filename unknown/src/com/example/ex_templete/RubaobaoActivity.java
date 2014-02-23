package com.example.ex_templete;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.view.Menu;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class RubaobaoActivity extends Activity
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_rubaobao);
		final ImageView imgWuyaView=(ImageView) findViewById(R.id.img_wuya);
		new Thread(new Runnable()
		{
			
			@Override
			public void run()
			{
				try
				{
					Thread.sleep(500);
					AnimationDrawable frameAnim = (AnimationDrawable) imgWuyaView.getDrawable();
					frameAnim.stop();
					frameAnim.start();
					Thread.sleep(6000);
					startActivity(new Intent(RubaobaoActivity.this, ShankeActivity.class));
				}
				catch (InterruptedException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}).start();
		imgWuyaView.startAnimation(
				AnimationUtils.loadAnimation(RubaobaoActivity.this, 
						R.anim.wuya_set));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.rubaobao, menu);
		return true;
	}

}
