package com.example.demo.spi.common.md5;

import com.google.common.base.Charsets;
import com.google.common.hash.Hashing;

import java.security.MessageDigest;

/**
 * Created by xu_yanga on 2017/10/14.
 */
public class Md5Utils {

    public static String EncoderByMd5(String str) throws Exception {
        MessageDigest digest = MessageDigest.getInstance("MD5");
        digest.update(str.getBytes());
        byte messageDigest[] = digest.digest();
        return toHexString(messageDigest);
    }

    public static String Md5(String str) throws Exception {
        return Hashing.md5().newHasher().putString(str, Charsets.UTF_8).hash().toString();
    }

    private static String toHexString(byte[] b) {
        StringBuilder sb = new StringBuilder(b.length * 2);
        for (int i = 0; i < b.length; i++) {
            sb.append(HEX_DIGITS[(b[i] & 0xf0) >>> 4]);
            sb.append(HEX_DIGITS[b[i] & 0x0f]);
        }
        return sb.toString();
    }

    private static final char HEX_DIGITS[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
}
