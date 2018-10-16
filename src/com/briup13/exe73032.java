package com.briup13;

public class exe73032 {
	private int[] data = new int[100];
	private int index = 0;

	public void in(int num){
		int len = data.length;
		if(index>=len){
			int[] temp = new int[len*2];
			System.arraycopy(data,0,temp,0,len);
			data = temp;
		}
		data[index] = num;
		index++;
	}

	public int out(){
		if(index<=0){
			System.out.println("error!!!!");
			System.exit(-1);
		}		
		int temp = data[0];
		index--;
		System.arraycopy(data,1,data,0,data.length-1);
		return temp;
	}
}
