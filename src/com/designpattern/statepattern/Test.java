package com.designpattern.statepattern;

/***
 * ״̬ģʽ�����ڶ��״̬֮����л���ͳһʵ��TVControll�ӿڣ�ͨ�����ʽ�滻״̬�ӿ�ʵ��״̬�Ľ���
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
