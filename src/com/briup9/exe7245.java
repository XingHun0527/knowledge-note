package com.briup9;

public class exe7245 {
	static int sum=1;
	static int sum1=1;
	static int j=1;
	public static void main(String[] args) {
		for(int i=1;i<=10;i++){
			sum=i*sum;
			
		}
		System.out.println(sum);
		
		System.out.println("=================");
		
		
		do{
			sum1=j*sum1;
			j++;
		}while(j<=10);
			
		System.out.println(sum1);
		
	}
}
