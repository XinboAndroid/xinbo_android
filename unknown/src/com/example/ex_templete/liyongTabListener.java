package com.example.ex_templete;

import android.annotation.SuppressLint;
import android.app.ActionBar.Tab;
import android.app.ActionBar.TabListener;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;

@SuppressLint("NewApi")
public class liyongTabListener<T extends Fragment> implements TabListener {
	private Fragment fragment;
	
	private final Activity mActivity;
	
	private final Class<T> mClass;
	
	public liyongTabListener(Activity activity, Class<T> clz){
		mActivity = activity;  
		
		mClass = clz; 
	}
	
	@SuppressLint("NewApi")
	@Override
	public void onTabSelected(Tab tab, FragmentTransaction ft) {
		if(fragment == null){
			fragment = Fragment.instantiate(mActivity, mClass.getName());
			ft.add(android.R.id.content, fragment, null); 	
		}
		ft.attach(fragment); 
		
	}

	@SuppressLint("NewApi")
	@Override
	public void onTabUnselected(Tab tab, FragmentTransaction ft) {
		if (fragment != null) {
			ft.detach(fragment);
		}
	}

	@Override
	public void onTabReselected(Tab tab, FragmentTransaction ft) {
		
	}
}
