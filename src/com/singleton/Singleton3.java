package com.singleton;

/**
 * ����ģʽ���֣���ʵԭ��Ͷ���ģʽһ��
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
