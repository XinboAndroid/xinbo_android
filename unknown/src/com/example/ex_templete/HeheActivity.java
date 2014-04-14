package com.example.ex_templete;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class HeheActivity extends Activity
{
    private boolean isGoNext;

    /**
     * @wyx
     * 2014-0414 
     */
    public void btnShowSurprise(View v)
    {
        //跳转下一个页面
        if(isGoNext)
        {
            View layout = findViewById(R.id.retive_view);
            layout.setBackgroundResource(R.drawable.ppmm2);
            Toast.makeText(HeheActivity.this, "哈哈，没有骗你吧。。。", Toast.LENGTH_LONG).show();
            v.postDelayed(new Runnable()
            {
                
                @Override
                public void run()
                {
                    //跳转到下一个页面接口；
                    Intent intent = null;
                    //跳转可以修改HahaActivity类；
                    intent = new Intent(HeheActivity.this,HahaActivity.class);
                    startActivity(intent);
                    finish();
                }
            }, 2000);
        }
        if(!isGoNext)
        {
            new AlertDialog.Builder(this).setTitle("")
            .setMessage("Unfortunately,SimplePuzzle    \nhas stopped.")
            .setNegativeButton("OK", new DialogInterface.OnClickListener()
            {
                
                @Override
                public void onClick(DialogInterface dialog, int which)
                {
                    isGoNext = true;
                    Toast.makeText(HeheActivity.this, "再点，还会有惊奇的哦", Toast.LENGTH_LONG).show();
                }
            })
            .show();
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hehe);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.hehe, menu);
        return true;
    }

}
