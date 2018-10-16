package com.briup13;

import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;

public class exe73042 {
	//定义用来保存学生信息的数组
		exe73041 exe[] ;
		int index = 0;
		//构造函数，用来初始化属性
		public exe73042() {
			exe=new exe73041[40];
		}
		//试图方法，用于显示提示信息
		public void view(){
			System.out.println("**************学生信息管理系统**************");
			System.out.println("*1. 查看所有学生");
			System.out.println("*2. 添加学生学生");
			System.out.println("*3. 修改学生信息");
			System.out.println("*4. 删除学生信息");
			System.out.println("*5. 安全退出系统");
		}
		//1. 可以在下面添加你所需要的方法
		// 查询所有学生信息
		public void findAll(){
			for(exe73041 num:exe){
				System.out.println();
			
			}
		}
		//添加学生
		public void save(exe73041 stu){
		
		}
		//通过id查找学生
		public void findById(long id){
			
		}
		//更改学生信息
		public void update(exe73041 newStu){
			
		}
		//根据ID删除学生信息
		public void deleteById(long id){
			
		}
		
		public static void main(String[] args) {
			exe73042 exe1 = new exe73042();
			while(true){
				exe1.view();
				//监听标准输入
				Scanner scanner = new Scanner(System.in);
				//如果输入以回车键结束，获取回车键之前的内容保存到遍历num中
				//输入1表示查询所有学生的信息
				//输入2添加学生
				//输入3根据Id修改学生信息
				//输入4 通过id查找原有学生的信息，如果id对应的学生存在，提示用户输入新用户信息
				//输入5退出（System.exit(0)）
				String num = scanner.nextLine();
				
			}
		}
}