package com.zhangkai.common.utils;

import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;

import org.junit.Test;

public class StringUtilTest {
	// 测试空字符串
	@Test
	public void testHasLength() {
		System.out.println(StringUtil.hasLength(""));
		System.out.println(StringUtil.hasLength(" "));
		System.out.println(StringUtil.hasLength("dsa"));
	}

	// 测试是否有内容
	@Test
	public void testHasText() {
		System.out.println(StringUtil.hasText(""));
		System.out.println(StringUtil.hasText(" "));
		System.out.println(StringUtil.hasText("dsa"));
	}

	// 测试指定个数中文
	@Test
	public void testRandomChineseString() throws UnsupportedEncodingException {
		for (int i = 0; i < 10; i++) {

			System.out.println(StringUtil.randomChineseString(i));
		}
	}

	// 测试中文名字
	@Test
	public void testGenerateChineseName() throws UnsupportedEncodingException {
		for (int i = 0; i < 10; i++) {
			System.out.println(StringUtil.generateChineseName());
		}
	}

}
