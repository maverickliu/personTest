package com.singleton;

/**
 * ˫��У����ģʽ
 * �Ƕ�������ģʽ�̰߳�ȫ��������
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
