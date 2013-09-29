package com.example.ex_templete;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

public class AESUtils
{
    public static void main(String[] args) throws Exception
    {
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
        long lUseTime = System.currentTimeMillis() - lStart;
        System.out.println("加密耗时：" + lUseTime + "毫秒");
        // 解密
        lStart = System.currentTimeMillis();
        String DeString = AESUtils.Decrypt(enString, cKey);
        System.out.println("解密后的字串是：" + DeString);
        lUseTime = System.currentTimeMillis() - lStart;
        System.out.println("解密耗时：" + lUseTime + "毫秒");
    }

    public static String Decrypt(String sSrc, String sKey) throws Exception
    {
        try
        {
            // 判断Key是否正确
            if (sKey == null)
            {
                System.out.print("Key为空null");
                return null;
            }
            // 判断Key是否为16位
            if (sKey.length() != 16)
            {
                System.out.print("Key长度不是16位");
                return null;
            }
            byte[] raw = sKey.getBytes("ASCII");
            SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.DECRYPT_MODE, skeySpec);
            byte[] encrypted1 = hex2byte(sSrc);
            try
            {
                byte[] original = cipher.doFinal(encrypted1);
                String originalString = new String(original);
                return originalString;
            }
            catch (Exception e)
            {
                System.out.println(e.toString());
                return null;
            }
        }
        catch (Exception ex)
        {
            System.out.println(ex.toString());
            return null;
        }
    }

    // 判断Key是否正确
    public static String Encrypt(String sSrc, String sKey) 
    {
        if (sKey == null)
        {
            System.out.print("Key为空null");
            return null;
        }
        // 判断Key是否为16位
        if (sKey.length() != 16)
        {
            System.out.print("Key长度不是16位");
            return null;
        }
        byte[] raw;
        try
        {
            raw = sKey.getBytes("ASCII");
            SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.ENCRYPT_MODE, skeySpec);
            byte[] encrypted = cipher.doFinal(sSrc.getBytes());
            return byte2hex(encrypted).toLowerCase();
        }
        catch (UnsupportedEncodingException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (NoSuchAlgorithmException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (NoSuchPaddingException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (InvalidKeyException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (IllegalBlockSizeException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (BadPaddingException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

    public static byte[] hex2byte(String strhex)
    {
        if (strhex == null)
        {
            return null;
        }
        int l = strhex.length();
        if (l % 2 == 1)
        {
            return null;
        }
        byte[] b = new byte[l / 2];
        for (int i = 0; i != l / 2; i++)
        {
            b[i] = (byte) Integer.parseInt(strhex.substring(i * 2, i * 2 + 2),
                    16);
        }
        return b;
    }

    public static String byte2hex(byte[] b)
    {
        String hs = "";
        String stmp = "";
        for (int n = 0; n < b.length; n++)
        {
            stmp = (java.lang.Integer.toHexString(b[n] & 0XFF));
            if (stmp.length() == 1)
            {
                hs = hs + "0" + stmp;
            }
            else
            {
                hs = hs + stmp;
            }
        }
        return hs.toUpperCase();
    }
}
// 以上代码执行结果
// 加密后的字串是：e965a929ae598b701bc2bc4714164c27524aab4769f269c434c55b61e398600175a38e0a4794cdef9c0463a182d2cde3
// 加密耗时：672毫秒
// 解密后的字串是：Email : xxx@xxx.com
// 解密耗时：0毫秒
