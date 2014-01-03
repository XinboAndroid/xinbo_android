package com.example.ex_templete;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
//page 5
//next to BaofengActivity6
public class ZwtActivity5 extends Activity
{
    private int[] imagev = new int[]
    { R.drawable.aa, R.drawable.ab, R.drawable.ac, R.drawable.ad,
            R.drawable.ae, R.drawable.af };

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zwt);
        GridView gridView = (GridView) findViewById(R.id.gridView1);
        gridView.setAdapter(new BaseAdapter()
        {
            @Override
            public View getView(int arg0, View arg1, ViewGroup arg2)
            {
                LayoutInflater layoutInflater = getLayoutInflater();
                View layout = layoutInflater.inflate(R.layout.item, null);
                ImageView imageView = (ImageView) layout
                        .findViewById(R.id.imageView1);
                imageView.setImageResource(imagev[arg0]);
                return layout;
            }

            @Override
            public long getItemId(int arg0)
            {
                return 0;
            }

            @Override
            public Object getItem(int arg0)
            {
                return null;
            }

            @Override
            public int getCount()
            {
                return imagev.length;
            }
        });
    }

    public void bntNext(View v)
    {
        Intent intent = new Intent(ZwtActivity5.this, BaofengActivity6.class);
        startActivity(intent);
        finish();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}
