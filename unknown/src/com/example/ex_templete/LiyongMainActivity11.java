package com.example.ex_templete;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 *	涓籄ctivity锛岀▼搴忓叆鍙ｇ被
 */
@SuppressLint("NewApi")
public class LiyongMainActivity11 extends Activity {
	//瀹氫箟ActionBar
	private ActionBar actionBar;
	
	//瀹氫箟Handler鍙ユ焺
	private final Handler handler = new Handler();

	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		initView();
		initData();
		
	}

	/**
	 * 鍒濆鍖栫粍浠�
	 */
	private void initView(){
		//锟矫碉拷ActionBar
		actionBar = getActionBar();
	}
	
	/**
	 * 鍒濆鍖栨暟鎹�
	 */
	private void initData(){
		//璁剧疆ActionBar鏍囬涓嶆樉绀�
		actionBar.setDisplayShowTitleEnabled(false);
		
		//璁剧疆ActionBar鐨勮儗鏅�
		actionBar.setBackgroundDrawable(getResources().getDrawable(R.drawable.actionbar_gradient_bg));
		actionBar.setIcon(R.drawable.xianjian_logo);
		//璁剧疆ActionBar宸﹁竟榛樿鐨勫浘鏍囨槸鍚﹀彲鐢�
		actionBar.setDisplayUseLogoEnabled(true);
		
		//璁剧疆瀵艰埅妯″紡涓篢ab閫夐」鏍囩瀵艰埅妯″紡
		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
		
		//璁剧疆ActinBar娣诲姞Tab閫夐」鏍囩
		actionBar.addTab(actionBar.newTab().setText("寮撶鎵�").setTabListener(new liyongTabListener<liyongFragmentPage1>(this,liyongFragmentPage1.class)));
		actionBar.addTab(actionBar.newTab().setText("鍒哄").setTabListener(new liyongTabListener<liyongFragmentPage2>(this,liyongFragmentPage2.class)));
		actionBar.addTab(actionBar.newTab().setText("鍓戝＋").setTabListener(new liyongTabListener<liyongFragmentPage3>(this,liyongFragmentPage3.class)));
				
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.liyongmain, menu);	
		return true;
	}
	private Toast toast;
	public void bt_startActivity(View v1) {
		if(toast==null){
			
			toast = new Toast(this);
		}
//		鑷畾涔塼oast
		   LayoutInflater inflate = (LayoutInflater)
	                this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	        View v = inflate.inflate(R.layout.custom_toast, null);
	        TextView tv = (TextView)v.findViewById(R.id.textView1);
	        tv.setText("鍝堝柦");
	        toast.setView(v);
	        toast.setDuration(toast.LENGTH_LONG);
	    	toast.show();
	    	startActivity(new Intent(LiyongMainActivity11.this, Last5Activity.class));
	
	}
	
	@Override
	public boolean onOptionsItemSelected(final MenuItem item) {
		switch (item.getItemId()) {
		case R.id.menu_refresh:
			//閫変腑鍒锋柊鎸夐挳鍚庡埛鏂颁竴绉掗挓
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
