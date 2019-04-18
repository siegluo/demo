package com.example.demo.design.builder.sample;

/**
 * <h3>概要:</h3><p>Client</p>
 * <h3>功能:</h3><p>客户端</p>
 * <h3>履历:</h3>
 * <li>2017年1月22日  v0.1 版本内容: 新建</li>
 */
public class Client {
    
	public static void main(String[] args) {
		Builder builder = new ConcreteBuilder();
    	Director director = new Director(builder);
    	Product product = director.construct();	
    	System.out.println(product);
	}
}
