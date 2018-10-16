package com.briup18;

public class exe814221 {
	public static void main(String[] args) {
		exe814221 eee=new exe814221();
		eee.exe814221();
	}
	
	public void exe814221(){
		exe814221 test=new exe814221();
		Thread sz=new ShuZi(test);
		Thread zm=new ZiMu(test);
		sz.start();
		zm.start();
	}
	
	static class ShuZi extends Thread{
		private exe814221 test;
		public ShuZi(exe814221 test){
			this.test=test;
		}
		public void run(){
			synchronized (test) {
				for(int i=1;i<=52;i++){
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
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
		private exe814221 test;
		public ZiMu(exe814221 test){
			this.test=test;
		}
		public void run(){
			synchronized (test) {
				for(int i=(int)'A';i<=(int)'Z';i++){
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
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
