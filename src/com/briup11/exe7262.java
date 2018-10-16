package com.briup11;

public class exe7262 {

	public static void main(String[] args) {
		int[] arr={32,5,34,77,45,22,456};
		for(int num:arr){
			System.out.print(" "+num);
		}
		
		for(int i=1;i<arr.length;i++){
			for(int j=0;j<arr.length-i;j++){
				if(arr[j+1]<arr[j]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				}
			}
		}
		
		System.out.println();
		for(int num:arr){
			System.out.print(" "+num);
		}
	}

}
