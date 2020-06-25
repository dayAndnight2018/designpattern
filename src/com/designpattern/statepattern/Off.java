package com.designpattern.statepattern;

public class Off implements TVControll{

	@Override
	public void pressSwitch(TV context) {
		System.out.println("���ӹرճɹ���");
		context.setControll(new On());
	}

}

