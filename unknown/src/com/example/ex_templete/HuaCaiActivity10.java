package com.example.ex_templete;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class HuaCaiActivity10 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_guide);
		
		final ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);
		System.out.println("test");
		Log.e("test", "test");
		LayoutInflater inflater = getLayoutInflater();
		final ArrayList<View> layouts =  new ArrayList<View>();
		int[] layoutsIDs = new int[]{
				R.layout.pager_item,	
				R.layout.pager_item,	
				R.layout.pager_item_huacai,	
				R.layout.pager_item,	
				R.layout.pager_item	
		};
		for (int i = 0; i < layoutsIDs.length; i++) {
			View layout1 = inflater.inflate(layoutsIDs[i], null);
			layouts.add(layout1);
		}
//		View layout1 = inflater.inflate(R.layout.pager_item, null);
//		View layout2 = inflater.inflate(R.layout.pager_item, null);
//		View layout3 = inflater.inflate(R.layout.pager_item_huacai, null);
//		// 鍛靛懙 涓嶇煡閬撳姞浠�箞浜�灏卞姞涓敞閲婂惂
//		View layout4 = inflater.inflate(R.layout.pager_item, null);
//		View layout5 = inflater.inflate(R.layout.pager_item, null);
//		
//		
//		layouts.add(layout1);
//		layouts.add(layout2);
//		layouts.add(layout3);
//		layouts.add(layout4);
//		layouts.add(layout5);
		
		PagerAdapter adapter = new PagerAdapter() {
			
			@Override
			public Object instantiateItem(View container, int position) {
				View layout = layouts.get(position);
				TextView textView = (TextView) layout.findViewById(R.id.textView1);
				textView.setText(String.valueOf("-绗� + (position + 1)" + "椤�"));
				if((position+1)==3){
					textView.setText("鍛靛懙 涓嶇煡閬撳姞浠�箞浜�灏卞姞涓敞閲婂惂,琛ㄧず鎴戞潵杩�");
				}
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
					
					Button button = (Button) layout.findViewById(R.id.btn_lito5);
					button.setVisibility(View.VISIBLE);
					button.setOnClickListener(new OnClickListener() {
						
						@Override
						public void onClick(View v) {
							
							Intent intent = new Intent();
							intent.setClass(HuaCaiActivity10.this, RubaobaoActivity.class);
							startActivity(intent );
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
