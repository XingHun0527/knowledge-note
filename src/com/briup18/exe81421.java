package com.briup18;

public class exe81421 extends Thread{
	private static boolean flag=false;
	public int juli;
	public exe81421(String name){
		super(name);
	}

	
	public void run(){
		while(juli<100){
			if(flag==true){
				break;
			}
			
			if(getName().equals("小兔子")&&Math.random()<=0.3){
				juli=juli+2;
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					
				}
				System.out.println(getName()+"跑了"+juli+"米");
			}else if(getName().equals("小乌龟")&&Math.random()>0.3){
				juli++;
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
			
				}
				System.out.println(getName()+"跑了"+juli+"米");
			}else{
				
			}
			
		}
		if(juli==100){
			flag=true;
			System.out.println(getName()+"赢啦~~~~~~~");
			
		}
	}
	
	public static void main(String[] args) {
		exe81421 xtt=new exe81421("小兔子");
		exe81421 xgg=new exe81421("小乌龟");
		xtt.start();
		xgg.start();
	}
	
	
}
