package com.briup12;

public class exe72712 extends exe72711{
	double r;
	public exe72712(){
		r=1.0;
	}
	public exe72712(double r){
		this.r=r;
	}
	
	public exe72712(int x,int y,double r){
		this.x=x;
		this.y=y;
		this.r=r;
	}
	public void draw(){
		System.out.println("draw in cricle");
		System.out.println(x);
		System.out.println(y);
		System.out.println(r);
		
	}
}
