package com.zhangkai.common.utils;

import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

import com.zhangkai.bean.Person;

/**
 * 
 * @ClassName: MyTest
 * @Description: 测试类
 * @author: ZK
 * @date: 2019年6月17日 上午8:58:03
 */
public class PersonTest {
	// 测试Person类
	@SuppressWarnings("deprecation")
	@Test
	public void utilsTest() throws UnsupportedEncodingException {
		// 生成10000个对象
		for (int i = 0; i < 10000; i++) {
			// 注册日期属性值模拟2010年1月1日至今任意随机时间（4分）
			Date fromDate = new Date(110, 00, 01);
			System.out.println(fromDate);
			long srcTime = fromDate.getTime();
			Date endDate = new Date();
			long tarTime = endDate.getTime();
			endDate.setTime((long) (srcTime + Math.random() * (tarTime - srcTime)));
			// 姓名属性值调用StringUtil.generateChineseName()创建（4分）
			// 年龄属性值调用RandomUtil.random()创建，必须在1-120岁之间（4分）
			// 介绍属性值调用StringUtil.randomChineseString()创建，字数为140个随机汉字（4分）
			Person person = new Person(i, StringUtil.generateChineseName(), StringUtil.randomChineseString(140),
					RandomUtil.random(1, 120), endDate);
			System.out.println(person);
		}
	}

	@Test
	public void testDate() {
		Calendar c = Calendar.getInstance();
		// 月份0--11
		c.set(2010, 0, 1);
		// 获取2010年1月1日的毫秒数
		long l = c.getTimeInMillis();
		System.out.println(l);
		// 设置日历时间为当前的日期
		c.setTime(new Date());
		// 当前时间的毫秒数
		long l2 = c.getTimeInMillis();
		System.out.println(l2);
		for (int i = 0; i < 1000; i++) {
			long x = l + (long) (Math.random() * (l2 - l));
			// 用毫秒数设置为当前日历日期
			c.setTimeInMillis(x);
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
			System.out.println(df.format(c.getTime()));
		}
	}
}
