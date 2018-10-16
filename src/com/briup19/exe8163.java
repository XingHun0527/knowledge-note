package com.briup19;
/**
 * 在控制台中使用输入输出流，完成一个学生信息录入的功能:

注意使用字节数组来构建String对象
运行代码简单的执行的下有以下运行结果:

请输入学生姓名:tom
请输入学生年龄:20
是否继续添加:1继续 2退出:1
请输入学生姓名:lisi
请输入学生年龄:30
是否继续添加:1继续 2退出:2
Student [name=tom, age=20]
Student [name=lisi, age=30]
 */
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class exe8163 {
	
	public static void main(String[] args) {
		
		
		InputStream in = null;
		OutputStream out = null;
		
		try {
			in = System.in;
			out = System.out;
			byte[] buf = new byte[100];
			int len = -1;
			
			String name = null;
			int age = 0;
			Student s = null;
			List<Student> list = new ArrayList<Student>();
			boolean flag = true;
			while(flag){
				out.write("请输入学生姓名:".getBytes());
				out.flush();
				len = in.read(buf);
				name = new String(buf,0,len-2);
				out.write("请输入学生年龄:".getBytes());
				out.flush();
				len = in.read(buf);
				age = Integer.parseInt(new String(buf, 0, len-2));
				s = new Student(name,age);
				list.add(s);
				out.write("是否继续添加:1继续 2退出:".getBytes());
				out.flush();
				len = in.read(buf);
				if("2".equals(new String(buf,0,len-2))){
					flag = false;
				}
			}
			
			for(Student st:list){
				System.out.println(st);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(in!=null)in.close();
				if(out!=null)out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
}
class Student{
	private String name;
	private int age;
	public Student() {
	}
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
}
