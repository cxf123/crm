package com.itsource.util;

import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;

/**
 * 加密工具  md5的加密方式是不可逆的
 */
public class MD5Util {
	//加盐的常量
	public static String saltString ="干一波crm";
	//加密多少次的常量
	public  static int iterations  =888;
	//加密方法
	public static  String  encrypt(String content) {
		
		String algorithmName="md5";   //加密方式
		//创建自己的盐值;
		ByteSource salt = ByteSource.Util.bytes(saltString);
		//把加密方式,用户密码,盐值,加密次数传入进去创建一个SimpleHash类,然后把此类toString就可以得到一个加密后的密码;
		SimpleHash simpleHash = new SimpleHash(algorithmName, content, salt, iterations);
		return simpleHash.toString();

	}
}
