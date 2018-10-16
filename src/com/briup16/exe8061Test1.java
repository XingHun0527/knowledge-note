package com.briup16;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class exe8061Test1 {
	public static void main(String[] args) {
		List<exe80611> list=new ArrayList<exe80611>();
		exe80611 e1=new exe80611(1,"李白",15,15.5);
		exe80611 e2=new exe80611(2,"李寻欢",18,13);
		exe80611 e3=new exe80611(3,"李清照",20,12);
		exe80611 e4=new exe80611(4,"李未央",14,18);
		exe80611 e5=new exe80611(5,"李长安",17,11.5);
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		//迭代器
		Iterator<exe80611> it=list.iterator();
		while(it.hasNext()){
			exe80611 ee=it.next();
			System.out.println(ee);
		}
	}
}
