package com.designpattern.observerpattern;

public class Observer {
	
	private String name;
	
	public void update() {
		System.out.println(name+" data updated");
	}
	
	public Observer(String name)
	{
		this.name = name;
	}
}
