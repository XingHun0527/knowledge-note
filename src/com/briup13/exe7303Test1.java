package com.briup13;

public class exe7303Test1 {
	public static void main(String[] args) 
	{
		exe73031 exe1 = new exe73031();
		//stack.pop();
		for(int i=1; i<=200; i++){
			exe1.push(i);
		}
		for(int i=1; i<=100; i++){
			System.out.println("pop:" + exe1.pop());
		}
		for(int i=201; i<=300; i++){
			exe1.push(i);
		}
		for(int i=1; i<=200; i++){
			System.out.println("pop:" + exe1.pop());
		}

		exe73032 exe2 = new exe73032();
		//queue.out();
		for(int i=1; i<=200; i++){
			exe2.in(i);
		}
		for(int i=1; i<=100; i++){
			System.out.println("out:" + exe2.out());
		}
		for(int i=201; i<=300; i++){
			exe2.in(i);
		}
		for(int i=1; i<=200; i++){
			System.out.println("out:" + exe2.out());
		}
	}
}
