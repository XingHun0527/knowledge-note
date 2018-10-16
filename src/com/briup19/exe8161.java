package com.briup19;

import java.util.Scanner;

public class exe8161 {
	public static void main(String[] args) {
		System.out.println("请输入一个小写字母：");
		Scanner in=new Scanner(System.in);
		char c=in.next().charAt(0);
		if(c>='a'&&c<='z'){
			c=(char) (c-32);
			
			System.out.println("你所输入的小写字母为："+(char)(c+32));
			System.out.println("被转换为："+c);
		}else{
			System.out.println("请重新输入");
		}
	}
}
