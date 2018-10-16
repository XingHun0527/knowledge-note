package com.briup11;

import java.util.Random;

public class exe7264 {
	public static void main(String[] args) {
		Random random=new Random();
		int a;
		char x;
		char y;
		for(int i=0;i<4;i++){
			int choose=random.nextInt(3);
			if(choose==0){
				a=random.nextInt(10);
				System.out.print(a);
			}
			if(choose==1){
				x=(char)(random.nextInt(25)+97);
				System.out.print(x);
			}
			if(choose==2){
				y=(char) (random.nextInt(25)+65);
				System.out.print(y);
			}
			
		}
	}
}
