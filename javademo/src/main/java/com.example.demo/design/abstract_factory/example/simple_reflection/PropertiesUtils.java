package com.example.demo.design.abstract_factory.example.simple_reflection;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

/**
 * <h3>概要:</h3><p>PropertiesUtils</p>
 * <h3>功能:</h3><p>Properties工具类</p>
 * <h3>履历:</h3>
 * <li>2017年6月1日  v0.1 版本内容: 新建</li>
 * @since 0.1
 */
public class PropertiesUtils {
	
	private String path;	//文件路径
	
	public PropertiesUtils(String path){
		this.path = path;
	}
	
	/**
	 * 读取properties文件内容
	 * @param key 
	 * @return
	 * @throws Exception
	 */
	public String readProperties(String key) throws Exception{
		InputStream in = new BufferedInputStream(new FileInputStream(this.path));
		Properties properties = new Properties();
		properties.load(in);
		String value = properties.getProperty(key);
		return value;
	}
	
	/**
	 * 读取properties文件内容
	 * @param path	文件路径,例如["src/source.properties"]
	 * @param key	
	 * @return
	 * @throws Exception
	 */
	public static String readProperties(String path,String key) throws Exception{
		InputStream in = new BufferedInputStream(new FileInputStream(path));
		Properties properties = new Properties();
		properties.load(in);
		String value = properties.getProperty(key);
		return value;
	}
}