package com.zhangkai.test;

import java.io.UnsupportedEncodingException;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

import com.zhangkai.bean.Person;
import com.zhangkai.common.utils.RandomUtil;
import com.zhangkai.common.utils.StringUtil;

/**
 * 
 * @ClassName: MyTest
 * @Description: 测试类
 * @author: ZK
 * @date: 2019年6月17日 上午8:58:03
 */
public class MyTest {
	//测试Person类
	@Test
	public void utilsTest() throws UnsupportedEncodingException {
		for (int i = 0; i < 10000; i++) {
			Date date = new Date();
			int year = RandomUtil.random(110, 119);
			date.setYear(year );
			int month = RandomUtil.random(1, 12);
			date.setMonth(month);
			if (month==2) {
				date.setDate(RandomUtil.random(1, 28));
			}else if (month==4||month==6||month==9||month==11) {
				date.setDate(RandomUtil.random(1, 30));
			}else {
				date.setDate(RandomUtil.random(1, 31));
			}
			Person person = new Person(i, StringUtil.generateChineseName(), StringUtil.randomChineseString(140),RandomUtil.random(1,120), date);
			System.out.println(person);
		}
	}
	
}
