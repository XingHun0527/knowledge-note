package com.briup16;

public class exe80612 {
	private int id;
	private String name;
	private int age;
	public exe80612(int id, String name, int age) {
		super();
		this.id = 1;
		this.name = "ss";
		this.age = 1;
	}
	public exe80612() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	
	public boolean ee(Object o){
		if(this==o){
			return true;
		}
		else if(!(o instanceof exe80612)){
			return false;
		}
		exe80612 tea=(exe80612)o;
	//	System.out.println(this.name.equals(tea.name) && this.age==tea.age);
		return this.name.equals(tea.name) && this.age==tea.age;
	}

//	@Override
//	public String toString() {
//		return "exe80612 [id=" + id + ", name=" + name + ", age=" + age + "]";
//		}
//	
	
	}
