package com.designpattern.statepattern;

public class TV {

	private TVControll controll;
	
	public void setControll(TVControll controll) {
		this.controll = controll;
	}
	
	public void PressButton(){
		this.controll.pressSwitch(this);
	}
	
	public TVControll getControll(){
		return this.controll;
	}
	
	public TV(TVControll controll) {
		this.controll = controll;
	}

}
