package com.briup19;

import java.util.Scanner;

public class exe8161 {
	public static void main(String[] args) {
		System.out.println("������һ��Сд��ĸ��");
		Scanner in=new Scanner(System.in);
		char c=in.next().charAt(0);
		if(c>='a'&&c<='z'){
			c=(char) (c-32);
			
			System.out.println("���������Сд��ĸΪ��"+(char)(c+32));
			System.out.println("��ת��Ϊ��"+c);
		}else{
			System.out.println("����������");
		}
	}
}
