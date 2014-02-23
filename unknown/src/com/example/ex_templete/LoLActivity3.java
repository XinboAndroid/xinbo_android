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
	private String[] name={"德邦总管","不详之刃","探险家","德玛西亚之力","光辉女郎","暗夜猎手",
			"海洋之灾","皮城女警","冰晶凤凰","鬼术妖姬"};
	

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
