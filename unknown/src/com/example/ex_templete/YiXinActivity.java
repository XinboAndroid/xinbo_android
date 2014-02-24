package com.example.ex_templete;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class YiXinActivity extends Activity
{

	private String[] gupiaoname = {"中国软件","新南洋","喜临门","东风汽车","上海机场"};
	private String[] gupiaoprice = {"40.51","20.81","11.78","3.14","13.61"};
	private String[] gupiaoupordown = {"+9.28%","+8.27%","+8.57%","-3.9%","-1.38%"};
	private ListView gupiao_list;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_yi_xin);
		gupiao_list = (ListView) findViewById(R.id.gupiao_list);
		MyAdapter adapter = new MyAdapter();
		gupiao_list.setAdapter(adapter);
	}

	public void gotoNext(View v)
	{
		//到下一个页面的方法
	}
	
	class MyAdapter extends BaseAdapter
	{
		@Override
		public View getView(int position, View convertView, ViewGroup parent)
		{
			View layout = getLayoutInflater().inflate(R.layout.gupiao_item, null);
			TextView name = (TextView) layout.findViewById(R.id.gupiao_name);
			TextView price = (TextView) layout.findViewById(R.id.gupiao_price);
			TextView upordown = (TextView) layout.findViewById(R.id.gupiao_upordown);
			name.setText(gupiaoname[position]);
			price.setText(gupiaoprice[position]);
			upordown.setText(gupiaoupordown[position]);
			return layout;
		}
		
		@Override
		public int getCount()
		{
			return gupiaoname.length;
		}

		@Override
		public Object getItem(int position)
		{
			return null;
		}

		@Override
		public long getItemId(int position)
		{
			return 0;
		}
		
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		getMenuInflater().inflate(R.menu.yi_xin, menu);
		return true;
	}

}
