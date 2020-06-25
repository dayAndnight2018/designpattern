package com.designpattern.statepattern;

public class Off implements TVControll{

	@Override
	public void pressSwitch(TV context) {
		System.out.println("电视关闭成功！");
		context.setControll(new On());
	}

}

