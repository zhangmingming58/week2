package com.zhangkai.common.utils;

import java.util.regex.Pattern;
/**
 * 
 * @ClassName: RandomUtil
 * @Description: 验证工具类
 * @author: ZK
 * @date: 2019年6月17日 上午8:38:18
 */
public class InvolidateUtil {
	//方法1：判断源字符串是否有值，空引号(空白字符串)也算没值 (5分)
	public static boolean hasLength(String src){
		return null!=src &&src.length()>0;
		
	}
	//方法2：判断源字符串是否有值，空引号(空白字符串)和空格也算没值 (5分)
	public static boolean hasText(String src){
	    //实现代码
		return null!=src &&src.trim().length()>0;
		
		
	}
	//方法3：判断是否为手机号码 (5分)
	public static boolean isMobile(String src){
	     String str ="1[34578]\\d{9}" ;
			return Pattern.matches(str, src);
	}
	//方法4：判断是否为邮箱 (5分) 
	public static boolean isEmail(String src){

		String str ="\\w+@\\w+\\.(com|cn)";
	
		return Pattern.matches(str, src);
		
	}
//	方法5：反转字符串，例如参数值是“abcdefg”，则输出“gfedcba” (5分)
	public static String reverse(String src){
		
	   StringBuilder sb = new StringBuilder(src);
		return sb.reverse().toString();
	}
	
	/*
	* 方法：生成唯一标签名，处理步骤：
	* 1、全部变成小写；
	* 2、清空两边的空格，把中间所有的空格替换成“-”；
	* 3、使用URLEncoder.encode()编码
	* 最后返回处理的结果。
	* 举例“Spring MVC”处理后为“spring-mvc”，“Spring Mvc”处理后也为“spring-mvc”
	*/
	public static String toUniqueTerm(String str) {
		 return str.toLowerCase().replaceAll(" ", "-");
	}

}
