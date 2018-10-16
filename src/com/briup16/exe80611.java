package com.briup16;

public class exe80611 {
	private int id;
	private String name;
	private int age;
	private double score;
	
	
	public exe80611(){
		
	}
	
	public exe80611(int id,String name,int age,double score){
		this.age=age;
		this.id=id;
		this.name=name;
		this.score=score;
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
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "exe80611 [id=" + id + ", name=" + name + ", age=" + age + ", score=" + score + "]";
	}
	
}
