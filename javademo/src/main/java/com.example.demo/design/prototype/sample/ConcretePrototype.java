package com.example.demo.design.prototype.sample;

/**
 * <h3>概要:</h3><p>ConcretePrototype</p>
 * <h3>功能:</h3><p>具体原型类</p>
 * <h3>履历:</h3>
 * <li>2017年1月22日  v0.1 版本内容: 新建</li>
 */
public class ConcretePrototype implements Prototype{
	
	private String attr; // 成员属性
	
	/**
	 * 克隆方法
	 */
	@Override
	public ConcretePrototype clone() {
		// 创建新对象
		ConcretePrototype prototype = new ConcretePrototype(); 
		prototype.setAttr(this.attr);
		return prototype;
	}

	@Override
	public String toString() {
		return "ConcretePrototype[attr="+this.attr+"]";
	}
	
	public void setAttr(String attr){
		this.attr = attr;
	}
	
	public String getAttr(){
		return this.attr;
	}
}
