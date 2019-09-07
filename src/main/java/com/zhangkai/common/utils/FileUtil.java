package com.zhangkai.common.utils;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.springframework.web.multipart.MultipartFile;
/**
 * 
 * @ClassName: RandomUtil
 * @Description: 文件工具类
 * @author: ZK
 * @date: 2019年6月17日 上午8:38:18
 */
public class FileUtil {

	/**
	 * @Title: getName
	 * @Description: 上传文件
	 * @param file
	 * @return
	 * @throws IllegalStateException
	 * @throws IOException
	 * @return: String
	 */
	public static String getName(MultipartFile file) throws IllegalStateException, IOException {
		if (null != file && !file.isEmpty()) {
			String path = "g:/pic/";
			// 获取上传文件的原始名称 fjdskalhl.jpg
			String fileName = file.getOriginalFilename();
			// UUID防止文件重名
			String name = UUID.randomUUID() + fileName.substring(fileName.lastIndexOf("."));

			File file2 = new File(path + name);
			// 把文件写入硬盘
			file.transferTo(file2);
			return name;
		} else {
			return null;
		}

	}
}
