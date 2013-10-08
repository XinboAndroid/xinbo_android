package com.example.ex_templete;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;

public class SplashActivity1 extends Activity
{
    private AnimationDrawable mGif;
       
	@Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Log.e("SplashActivity1", "onCreate()");
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
	public  void btnnext(View v)
    {		
        Intent intent = new Intent(this, YangPeiboActivity2.class);
		startActivity(intent );
		
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}
