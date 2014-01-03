package com.example.ex_templete;
import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;

public class LiangtanActivity8 extends Activity {

	public void next4(View v) {

		startActivity(new Intent(LiangtanActivity8.this,LaiguangqiangActivity9.class));
	}
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_third);
		viewPage();
	}
private void viewPage() {
		LayoutInflater layoutInflater = getLayoutInflater();
	    View page0 = layoutInflater.inflate(R.layout.page00, null);
	    View page1 = layoutInflater.inflate(R.layout.page11, null);
	    View page2 = layoutInflater.inflate(R.layout.page22, null);
	    View page3 = layoutInflater.inflate(R.layout.page33, null);
	    View page4 = layoutInflater.inflate(R.layout.page44, null);
	    final ArrayList<View> pageList=new ArrayList<View>();
	    pageList.add(page0);
	    pageList.add(page1);
	    pageList.add(page2);
	    pageList.add(page3);
	    pageList.add(page4);
		final ViewPager viewPager = (ViewPager) findViewById(R.id.pager);
		viewPager.setAdapter(new PagerAdapter() {
			@Override
			public Object instantiateItem(View container, int position) {
				  View layout = pageList.get(position);
				  viewPager.addView(layout);
				return layout;
			}
			@Override
			public boolean isViewFromObject(View arg0, Object arg1) {
				
				return arg0==arg1;
			}
			
			@Override
			public int getCount() {
				// TODO Auto-generated method stub
				return pageList.size();
			}
			@Override
			public void destroyItem(View container, int position, Object object) {
			  View layout = pageList.get(position);
			  viewPager.removeView(layout);
				
			}
		});		
	}
        public void next(View v) {
              Intent intent=new Intent(this,ChunGe1309Activity9.class);
			startActivity(intent);
			finish();
		}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		return true;
	}

}
