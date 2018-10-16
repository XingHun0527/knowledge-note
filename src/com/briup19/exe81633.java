package com.briup19;
/**
 * �ڿ���̨��ʹ����������������һ��ѧ����Ϣ¼��Ĺ���:

ע��ʹ���ֽ�����������String����
���д���򵥵�ִ�е������������н��:

������ѧ������:tom
������ѧ������:20
�Ƿ�������:1���� 2�˳�:1
������ѧ������:lisi
������ѧ������:30
�Ƿ�������:1���� 2�˳�:2
Student [name=tom, age=20]
Student [name=lisi, age=30]
 */
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class exe81633 {
	
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
			Student7 s = null;
			List<Student7> list = new ArrayList<Student7>();
			boolean flag = true;
			while(flag){
				out.write("������ѧ������:".getBytes());
				out.flush();
				len = in.read(buf);
				name = new String(buf,0,len-2);
				
				
				out.write("������ѧ������:".getBytes());
				out.flush();
				len = in.read(buf);
				age = Integer.parseInt(new String(buf, 0, len-2));
				
				
				s = new Student7(name,age);
				list.add(s);
				
				
				out.write("�Ƿ�������:1���� 2�˳�:".getBytes());
				out.flush();
				len = in.read(buf);
				if("2".equals(new String(buf,0,len-2))){
					flag = false;
				}
			}
			
			for(Student7 st:list){
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
class Student7{
	private String name;
	private int age;
	public Student7() {
	}
	
	public Student7(String name, int age) {
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
		return "Student7 [name=" + name + ", age=" + age + "]";
	}
}
