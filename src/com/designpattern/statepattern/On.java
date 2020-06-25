package com.designpattern.statepattern;

public class On implements TVControll{

	@Override
	public void pressSwitch(TV context) {
		System.out.println("���Ӵ򿪳ɹ�!");
		context.setControll(new Off());
	}

}
