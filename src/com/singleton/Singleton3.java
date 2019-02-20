package com.singleton;

/**
 * 饿汉模式变种，其实原理和饿汉模式一样
 * @author liuguoyu
 *
 */
public class Singleton3 {
	
	private static Singleton3  instance = null;
	
	static{
		instance = new Singleton3();
	}
	
	private Singleton3(){}
	
	public Singleton3 getInstance(){
		return this.instance;
	}
}
