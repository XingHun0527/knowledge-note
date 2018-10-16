package com.briup16;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class exe80622 {
	public static void main(String[] args) {
		String arr="wwqweqdasdafdsfdsferer";
		char[] ss=arr.toCharArray();	
		Set set=new HashSet<>();
		
		for(char ch:ss){
			set.add(ch);
		}
		Iterator iterator = set.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	
	}
}

