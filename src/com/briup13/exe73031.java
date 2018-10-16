package com.briup13;

public class exe73031 {
	private int[] data = new int[100];
	private int index = 0;

	public void push(int num){
		int len = data.length;
		if(index>=len){
			int[] temp = new int[len*2];
			System.arraycopy(data,0,temp,0,len);
			data = temp;
		}
		data[index] = num;
		index++;
	}

	public int pop(){
		if(index<=0){
			System.out.println("error!!!!");
			System.exit(-1);
		}		
		index--;
		return data[index];
	}
}
