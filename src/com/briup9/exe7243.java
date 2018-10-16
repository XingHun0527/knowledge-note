package com.briup9;

import java.util.Scanner;

public class exe7243 {
	public static void main(String[] args) {
		System.out.println("请输入0——6之间的阿拉伯数字：");
		Scanner in=new Scanner(System.in);
		String ta=in.next();
		int aa=Integer.parseInt(ta);
		if(aa==0){
			System.out.println("星期日");
		}
		if(aa==1){
			System.out.println("星期一");
		}
		if(aa==2){
			System.out.println("星期二");
		}
		if(aa==3){
			System.out.println("星期三");
		}
		if(aa==4){
			System.out.println("星期四");
		}
		if(aa==5){
			System.out.println("星期五");
		}
		if(aa==6){
			System.out.println("星期六");
		}
		
	}
}
