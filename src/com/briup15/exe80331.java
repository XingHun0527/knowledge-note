package com.briup15;

public class exe80331 implements exe80332 {
	public double length;
	public double webth;
	public double TiJi;
	public double MianJi;
	public exe80331(){
		
	}
	
	public exe80331(double length,double webth){
		this.length=length;
		this.webth=webth;
		
	}
	public void jiguo(){
		TiJi=length*webth*3.14;
		System.out.println(TiJi);
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWebth() {
		return webth;
	}
	public void setWebth(double webth) {
		this.webth = webth;
	}
	public double getTiJi() {
		return TiJi;
	}
	public void setTiJi(double tiJi) {
		TiJi = tiJi;
	}
	@Override
	public String toString() {
		return "exe80331 [length=" + length + ", webth=" + webth + ", TiJi=" + TiJi + "]";
	}

	@Override
	public void getArea(exe80331 ee) {
		MianJi=0.5*webth*3.14*length;
		System.out.println(MianJi);
	}
	
	
	
	
	
}
