package com.briup8;

public class exe7231 {
	private String name;
	private int age;
	private  double sex;
	
	
	public exe7231(){
		
	}
	
	public exe7231 (String name,double sex,int age){
		this.name=name;
		this.sex=sex;
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
	public double getSex() {
		return sex;
	}
	public void setSex(double sex) {
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "exe723 [name=" + name + ", age=" + age + ", sex=" + sex + "]";
	}
	
}
