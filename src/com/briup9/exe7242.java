package com.briup9;

import java.util.Scanner;

public class exe7242 {
	public static void main(String[] args) {
		System.out.println("�����밢�������ֵ���ݣ�");
		Scanner in =new Scanner(System.in);
		String ta=in.next();
		int tt=Integer.parseInt(ta);
		if((tt%4==0&&tt%100!=0)&&tt%400==0){
			System.out.println("����������");
		}else{
			System.out.println("������ƽ��");
		}
	}
}
