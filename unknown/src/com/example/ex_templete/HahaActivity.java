package com.example.ex_templete;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class HahaActivity extends Activity
{

    private ViewPager viewPager_guide;
    //引导界面的图片id
    int imageId_guide[]={R.drawable.guide_1,R.drawable.guide_2,R.drawable.guide_3};
    ArrayList<View>arrayList_view=new ArrayList<View>();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tmall_guide);
        //初始化ViewPager
        initViewPager();
    }

    private void initViewPager()
    {
        for(int i=0;i<imageId_guide.length;i++){
            View layout = getLayoutInflater().inflate(R.layout.guide_viewpager_item, null);
            ImageView image=(ImageView) layout.findViewById(R.id.imageView1);
            image.setImageResource(imageId_guide[i]);
            if(i==(imageId_guide.length-1)){
                Button btn_guide=(Button) layout.findViewById(R.id.button1);
                btn_guide.setVisibility(View.VISIBLE);
                btn_guide.setOnClickListener(new OnClickListener()
                {
                    
                    @Override
                    public void onClick(View arg0)
                    {
                      Intent intent=new Intent(HahaActivity.this,XiYouJiActivity.class);
                      startActivity(intent);
                      finish();
                        
                    }
                });
            }
            arrayList_view.add(layout);
            
        }
        viewPager_guide = (ViewPager) findViewById(R.id.viewpager_guide);
        viewPager_guide.setAdapter(new PagerAdapter()
        {
            @Override
            public Object instantiateItem(View container, int position)
            {
                View layout=arrayList_view.get(position);
                viewPager_guide.addView(layout);
                return layout;
            }
            @Override
            public void destroyItem(View container, int position, Object object)
            {
                View layout=arrayList_view.get(position);
                viewPager_guide.removeView(layout);
            }
            
            @Override
            public boolean isViewFromObject(View arg0, Object arg1)
            {
                // TODO Auto-generated method stub
                return arg0==arg1;
            }
            
            @Override
            public int getCount()
            {
                // TODO Auto-generated method stub
                return arrayList_view.size();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {

    	Log.e("HahaActivity", "onCreateOptionsMenu() 2014 04 14 14:55");
        
        getMenuInflater().inflate(R.menu.tmall_guide, menu);
        return true;
    }

}
