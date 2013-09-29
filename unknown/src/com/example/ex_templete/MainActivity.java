package com.example.ex_templete;

import java.io.UnsupportedEncodingException;

import android.os.Bundle;
import android.app.Activity;
import android.util.Base64;
import android.view.Menu;

public class MainActivity extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        

        /*
         * 加密用的Key 可以用26个字母和数字组成，最好不要用保留字符，虽然不会错，至于怎么裁决，个人看情况而定
         */
        String cKey = "51ctoandroidmkey";
        // 需要加密的字串
        String cSrc = "jacena20120911WednesdayDdfSXsFDfds";
        // 加密
        long lStart = System.currentTimeMillis();
        String enString = AESUtils.Encrypt(cSrc, cKey);
        System.out.println("加密后的字串是：" + enString);
        try
        {
            String baseEnStr = Base64.encodeToString(enString.getBytes("utf-8"), Base64.DEFAULT);
            System.out.println("加密后BASE64的字串是：" + baseEnStr);
        }
        catch (UnsupportedEncodingException e1)
        {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        long lUseTime = System.currentTimeMillis() - lStart;
        System.out.println("加密耗时：" + lUseTime + "毫秒");
        // 解密
        lStart = System.currentTimeMillis();
        String DeString = null;
        try
        {
            DeString = AESUtils.Decrypt(enString, cKey);
        }
        catch (Exception e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("解密后的字串是：" + DeString);
        lUseTime = System.currentTimeMillis() - lStart;
        System.out.println("解密耗时：" + lUseTime + "毫秒");
    
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}
