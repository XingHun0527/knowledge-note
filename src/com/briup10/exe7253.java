package com.briup10;

public class exe7253 {
	public static void main(String[] args) {
		int[] array1={2,3,5,7,9,11,13,17,19};
		int[] array2;
		for(int i=0;i<array1.length;i++){
			System.out.print(" "+array1[i]);
		}
		array2=array1;
		System.out.println();
		
		for(int i=0;i<array2.length;i++){
			if(i%2==0){
				array2[i]=i;
			}
			System.out.print(" "+array2[i]);
		}
		
		System.out.println();
		for(int i=0;i<array1.length;i++){
			System.out.print(" "+array1[i]);
		}
		
	}
}
