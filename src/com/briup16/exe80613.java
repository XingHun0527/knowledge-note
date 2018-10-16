package com.briup16;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class exe80613 {
	public static void main(String[] args) {
		List list=new ArrayList<>();
		Set set=new HashSet<>();
		
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("2");
		list.add("3");
		list.add("2");
		list.add("5");
		list.add("4");
		set.addAll(list);
		System.out.println(set);
		
	}
		
		
}
