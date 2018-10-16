package com.briup18;

public class exe81411 extends Thread{
	/*private static boolean flag=false;
	public void run(){
			try {
				
			for(int i=1;i<=100;i++){
			if(flag==true){
				break;
			}if(i==100){
				flag=true;
			}
			String ss=Thread.currentThread().getName();
			System.out.println(ss+"="+i);
			double sj=Math.random()*2000;
			Thread.sleep((long) sj);
				} 
			
			}
			catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	public static void main(String[] args) {
		exe81411 t1=new exe81411();
		exe81411 t2=new exe81411();
		t1.start();
		t2.start();
	}*/
	private static boolean flag=false;
	public void run(){
		for(int i=1;i<=100;i++){
			if(flag==true){
				break;
			}
			if(i==100){
				flag=true;
			}
			
			String name=Thread.currentThread().getName();
			System.out.println(name+"="+i);
			double sui=Math.random()*2000;
			try {
				Thread.sleep((long) sui);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		exe81411 e1=new exe81411();	
		exe81411 e2=new exe81411();
		
		e1.setPriority(3);
		e2.setPriority(7);
		
		e1.setName("°¢Æß");
		e2.setName("°¢Äý");
		
		e1.start();
		e2.start();
	}
	
}

