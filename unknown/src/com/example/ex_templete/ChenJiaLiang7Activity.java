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
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.Toast;

public class ChenJiaLiang7Activity extends Activity{
	ArrayList<View> arrayList=new ArrayList<View>();
	boolean isFirst1;
	boolean isFirst2;
	boolean isFirst3;
	boolean isFirst4;
	boolean isFirst5;
	private ImageButton imageButton1;
	private ImageButton imageButton2;
	private ImageButton imageButton3;
	private ImageButton imageButton4;
	private ImageButton imageButton5;
	private int num=0;
	//提前祝圣诞快乐!--修改记录2013-12-2-22:33
	//锟斤拷锟斤拷锟斤拷一锟斤拷锟斤拷锟斤拷锟斤拷冢锟�
	public void fun(){
		if(num==5){

			Toast.makeText(getApplicationContext(), "恭喜你过关了！", Toast.LENGTH_SHORT).show();
			startActivity(new Intent(this,LiangtanActivity8.class));
			finish();
		}
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_chen_jia_liang7);
		
		final ViewPager page = (ViewPager) findViewById(R.id.pager);
		LayoutInflater layoutInflater = getLayoutInflater();
		View layout1 = layoutInflater.inflate(R.layout.page1, null);
		View layout2 = layoutInflater.inflate(R.layout.page2, null);
		
		imageButton1 = (ImageButton) layout1.findViewById(R.id.ImageButton1);
		imageButton2 = (ImageButton) layout1.findViewById(R.id.ImageButton2);
		imageButton3 = (ImageButton) layout1.findViewById(R.id.ImageButton3);
		imageButton4 = (ImageButton) layout1.findViewById(R.id.ImageButton4);
		imageButton5 = (ImageButton) layout1.findViewById(R.id.ImageButton5);
		
		final ImageButton layout2_imagebutton1 = (ImageButton) layout2.findViewById(R.id.page2_ImageButton1);
		final ImageButton layout2_imagebutton2 = (ImageButton) layout2.findViewById(R.id.page2_ImageButton2);
		final ImageButton layout2_imagebutton3 = (ImageButton) layout2.findViewById(R.id.page2_ImageButton3);
		final ImageButton layout2_imagebutton4 = (ImageButton) layout2.findViewById(R.id.page2_ImageButton4);
		final ImageButton layout2_imagebutton5 = (ImageButton) layout2.findViewById(R.id.page2_ImageButton5);
		
		arrayList.add(layout1);
		arrayList.add(layout2);
		
		page.setAdapter(new PagerAdapter() {
			
			@Override
			public Object instantiateItem(View container, int position) {
				View layout = arrayList.get(position);
				page.addView(layout);
				return layout;
			}
			@Override
			public void destroyItem(View container, int position, Object object) {
				View layout = arrayList.get(position);
				page.removeView(layout);
			}
			@Override
			public boolean isViewFromObject(View arg0, Object arg1) {
				// TODO Auto-generated method stub
				return arg0==arg1;
			}
			
			@Override
			public int getCount() {
				// TODO Auto-generated method stub
				return arrayList.size();
			}
		});
		imageButton1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				if(!isFirst1){
					num++;
					fun();
					imageButton1.setBackgroundResource(R.drawable.ic_launcher);
					layout2_imagebutton1.setBackgroundResource(R.drawable.ic_launcher);
				}
			}
		});
		layout2_imagebutton1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(!isFirst1){
					num++;
					fun();
					imageButton1.setBackgroundResource(R.drawable.ic_launcher);
					layout2_imagebutton1.setBackgroundResource(R.drawable.ic_launcher);
				}
			}
		});
		imageButton2.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				if(!isFirst2){
					num++;
					fun();
					imageButton2.setBackgroundResource(R.drawable.ic_launcher);
					layout2_imagebutton2.setBackgroundResource(R.drawable.ic_launcher);
				}
			}
		});
		layout2_imagebutton2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(!isFirst2){
					num++;
					fun();
					imageButton2.setBackgroundResource(R.drawable.ic_launcher);
					layout2_imagebutton2.setBackgroundResource(R.drawable.ic_launcher);
				}
			}
		});
		imageButton3.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				if(!isFirst3){
					num++;
					fun();
					imageButton3.setBackgroundResource(R.drawable.ic_launcher);
					layout2_imagebutton3.setBackgroundResource(R.drawable.ic_launcher);
				}
			}
		});
		layout2_imagebutton3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(!isFirst3){
					num++;
					fun();
					imageButton3.setBackgroundResource(R.drawable.ic_launcher);
					layout2_imagebutton3.setBackgroundResource(R.drawable.ic_launcher);
				}
			}
		});
		imageButton4.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				if(!isFirst4){
					num++;
					fun();
					imageButton4.setBackgroundResource(R.drawable.ic_launcher);
					layout2_imagebutton4.setBackgroundResource(R.drawable.ic_launcher);
				}
			}
		});
		layout2_imagebutton4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(!isFirst4){
					num++;
					fun();
					imageButton4.setBackgroundResource(R.drawable.ic_launcher);
					layout2_imagebutton4.setBackgroundResource(R.drawable.ic_launcher);
				}
			}
		});
		imageButton5.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				if(!isFirst5){
					num++;
					fun();
					imageButton5.setBackgroundResource(R.drawable.ic_launcher);
					layout2_imagebutton5.setBackgroundResource(R.drawable.ic_launcher);
				}
			}
		});
		layout2_imagebutton5.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(!isFirst5){
					num++;
					fun();
					imageButton5.setBackgroundResource(R.drawable.ic_launcher);
					layout2_imagebutton5.setBackgroundResource(R.drawable.ic_launcher);
				}
			}
		});
		
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
