package com.zhangkai.common.utils;


import java.util.Set;

import org.junit.Test;
/**
 * 
 * @ClassName: RandomUtilTest 
 * @Description: 随机数测试类
 * @author: ZK
 * @date: 2019年6月17日 上午10:14:00
 */
public class RandomUtilTest {
//测试随机数
	@Test
	public void testRandom() {
		for (int i = 0; i < 5; i++) {
			System.out.println(RandomUtil.random(0, 5));
		}
	}
//测试不同随机数
	@Test
	public void testSubRandom() {
		for (int i = 0; i < 5; i++) {
			Set<Integer> subRandom = RandomUtil.subRandom(0, 5,5);
			for (int j : subRandom) {
				System.out.print(j+",");
			}
			System.out.println();
		}
	}

//测试不同随机数
	@Test
	public void testSubRandom1() {
		for (int i = 0; i < 5; i++) {
			int[] random1 = RandomUtil.subRandom1(0, 5, 5);
			for (int j : random1) {
				System.out.print(j+",");
			}
			System.out.println();
		}
	}

//测试随机字符
	@Test
	public void testRandomCharacter() {
		for (int i = 0; i < 5; i++) {
			System.out.println(RandomUtil.randomCharacter());
		}
	}
//测试验证码
	@Test
	public void testRandomString() {
		for (int i = 0; i < 5; i++) {
			System.out.println(RandomUtil.randomString(5));
		}
	}

}
