package com.designpattern.statepattern;

/***
 * 状态模式：存在多个状态之间的切换，统一实现TVControll接口，通过抽插式替换状态接口实现状态的交替
 * @author DELL-PC
 *
 */
public class Test {

	public static void main(String[] args) {
		
		TVControll controll = new Off();
		TV tv = new TV(controll);
		tv.PressButton();
		tv.PressButton();
		tv.PressButton();
		tv.PressButton();
	}

}
