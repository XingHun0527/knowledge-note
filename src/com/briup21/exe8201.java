package com.briup21;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.Socket;

public class exe8201 {
	public static void main(String[] args) throws Exception {
		exe();
	}
	
	public static void exe() throws Exception{
		Student student=new Student();
		
		String host="127.0.0.1";
		int port=8888;
		Socket socket=new Socket(host, port);
		System.out.println(socket);
		//接受服务器的数据
		InputStream inputStream=socket.getInputStream();
		Reader reader=new InputStreamReader(inputStream);
		BufferedReader bufferedReader=new BufferedReader(reader);
		String info=bufferedReader.readLine();
		System.out.println(info);
		///////////////////////////////

		
		//给服务器发送数据
		/*OutputStream outputStream=socket.getOutputStream();
		PrintStream printStream=new PrintStream(outputStream);
		printStream.print("我知道凶手是谁");
		
		
		printStream.flush();
		printStream.close();
		outputStream.flush();
		outputStream.close();*/
		
		
		bufferedReader.close();
		reader.close();
		inputStream.close();
		socket.close();
	
		
	}
	
	
	public static class Student{
		private String name;
		private int age;
		public Student(){
			
		}
		public void Student(String name,int age){
			this.name=name;
			this.age=age;
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
}
