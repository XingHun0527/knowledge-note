package com.briup15;

public class exe8031{
	public static void main(String[] args){
		System.out.println("1");
		new D();
	}
}
class C {
	static{System.out.println("2");}
	C(){System.out.println("3");}
	{System.out.println("4");}
}
class D extends C{
	public String sd1=getSd1();
	static public String getSd(){
		System.out.println("5");
		return "sd";
	}
	static{System.out.println("6");}
	public static String sd=getSd();
	D(){System.out.println("7");}
	{System.out.println("8");}
	public String getSd1(){
		System.out.println("9");
		return "sd1";
	}
}