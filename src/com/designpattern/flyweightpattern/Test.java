package com.designpattern.flyweightpattern;

/***
 * 轻量模式：对创建对象的资源消耗非常看重，所以将创建的对象缓存起来。
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
