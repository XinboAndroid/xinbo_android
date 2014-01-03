package com.example.ex_templete;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;

//page 6
//next to ChenJiaLiang7Activity
public class BaofengActivity6 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_baofeng_activity6);
		// 2014.01.02  16:55 新增注释 
		System.out.println("test");		
		Log.e("test", "onCreate()");
		Log.e("test", "onCreate()");
		Log.e("test", "onCreate()");
		Log.e("test", "onCreate()");
		//12.2 17:42 新增注释
		LayoutInflater inflater = getLayoutInflater();
		View layout1 = inflater.inflate(R.layout.bao_pager1, null);
		View layout2 = inflater.inflate(R.layout.bao_pager2, null);
		View layout3 = inflater.inflate(R.layout.bao_pager3, null);
		//12.2 20:19 新增注释   新建一个容器用于保存viewpager的item
		final ArrayList<View> viewArray=new ArrayList<View>();
		viewArray.add(layout1);
		viewArray.add(layout2);
		viewArray.add(layout3);
		final ViewPager viewPager=(ViewPager) findViewById(R.id.pager_icon);
		viewPager.setAdapter(new PagerAdapter() {
			@Override
			public Object instantiateItem(View container, int position) {
				View layout = viewArray.get(position);
				viewPager.addView(layout);
				return layout;
			}
			@Override
			public void destroyItem(View container, int position, Object object) {
				View layout = viewArray.get(position);
				viewPager.removeView(layout);
			}
			@Override
			public boolean isViewFromObject(View arg0, Object arg1) {
				
				return arg0==arg1;
			}
			
			@Override
			public int getCount() {
				// TODO Auto-generated method stub
				return viewArray.size();
			}
		});
	}
	public void btnNextPage(View v) {
		startActivity(new Intent(BaofengActivity6.this,ChenJiaLiang7Activity.class));
		finish();

	}
	//不用要记得删除，不然会产生BUG
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.baofeng_activity6, menu);
		return true;
	}

}
