package com.briup8;

public class exe7232 {
	
		@Override
	public String toString() {
		return "exe7232 [name=" + name + ", age=" + age + ", salary=" + salary + "]";
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
		public String name;		//����
		public int age;			//����
		public double salary=10000;	//нˮ

		//�����������ӵķ���
		public void increaseAge(){
			age++;
		}	
		public  void Salarytt(){
			
			salary+=5000;
			System.out.println(salary);
		}


}
