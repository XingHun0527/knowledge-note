package com.briup13;

public class exe73012 {
	private String title;
	private exe73011 exe73011;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public exe73011 getExe73011() {
		return exe73011;
	}
	public void setExe73011(exe73011 exe73011) {
		this.exe73011 = exe73011;
	}
	public exe73012(String title) {
		this.title=title;
	}
	@Override
	public String toString() {
		return "my Track title is: " + title + " duration is: " +exe73011.getTotalSeconds();


	}
	
}
