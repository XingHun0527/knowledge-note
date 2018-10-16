package com.briup11;

public class exe7265 {
	public static void main(String[] args) {
		int[] array1={2,3,4,5,6,7};
		int[] array2 =new int[10];
		System.arraycopy(array1, 0, array2, 0,array1.length);
		//从array1数组中下标为0的开始，长度为6，并且放置在新数组array2
		//下标为0位置
		//复制到array2数组中
		for(int sum:array1){
			System.out.print(sum);
		}
		
		System.out.println();
		for(int sum1:array2){
			System.out.print(sum1);
		}
		
	}
}
