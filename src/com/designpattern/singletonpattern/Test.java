package com.designpattern.singletonpattern;

/***
 * 通过饿汉模式直接创建对象，所有的SingletonClass的对象都是相同的实例
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
