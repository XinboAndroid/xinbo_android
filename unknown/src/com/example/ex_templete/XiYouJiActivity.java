package com.example.ex_templete;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class XiYouJiActivity extends Activity implements OnClickListener
{

    private ImageView tangseng;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xi_you_ji);
        
        tangseng = (ImageView) findViewById(R.id.tangseng);
        ImageView tangseng2=(ImageView) findViewById(R.id.tangseng2);
        tangseng2.setOnClickListener(this);
       
        
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.xi_you_ji, menu);
        return true;
    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
        case R.id.tangseng2:
            tangseng.setImageResource(R.drawable.sunwukong);
            Log.e("2014/04/12修改----", "by______LWF");
            break;

        default:
            break;
        }
    }

}
