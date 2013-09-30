package com.example.ex_templete;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
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
        
        initUi();
    }
    
    private void initUi() {
    	ImageView imageView = (ImageView) findViewById(R.id.splashView);
    	mGif = (AnimationDrawable) imageView.getDrawable();
	}
    public void play(View v) {
    	mGif.stop();
    	mGif.start();
	}
	public  void btnnext(View v)
    {		
//      startActivity(new Intent(SplashActivity1.this,XXXX));
//		overridePendingTransition(SplashActivity1.this, XXX);
//		finish();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}
