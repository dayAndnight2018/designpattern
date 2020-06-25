package com.designpattern.observerpattern;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Observer observer1 = new Observer("observer1");
		Observer observer2 = new Observer("observer2");
		Observer observer3 = new Observer("observer3");
		Observer observer4 = new Observer("observer4");
		
		Subject subject = new Subject();
		subject.register(observer1);
		subject.register(observer2);
		subject.register(observer3);
		subject.register(observer4);
		subject.notifyObservers();
		
		subject.unRegister(observer4);
		subject.notifyObservers();
	}

}
