package com.singleton;

/**
 * 
 * ��̬�ڲ���
 * 
 * ���ַ�ʽͬ��������classloder�Ļ�������֤��ʼ��instanceʱֻ��һ���̣߳����������ֺ͵����ַ�ʽ��ͬ���ǣ���ϸ΢�Ĳ�𣩣�
 * �����ֺ͵����ַ�ʽ��ֻҪSingleton�౻װ���ˣ���ôinstance�ͻᱻʵ������û�дﵽlazy
 * loadingЧ�����������ַ�ʽ��Singleton�౻װ���ˣ�instance��һ������ʼ������ΪSingletonHolder��û�б�����ʹ�ã�
 * ֻ����ʾͨ������getInstance����ʱ���Ż���ʾװ��SingletonHolder�࣬�Ӷ�ʵ����instance������һ�£�
 * ���ʵ����instance��������Դ�����������ӳټ��أ�����һ���棬�Ҳ�ϣ����Singleton�����ʱ��ʵ������
 * ��Ϊ�Ҳ���ȷ��Singleton�໹�����������ĵط�������ʹ�ôӶ������أ���ô���ʱ��ʵ����instance��Ȼ�ǲ����ʵġ����ʱ��
 * ���ַ�ʽ��ȵ����͵����ַ�ʽ���Եúܺ�����
 * 
 * @author liuguoyu
 *
 */
public class Singleton4 {
	private static class SingletonHolder {
		private static final Singleton4 INSTANCE = new Singleton4();
	}

	private Singleton4 (){}

	public static final Singleton4 getInstance() {
		return SingletonHolder.INSTANCE;
	}
}
