package com.example.ex_templete;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;

public class LwkActivity extends Activity {

	private TextView textView1;
	private TextView textView2;
	private int a ;
	private int b ;
	private Button button1;
	private Lwk_View lwk_View;

	@Override
	protected  void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lwk);
		SeekBar seekBar2 = (SeekBar) findViewById(R.id.SB_lwk2);
		SeekBar seekBar1 = (SeekBar) findViewById(R.id.SB_lwk);
		textView1 = (TextView) findViewById(R.id.TV_lwk1);
		textView2 = (TextView) findViewById(R.id.TV_lwk2);	
		button1 = (Button) findViewById(R.id.Btn_lwk2);
		AttributeSet attrs = null;
		lwk_View = new Lwk_View(this, attrs);
		seekBar1.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
			
			private int progress;

			@Override
			public void onStopTrackingTouch(SeekBar seekBar) {
				if(a == 30 && b ==70){
					button1.setVisibility(View.VISIBLE);
				}
				button1.setOnClickListener(new OnClickListener() {
					
					@Override
					public void onClick(View v) {
						Intent intent = new Intent();
//						startActivity(intent);
						
					}
				});
			}
			
			@Override
			public void onStartTrackingTouch(SeekBar seekBar) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onProgressChanged(SeekBar seekBar,final int progress,
					boolean fromUser) {
				a = progress;
				textView1.setText("i"+progress);
			}
		});
//		lwk_View.setIJ(progress, progress2);
		seekBar2.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
			
			@Override
			public void onStopTrackingTouch(SeekBar seekBar) {
				if(a == 30 && b ==70){
					button1.setVisibility(View.VISIBLE);
				}
				button1.setOnClickListener(new OnClickListener() {
					
					@Override
					public void onClick(View v) {
						Intent intent = new Intent();
//						startActivity(intent);
						
					}
				});
				
			}
			
			@Override
			public void onStartTrackingTouch(SeekBar seekBar) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onProgressChanged(SeekBar seekBar,final int progress2,
					boolean fromUser) {
				b = progress2;
				textView2.setText("j"+progress2);
			}
		});
		
		lwk_View.setIJ(a,b);
	}
		
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.lwk, menu);
		return true;
	}

}
