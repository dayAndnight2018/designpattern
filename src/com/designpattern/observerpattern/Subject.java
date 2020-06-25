package com.designpattern.observerpattern;

import java.util.ArrayList;

public class Subject implements ISubject {

	ArrayList<Observer> list = new ArrayList<Observer>();
	
	@Override
	public void register(Observer o) {
		// TODO Auto-generated method stub
		list.add(o);
	}

	@Override
	public void unRegister(Observer o) {
		// TODO Auto-generated method stub
		list.remove(o);
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for(Observer observer : list) {
			observer.update();
		}
	}

}
