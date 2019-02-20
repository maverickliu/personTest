package com.singleton;

/**
 * ���ַ�ʽ����classloder���Ʊ����˶��̵߳�ͬ�����⣬������instance����װ��ʱ��ʵ��������Ȼ������װ�ص�ԭ���кܶ��֣�
 * �ڵ���ģʽ�д�������ǵ���getInstance������
 * ����Ҳ����ȷ���������ķ�ʽ�����������ľ�̬������������װ�أ���ʱ���ʼ��instance��Ȼû�дﵽlazy loading��Ч����
 * 
 * @author liuguoyu
 *
 */
public class Singleton2 {
	private static Singleton2 instance = new Singleton2();
	
	private Singleton2(){}
	
	public Singleton2 getInstance(){
		return instance;
	}
}
