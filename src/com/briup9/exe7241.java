package com.briup9;

import java.util.Scanner;

public class exe7241 {
	public static void main(String[] args) {
		System.out.println("������һ�����������֣�");
		Scanner in=new Scanner(System.in);
		String ta=in.next();
		int sey=Integer.parseInt(ta);
		if(sey>8&&sey<12){
			System.out.println("�����");
		}else if(sey>12&&sey<14){
			System.out.println("�����");
		}else if(sey>14&&sey<18){
			System.out.println("�����");
		}else{
			System.out.println("���Ϻ�");
		}
		
	}
}
