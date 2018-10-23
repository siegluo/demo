package com.example.demo.design.singleton.sample;

public class Singleton5 {
	private Singleton5() {}

	private static class SigletonHolder {
		private final static Singleton5 instance = new Singleton5();
	}

	public static Singleton5 getInstance() {
		return SigletonHolder.instance;
	}
}