package com.example.ex_templete;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class LoLActivity3 extends Activity {
	private String[] name={"寰烽偊鎬荤","涓嶈涔嬪垉","鎺㈤櫓瀹�","寰风帥瑗夸簹涔嬪姏","鍏夎緣濂抽儙","鏆楀鐚庢墜",
			"娴锋磱涔嬬伨","鐨煄濂宠","鍐版櫠鍑ゅ嚢","楝兼湳濡栧К"};
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lo_lactivity3);
		ListView listView=(ListView) findViewById(R.id.listView_lolactivity3);
		listView.setAdapter(new BaseAdapter() {
			
			@Override
			public View getView(int arg0, View arg1, ViewGroup arg2) {
				View layout=getLayoutInflater().inflate(R.layout.layout_lolactivity3, null);
				ImageView imageView=(ImageView) layout.findViewById(R.id.imageView1_lolactivity3);
				switch (arg0) {
				case 0:
					imageView.setImageResource(R.drawable.icon0);
					break;
				case 1:
					imageView.setImageResource(R.drawable.icon1);
					break;
				case 2:
					imageView.setImageResource(R.drawable.icon2);
					break;
				case 3:
					imageView.setImageResource(R.drawable.icon3);
					break;
				case 4:
					imageView.setImageResource(R.drawable.icon4);
					break;
				case 5:
					imageView.setImageResource(R.drawable.icon5);
					break;
				case 6:
					imageView.setImageResource(R.drawable.icon6);
					break;
				case 7:
					imageView.setImageResource(R.drawable.icon7);
					break;
				case 8:
					imageView.setImageResource(R.drawable.icon8);
					break;
				case 9:
					imageView.setImageResource(R.drawable.icon9);
					break;

				default:
					break;
				}
				
				TextView textView=(TextView) layout.findViewById(R.id.textView1_lolactivity3);
				textView.setText(name[arg0]);
				return layout;
			}
			
			@Override
			public long getItemId(int arg0) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public Object getItem(int arg0) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int getCount() {
				// TODO Auto-generated method stub
				return 10;
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.lo_lactivity3, menu);
		return true;
	}

}
