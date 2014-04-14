package com.example.ex_templete;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

public class XiYouJiActivity extends Activity implements OnClickListener
{

    private ImageView tangseng;
    private int times;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xi_you_ji);

        Log.e("2014/04/12修改----", "by______HQH");
        tangseng = (ImageView) findViewById(R.id.tangseng);
        ImageView tangseng2 = (ImageView) findViewById(R.id.tangseng2);
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
            changeImage();
            times++;
            if (times > 3)
            {
                times = 0;
            }
            break;

        default:
            break;
        }
    }

    private void changeImage()
    {
        switch (times)
        {
        case 0:
            tangseng.setImageResource(R.drawable.sunwukong);
            Log.e("2014/04/12修改----", "by______LWF");
            break;
        case 1:
            tangseng.setImageResource(R.drawable.zhubajie);
            Log.e("2014/04/12修改----", "by______YXD");
            break;
        case 2:
            tangseng.setImageResource(R.drawable.shazeng);
            Log.e("2014/04/12修改----", "by______ZYH");
            break;
        case 3:
            //下一组的跳转事件
            tangseng.setImageResource(R.drawable.xiyouji_tangseng);
            startActivity(new Intent(this, SuibianActivity.class));
            break;

        default:
            break;
        }
    }

}
