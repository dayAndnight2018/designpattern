package com.designpattern.singletonpattern;

/***
 * ͨ������ģʽֱ�Ӵ����������е�SingletonClass�Ķ�������ͬ��ʵ��
 * @author DELL-PC
 *
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SingletonClass singleton = SingletonClass.getInstance();

		System.out.println(singleton.toString());

		SingletonClass singleton2 = SingletonClass.getInstance();

		System.out.println(singleton2.toString());
		
		System.out.println(singleton == singleton2);
	}

}
