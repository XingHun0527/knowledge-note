package com.briup17;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class exe80913 {
	public static void main(String[] args) {
		try {
			List<String> list = new ArrayList<String>();
			String aa = "123345";
			String bb = "asdac";
			String cc = "sdwegrgwww";
			list.add(aa);
			list.add(bb);
			list.add(cc);
			/*String className = "C:/Users/–«ªÍ¥Û»À/Documents/Ω‹∆’  µ—µ/¡∑œ∞/2018-8-9/ListTest.java";
			Class class1 = Class.forName(className);*/
			
			Class class1=list.getClass();
			Object object = class1.newInstance();
			Method method = class1.getMethod("add", Object.class);
			method.invoke(list, 1);
			/*for (int i = 1; i < list.size(); i++) {
				System.out.println(list.get(i));
			} */
			
			for (Object str:list ){
				System.out.println(str);
			}
		} catch (Exception e) {
			
		}
		
	}
}
