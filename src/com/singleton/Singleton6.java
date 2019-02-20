package com.singleton;

/**
 * 双重校验锁模式
 * 是对于懒汉模式线程安全的升级版
 * @author liuguoyu
 *
 */
public class Singleton6 {
	private volatile static Singleton6 instance;
	private Singleton6(){}
	
	public static Singleton6 getSingleton(){
		if(instance == null){
			synchronized(Singleton6.class){
				if(instance == null){
					instance = new Singleton6();
				}
			}
		}
		return instance;
	}
}
