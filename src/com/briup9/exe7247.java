package com.briup9;

public class exe7247 {
	public static void main(String[] args) {
		int sum=1;
		for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++){
				sum=i*j;
				System.out.print(i+"*"+j+"="+sum+" "+"\t");
			}
			System.out.println();
		}	
	
	}
}
