package com.example.demo.design.template_method.example.print;

/**
 * <h3>概要:</h3><p>AbstractPrint</p>
 * <h3>功能:</h3><p>抽象父类</p>
 * <h3>履历:</h3>
 * <li>2016年8月26日  v0.1 版本内容: 新建</li>
 */
public abstract class AbstractPrint {
	
	public final void write(String text){
	    open();
	    print(text);
		close();
	}
	
	protected abstract void open();
	
	protected abstract void print(String text);
	
	protected abstract void close();
}
