package com.example.ex_templete;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Last5Activity extends Activity
{

	private ImageView mImageView;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ye_xiang_lqm);
		mImageView = (ImageView) findViewById(R.id.imageView_last5);
	}

	// 陈星
	public void showToast(View v)
	{
		Toast.makeText(this, "toast test...", Toast.LENGTH_LONG).show();
		// 陈聪
		mImageView.setImageResource(R.drawable.zhong500wan);
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setTitle("中大奖了！");
		builder.setMessage("恭喜你中了五百万！");
		builder.setPositiveButton("领奖", new DialogInterface.OnClickListener()
		{

			@Override
			public void onClick(DialogInterface dialog, int which)
			{
				Toast.makeText(Last5Activity.this, "开玩笑的", Toast.LENGTH_LONG)
						.show();
			}

		});
		builder.setNegativeButton("取消", null);
		AlertDialog dialog = builder.create();
		dialog.show();
	}

	public void btn_nextpage()
	{
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
