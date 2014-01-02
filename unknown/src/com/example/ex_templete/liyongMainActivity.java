package com.example.ex_templete;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 *	主Activity，程序入口类
 */
@SuppressLint("NewApi")
public class liyongMainActivity extends Activity {
	//定义ActionBar
	private ActionBar actionBar;
	
	//定义Handler句柄
	private final Handler handler = new Handler();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		initView();
		
		initData();
	}

	/**
	 * 初始化组件
	 */
	private void initView(){
		//�õ�ActionBar
		actionBar = getActionBar();
	}
	
	/**
	 * 初始化数据
	 */
	private void initData(){
		//设置ActionBar标题不显示
		actionBar.setDisplayShowTitleEnabled(false);
		
		//设置ActionBar的背景
		actionBar.setBackgroundDrawable(getResources().getDrawable(R.drawable.actionbar_gradient_bg));
		actionBar.setIcon(R.drawable.xianjian_logo);
		//设置ActionBar左边默认的图标是否可用
		actionBar.setDisplayUseLogoEnabled(true);
		
		//设置导航模式为Tab选项标签导航模式
		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
		
		//设置ActinBar添加Tab选项标签
		actionBar.addTab(actionBar.newTab().setText("弓箭手").setTabListener(new liyongTabListener<liyongFragmentPage1>(this,liyongFragmentPage1.class)));
		actionBar.addTab(actionBar.newTab().setText("刺客").setTabListener(new liyongTabListener<liyongFragmentPage2>(this,liyongFragmentPage2.class)));
		actionBar.addTab(actionBar.newTab().setText("剑士").setTabListener(new liyongTabListener<liyongFragmentPage3>(this,liyongFragmentPage3.class)));
				
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.liyongmain, menu);	
		return true;
	}

	public void bt_startActivity(View v) {
		Toast.makeText(this, "点击跳转下个activity", Toast.LENGTH_SHORT).show();
	}
	
	@Override
	public boolean onOptionsItemSelected(final MenuItem item) {
		switch (item.getItemId()) {
		case R.id.menu_refresh:
			//选中刷新按钮后刷新一秒钟
			item.setActionView(R.layout.actionbar_progress);
			handler.postDelayed(new Runnable() {
				public void run() {
					item.setActionView(null);
				}
			}, 1000);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
}
