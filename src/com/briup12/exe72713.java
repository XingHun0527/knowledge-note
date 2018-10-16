package com.briup12;

import java.util.function.IntToDoubleFunction;

public class exe72713 extends exe72711{
	double height;
	double width;
	public exe72713(){
		height=1.0;
		width=1.0;	
	}
	public exe72713(double height,double width){
		this.height=height;
		this.width=width;
	}
	
	public exe72713(int x,int y,double height,double width){
		this.x=x;
		this.y=y;
		this.height=height;
		this.width=width;
	}
	public void draw(){
		System.out.println("draw in rectangle");
		System.out.println(x);
		System.out.println(y);
		System.out.println(height);
		System.out.println(width);
		
	}
}
