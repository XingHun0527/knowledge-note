package com.briup13;

public class exe73011 {
	private int minutes;
	private int seconds;	
	private int hours;
	
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public int getMinutes() {
		return minutes;
	}
	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
	public int getSeconds() {
		return seconds;
	}
	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}
	
	public exe73011() {
	
	}
	public exe73011(int hours,int minutes,int seconds){
		this.hours=hours;
		this.minutes=minutes;
		this.seconds=seconds;
	
		
	}
	
	@Override
	public String toString() {
		return "exe73011 [hours=" + hours + "s, minutes=" + minutes + "s, seconds=" + seconds + "s]";
	}
	
	public int getTotalSeconds(){
		minutes=seconds*60;
		hours=seconds*3600;
		//System.out.println(getTotalSeconds());
		return minutes+hours+seconds;
		
		
	}

	
}
