package com.example.ex_templete;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class OpxinActivity extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opxin);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.opxin, menu);
        return true;
    }
}
