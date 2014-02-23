package com.example.ex_templete;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.graphics.drawable.AnimationDrawable;
import android.text.TextPaint;
import android.view.Menu;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class RubaobaoActivity extends Activity
{
	
	private EditText mEditText1;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_rubaobao);
		TextView textView1 = (TextView) findViewById(R.id.textView1);
		TextView textView2 = (TextView) findViewById(R.id.textView2);
		mEditText1 = (EditText) findViewById(R.id.editText1);
		TextPaint tp1 = textView1.getPaint();
		TextPaint tp2 = textView2.getPaint();
		tp1.setFakeBoldText(true);
		tp2.setFakeBoldText(true);

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

			
		public void next(View v) {

		if("1311".equals(mEditText1.getText().toString())){
			startActivity(new Intent(RubaobaoActivity.this, ShankeActivity.class));
		}else{
			Toast.makeText(RubaobaoActivity.this, "笨蛋，输错啦！", Toast.LENGTH_LONG).show();
		}

		
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.rubaobao, menu);
		return true;
	}

}
