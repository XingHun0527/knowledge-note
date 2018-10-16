package com.briup13;

public class exe7301Test1 {

	public static void main(String[] args) {
				//创建Track 对象，并设置title
		exe73012 exe=new exe73012("啦啦啦");
			exe73011 exe1=new exe73011(2, 15, 30);
			exe.setExe73011(exe1);
			//exe1.getTotalSeconds();
			System.out.println(exe);
			System.out.println(exe1);

				//创建Duration对象：两种方式;
				//第一种利用构造器传入总的秒数；第二种利用构造器传入时、分、秒
				
				
				//把Duration对象依赖放进Track对象中
				
				//Title、Track、以及通过Track中的属性方法打印出Duration对象

	}

}
