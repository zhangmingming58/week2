package com.zhangkai.common.utils;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
/**
 * 
 * @ClassName: RandomUtil
 * @Description: 流工具类
 * @author: ZK
 * @date: 2019年6月17日 上午8:38:18
 */
public class StreamUtil {

	/*
	 * 方法1：批量关闭流，参数能传无限个。(3分) 例如传入FileInputStream对象、JDBC中Connection对象都可以关闭。
	 */
	public static void closeAll(Closeable... closeable) {
		if (closeable != null && closeable.length > 0) {
			for (Closeable close : closeable) {
				try {
					close.close();//关闭成功
				} catch (Exception e) {
					e.printStackTrace();
				}
			
			}
		}
	}

	/*
	 * 方法2：传入一个文本文件对象，默认为UTF-8编码，返回该文件内容(3分)，要求方法内部调用上面第1个方法关闭流(3分)
	 */
	public static String readTextFile(InputStream src) throws IOException {
		ByteArrayOutputStream  out = new ByteArrayOutputStream();
		  byte[] b =new byte[1024];
		    int len=0;
		  while( (len= src.read(b))!=-1) {
			  out.write(b);
		  }
		  StreamUtil.closeAll(src,out);//关流
		  String string = out.toString("utf-8");
		
		return string;
	}

	/*
	 * 方法3：传入文本文件对象，返回该文件内容(3分)，并且要求内部调用上面第2个方法(5分)。* 这是典型的方法重载，记住了吗？少年…
	 */
	public static String readTextFile(File txtFile) throws FileNotFoundException, IOException {
		
	  return 	StreamUtil.readTextFile(new FileInputStream(txtFile));
	
	}
}
