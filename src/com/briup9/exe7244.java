package com.briup9;

import java.util.Scanner;

public class exe7244 {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("输入一个十进制数：");
		String sjz=input.next();
		int j=Integer.parseInt(sjz);
		//System.out.println(Integer.toBinaryString(j))

		for(int i=7;i>=0;i--){
			int k=(j>>i)&1;
		System.out.print(k);

			}
		

		}

}
