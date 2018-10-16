package com.briup18;

public class exe81422 {
	public static void main(String[] args) {
		exe81422 e1=new exe81422();
		e1.exe81422();
	
	}
	
	public void exe81422(){
		exe81422 test=new exe81422();
		Thread sz=new ShuZi(test);
		Thread zm=new ZiMu(test);
		sz.start();
		zm.start();
	}
	
	static class ShuZi extends Thread{
		private exe81422 test;
		public ShuZi(exe81422 test){
			this.test=test;
		}
		public  void run(){
			synchronized (test) {
				for(int i=1;i<=52;i++){
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
					
						e.printStackTrace();
					}
				System.out.println("Êä³ö£º"+i);
				test.notifyAll();
				
				if(i%2==0){
					try {
						test.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					}
				}
			}
		}
	}
	
	static class ZiMu extends Thread{
		private exe81422 test;
		public ZiMu(exe81422 test){
			this.test=test;
		}
		
		public void run(){
			synchronized (test) {
				for(int i=(int)'A';i<=(int)'Z';i++){
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
					
						e.printStackTrace();
					}
					System.out.println("Êä³ö£º"+(char)i);
					test.notifyAll();
					if(i!='Z'){
						try {
							test.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}
		}
	}
}
