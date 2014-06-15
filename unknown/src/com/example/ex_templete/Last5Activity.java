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

	// 闄堟槦
	public void showToast(View v)
	{
		Toast.makeText(this, "toast test...", Toast.LENGTH_LONG).show();
		// 闄堣仾
		mImageView.setImageResource(R.drawable.zhong500wan);
		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setTitle("涓ぇ濂栦簡锛�");
		builder.setMessage("鎭枩浣犱腑浜嗕簲鐧句竾锛�");
		builder.setPositiveButton("棰嗗", new DialogInterface.OnClickListener()
		{

			@Override
			public void onClick(DialogInterface dialog, int which)
			{
				Toast.makeText(Last5Activity.this, "寮�帺绗戠殑", Toast.LENGTH_LONG)
						.show();
			}

		});
		builder.setNegativeButton("鍙栨秷", null);
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
