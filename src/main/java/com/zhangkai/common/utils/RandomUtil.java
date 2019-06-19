package com.zhangkai.common.utils;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * 
 * @ClassName: RandomUtil
 * @Description: 随机数工具类
 * @author: ZK
 * @date: 2019年6月17日 上午8:38:18
 */
public class RandomUtil {
	/**
	 * 
	 * @Title: random
	 * @Description:方法1：返回min-max之间的随机整数（包含min和max值），例如返回1-3之间的随机数，那么返回1或2或3都是正确的，返回4就不对。 (5分)
	 * @param min
	 * @param max
	 * @return
	 * @return: int
	 */
	public static int random(int min, int max) {
		Random random = new Random();
		return random.nextInt(max - min + 1) + min;
	}

	/**
	 * 
	 * @Title: subRandom
	 * @Description://方法2：在最小值min与最大值max之间截取subs个不重复的随机数。 例如在1-10之间取3个不重复的随机数，那么[2,6,9]是对的，[3,5,5]则不对，因为5重复了。应用场景：在100篇文章中随机取10篇文章，月考可能会使用到(8分)
	 * @param min
	 * @param max
	 * @param subs
	 * @return
	 * @return: int[]
	 */
	public static Set<Integer> subRandom(int min, int max, int subs) {

		// int[] num = new int[subs];
		Set<Integer> set = new HashSet<Integer>();
		while (set.size() != subs) {
			int i = random(min, max);
			set.add(i);
		}

		return set;
	}
	public static int[] subRandom1(int min, int max, int subs) {
		
		int[] num = new int[subs];
		int i = 0;
		Set<Integer> set = new HashSet<Integer>();
		while (set.size() != subs) {
			int a = random(min, max);
			boolean flag = set.add(a);
			if (flag) {
				num[i]=a;
				i++;
			}
		}
		
		return num;
	}

	/**
	 * 
	 * @Title: randomCharacter
	 * @Description: 方法3：返回1个1-9,a-Z之间的随机字符。 (8分)
	 * @return
	 * @return: char
	 */
	//
	public static char randomCharacter() {
		String str = "123456789qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
		int index = random(0, str.length() - 1);
		char c = str.charAt(index);
		return c;
	}

	/**
	 * 
	 * @Title: randomString
	 * @Description:返回参数length个字符串(5分)，方法内部要调用randomCharacter()方法 (4分)
	 * @param length 指定长度
	 * @return
	 * @return: String
	 */
	// 方法4：
	public static String randomString(int length) {
		String str = "";
		for (int i = 0; i < length; i++) {
			str += randomCharacter();
		}
		return str;
	}
}
