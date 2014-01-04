package com.example.ex_templete;

import com.example.ex_templete.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;
import android.widget.Toast;

public class YeXiangActivity extends Activity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ye_xiang_lqm);
        //陈聪
        TextView mTextView = (TextView)findViewById(R.id.textview);
//        mTextView.setBackgroundResource(R.drawable.zhong500wan);
        mTextView.setBackgroundResource(R.drawable.a);
        showToast();
    }
    
    
    //陈星
    private void showToast()
    {
        Toast.makeText(this, "toast test...", Toast.LENGTH_LONG).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}
