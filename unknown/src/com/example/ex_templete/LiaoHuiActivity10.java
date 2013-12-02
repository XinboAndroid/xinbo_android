package com.example.ex_templete;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Gravity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class LiaoHuiActivity10 extends Activity {

    private TextView mtextView;
	private RadioGroup mradioGroup;
	private RadioButton mradioButton1;
	private RadioButton mradioButton2;
	private RadioButton mradioButton3;
	private Button mbutton;


	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liaohui);
        initUI();
        //被忽悠了，我还以为是啥答案呢
        mradioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				if(checkedId == mradioButton2.getId())
				{
					DisplayToast("正确答案 "+mradioButton2.getText()+",恭喜你，回答正确！");
				}else
				{
					DisplayToast("答案错误，请重新作答！");
				}
			}


		});
        
        
    }
	private void DisplayToast(String str) {
		// TODO Auto-generated method stub
		Toast toast=Toast.makeText(this, str, Toast.LENGTH_LONG);
		toast.setGravity(Gravity.TOP, 0, 220);
		toast.show();
		
	}
	public void btonClick(View v) {
		
//		Intent intent=new Intent(this, eighthactivity.class);
//		startActivity(intent);

	}


    private void initUI() {
    	mtextView = (TextView) findViewById(R.id.textView1);
    	mradioGroup = (RadioGroup) findViewById(R.id.radioGroup1);
    	mradioButton1 = (RadioButton) findViewById(R.id.radio0);
    	mradioButton2 = (RadioButton) findViewById(R.id.radio1);
    	mradioButton3 = (RadioButton) findViewById(R.id.radio2);
    	mbutton = (Button) findViewById(R.id.button1);
    	
		
	}


	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
