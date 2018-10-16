package com.briup10;

public class exe7251 {
	public static void main(String[] args) {
		
	
	int[] arr={1,2,3,4,5,6,7,8,9,10};
	int sum=1;
	for(int i=0;i<arr.length;i++){
		 sum=arr[i]*sum;
		
		}
		System.out.println(sum);
		
		/*for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++){	
				int sum=i*j;
				if(i==j){
			
					System.out.print(i+"*"+j+"="+sum+" ");
				}else {
					System.out.print(i+"*"+j+"="+sum+" ");
				}
			}
			System.out.println();
		}*/
	}
}
