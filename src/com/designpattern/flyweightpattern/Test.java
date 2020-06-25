package com.designpattern.flyweightpattern;

/***
 * ����ģʽ���Դ����������Դ���ķǳ����أ����Խ������Ķ��󻺴�������
 * @author DELL-PC
 *
 */
public class Test {

	public static void main(String[] args) throws Exception {
		
		ISayHello hello = null;		
		RobotFactory factory = new RobotFactory();
		
		hello = factory.createRobot("small");
		hello.sayHello();		
		hello = factory.createRobot("small");
		hello.sayHello();		
		System.out.println(factory.totalObjects());
		
		hello = factory.createRobot("large");
		hello.sayHello();		
		hello = factory.createRobot("large");
		hello.sayHello();		
		hello = factory.createRobot("large");
		hello.sayHello();
		
		System.out.println(factory.totalObjects());
		
		hello = factory.createRobot("medium");
		hello.sayHello();
	}

}
