package com.briup11;

public class exe7261 {
	public static void main(String[] args) {
		int[] arr={2,45,67,22,44,21,87};
		for(int num:arr){
			System.out.print(" "+num);
		}
		
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
			
		}	
		System.out.println();
			for(int num:arr){
				System.out.print(" "+num);
			
			
		}
	}
}
