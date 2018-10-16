package com.briup16;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class exe8062Test3 {
	public static void main(String[] args) {
		
		exe80623 ee1=new exe80623(1,"ww",26);
		exe80623 ee2=new exe80623(2,"tom",24);
		exe80623 ee3=new exe80623(3,"jd",13);
		exe80623 ee4=new exe80623(4,"sf",53);
		ArrayList<exe80623> list=new ArrayList<>();
		list.add(ee1);
		list.add(ee2);
		list.add(ee3);
		list.add(ee4);
		
		Iterator<exe80623> iterator=list.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		System.out.println("=++++++++++++++++++++++++=");
		TreeSet<exe80623> treeSet=new TreeSet<>();
		
		treeSet.add(ee1);
		treeSet.add(ee2);
		treeSet.add(ee3);
		treeSet.add(ee4);
		Iterator<exe80623> iterator2=treeSet.iterator();
		while(iterator2.hasNext()){
			System.out.println(iterator2.next());
		}
	}
}
