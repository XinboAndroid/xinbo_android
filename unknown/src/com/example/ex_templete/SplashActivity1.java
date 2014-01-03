package com.example.ex_templete;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;

//第一个页面
//第二个 YangPeiboActivity2
public class SplashActivity1 extends Activity
{
    private AnimationDrawable mGif;
       
	@Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Log.e("SplashActivity1", "onCreate() 111 333");
        initUi();
    }
    
    private void initUi() {
    	ImageView imageView = (ImageView) findViewById(R.id.splashView);
    	mGif = (AnimationDrawable) imageView.getDrawable();
	}
    public void play(View v) {
    	mGif.stop();
    	mGif.start();

        Log.e("SplashActivity1", "play()");
	}
    //12.2 23:19 新增注释   按钮的点击事件  ljy
	public  void btnnext(View v)
    {		
        Intent intent = new Intent(this, YangPeiboActivity2.class);
		startActivity(intent );
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
