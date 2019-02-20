package com.singleton;
/**
 * ����ģʽ����
 * @author liuguoyu
 *
 */
public class Singleton1 {
	private static Singleton1 instance;
	
	private Singleton1(){}
	
	/**
	 * ����д��lazy loading�����ԣ��������������ڶ��̲߳�������������
	 * @return
	 */
	public static Singleton1 getInstance(){
		if(instance == null){
			instance = new Singleton1();
		}
		return instance;
	}
	
	/**
	 * �̰߳�ȫģʽ
	 * �ź����ǣ�Ч�ʺܵͣ�99%����²���Ҫͬ����
	 * @return
	 */
	public static  synchronized Singleton1 getInstance1(){
		if(instance == null){
			instance = new Singleton1();
		}
		return instance;
	}
	
}
