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
			
			if(getName().equals("С����")&&Math.random()<=0.3){
				juli=juli+2;
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					
				}
				System.out.println(getName()+"����"+juli+"��");
			}else if(getName().equals("С�ڹ�")&&Math.random()>0.3){
				juli++;
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
			
				}
				System.out.println(getName()+"����"+juli+"��");
			}else{
				
			}
			
		}
		if(juli==100){
			flag=true;
			System.out.println(getName()+"Ӯ��~~~~~~~");
			
		}
	}
	
	public static void main(String[] args) {
		exe81421 xtt=new exe81421("С����");
		exe81421 xgg=new exe81421("С�ڹ�");
		xtt.start();
		xgg.start();
	}
	
	
}
