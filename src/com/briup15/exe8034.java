package com.briup15;

interface Inter{
	void show(int a,int b);
	boolean fun();
}
abstract class Demo{
	public abstract void Test();
}


public class exe8034{
	public static void main(String[] args) {
		Inter ii=new Inter() {
			
			@Override
			public void show(int a, int b) {
				System.out.println(a+b);
				
			}
			
			@Override
			public boolean fun() {
				System.out.println("I'm fine~");
				return false;
			}
		};
		ii.show(3,7);
		System.out.println(ii.fun());
	}
}