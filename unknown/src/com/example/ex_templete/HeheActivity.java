package com.example.ex_templete;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class HeheActivity extends Activity
{

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
