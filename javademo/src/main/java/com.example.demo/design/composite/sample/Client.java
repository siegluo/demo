package com.example.demo.design.composite.sample;

/**
 * <h3>概要:</h3><p>Client</p>
 * <h3>功能:</h3><p>客户端</p>
 * <h3>履历:</h3>
 * <li>2017年6月19日  v0.1 版本内容: 新建</li>
 */
public class Client {
	public static void main(String[] args) {
		Composite root = new Composite();
		root.add(new Leaf());
		root.add(new Leaf());

		Composite composite = new Composite();
		composite.add(new Leaf());
		composite.add(new Leaf());
		root.add(composite);

		Composite composite2 = new Composite();
		composite2.add(new Leaf());
		composite2.add(new Leaf());
		composite.add(composite2);

		root.operation(1);
	}
}