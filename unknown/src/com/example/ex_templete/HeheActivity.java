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
        //璺宠浆涓嬩竴涓〉闈�
        if(isGoNext)
        {
            View layout = findViewById(R.id.retive_view);
            layout.setBackgroundResource(R.drawable.ppmm2);
            Toast.makeText(HeheActivity.this, "鍝堝搱锛屾病鏈夐獥浣犲惂銆傘�銆�", Toast.LENGTH_LONG).show();
            v.postDelayed(new Runnable()
            {
                
                @Override
                public void run()
                {
                    //璺宠浆鍒颁笅涓�釜椤甸潰鎺ュ彛锛�
                    Intent intent = null;
                    //璺宠浆鍙互淇敼HahaActivity绫伙紱
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
                    Toast.makeText(HeheActivity.this, "鍐嶇偣锛岃繕浼氭湁鎯婂鐨勫摝", Toast.LENGTH_LONG).show();
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
