package com.designpattern.observerpattern;

public interface ISubject {
	void register(Observer o);
	void unRegister(Observer o);
	void notifyObservers();
}
