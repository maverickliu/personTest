package com.singleton;
/**
 * 懒汉模式加载
 * @author liuguoyu
 *
 */
public class Singleton1 {
	private static Singleton1 instance;
	
	private Singleton1(){}
	
	/**
	 * 这种写法lazy loading很明显，但是致命的是在多线程不能正常工作。
	 * @return
	 */
	public static Singleton1 getInstance(){
		if(instance == null){
			instance = new Singleton1();
		}
		return instance;
	}
	
	/**
	 * 线程安全模式
	 * 遗憾的是，效率很低，99%情况下不需要同步。
	 * @return
	 */
	public static  synchronized Singleton1 getInstance1(){
		if(instance == null){
			instance = new Singleton1();
		}
		return instance;
	}
	
}
