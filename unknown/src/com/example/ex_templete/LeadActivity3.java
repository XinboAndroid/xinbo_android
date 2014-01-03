package com.example.ex_templete;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
//page 3
//next Number4Activity
public class LeadActivity3 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lead);
		
		initLayoutMenu();
	}

	public void initLayoutMenu() {
		final ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
		LayoutInflater inflater = getLayoutInflater();
		View layout0 = inflater.inflate(R.layout.pager0, null);
		View layout1 = inflater.inflate(R.layout.pager1, null);
		View layout2 = inflater.inflate(R.layout.pager2, null);
		final ArrayList<View> arrayList = new ArrayList<View>();
		arrayList.add(layout0);
		arrayList.add(layout1);
		arrayList.add(layout2);
		
		viewPager.setAdapter(new PagerAdapter() {
			
			@Override
			public Object instantiateItem(View container, int position) {
				View layout = arrayList.get(position);
				viewPager.addView(layout);
				return layout;
			}
			
			@Override
			public boolean isViewFromObject(View arg0, Object arg1) {
				return arg0 == arg1;
			}
			
			@Override
			public void destroyItem(View container, int position, Object object) {
				View layout = arrayList.get(position);
				viewPager.removeView(layout);
			}
			
			@Override
			public int getCount() {
				// TODO Auto-generated method stub
				return arrayList.size();
			}
		});
	}
	
	public void Next(View v) {
		startActivity(new Intent(this, Number4Activity.class));
	}

}
