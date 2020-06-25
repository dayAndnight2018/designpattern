package com.designpattern.statepattern;

public class On implements TVControll{

	@Override
	public void pressSwitch(TV context) {
		System.out.println("电视打开成功!");
		context.setControll(new Off());
	}

}
