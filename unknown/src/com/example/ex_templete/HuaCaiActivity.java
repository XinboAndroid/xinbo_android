package com.example.ex_templete;

import java.util.ArrayList;

import android.app.Activity;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class HuaCaiActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_guide);
		
		final ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);
		
		LayoutInflater inflater = getLayoutInflater();
		
		View layout1 = inflater.inflate(R.layout.pager_item, null);
		View layout2 = inflater.inflate(R.layout.pager_item, null);
		View layout3 = inflater.inflate(R.layout.pager_item, null);
		View layout4 = inflater.inflate(R.layout.pager_item, null);
		View layout5 = inflater.inflate(R.layout.pager_item, null);
		
		final ArrayList<View> layouts =  new ArrayList<View>();
		
		layouts.add(layout1);
		layouts.add(layout2);
		layouts.add(layout3);
		layouts.add(layout4);
		layouts.add(layout5);
		
		PagerAdapter adapter = new PagerAdapter() {
			
			@Override
			public Object instantiateItem(View container, int position) {
				View layout = layouts.get(position);
				TextView textView = (TextView) layout.findViewById(R.id.textView1);
				textView.setText(String.valueOf("-第" + (position + 1) + "页-"));
				final ImageView imageView = (ImageView) layout.findViewById(R.id.imageView1);
				imageView.post(new Runnable() {
					
					@Override
					public void run() {
						
						AnimationDrawable drawable = (AnimationDrawable) imageView.getDrawable();
						drawable.stop();
						drawable.start();
					}
				});
				if(position == layouts.size()-1) {
					
					Button button = (Button) layout.findViewById(R.id.button1);
					button.setVisibility(View.VISIBLE);
					button.setOnClickListener(new OnClickListener() {
						
						@Override
						public void onClick(View v) {
							
//							Intent intent = new Intent();
//							intent.setClass(HuaCaiActivity.this, MainActivity.class);
//							startActivity(intent );
							finish();
						}
					});
				}
				viewPager.addView(layout);
				return layout;
			}
			
			@Override
			public void destroyItem(View container, int position, Object object) {
				View layout = layouts.get(position);
				viewPager.removeView(layout);
			}
			
			@Override
			public boolean isViewFromObject(View arg0, Object arg1) {
				return arg0 == arg1;
			}
			
			@Override
			public int getCount() {
				return layouts.size();
			}
		};
		viewPager.setAdapter(adapter );
		SharedPreferences preferences = getSharedPreferences("51CTO", MODE_PRIVATE);
    	Editor edit = preferences.edit();
    	edit.putBoolean("isFirst", false);
    	edit.commit();
    	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
}
