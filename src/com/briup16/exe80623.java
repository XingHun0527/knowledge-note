package com.briup16;

public class exe80623 implements Comparable{
	private int id;
	private String name;
	private double score;
	
	
	
	public exe80623(int id, String name, double score) {
		super();
		this.id = id;
		this.name = name;
		this.score = score;
	}
	
	
	public exe80623() {
		super();
		// TODO Auto-generated constructor stub
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
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "exe80623 [id=" + id + ", name=" + name + ", score=" + score + "]";
	}

	
	
		//-1   stu1.equals(stu2)  stu1>stu2 1
		//1                        79   76
		//0
		//¼ÙÈçstu1  "tom"  stu2 "zhangsan"  1
		//          "zhangsna"    "tom"     -1
		//            >         1
		//            <         -1
		//            =         0
	public int compareTo(Object o){
		exe80623 eee=(exe80623) o;
		if(this.name=="tom"&&eee.getName()!="tom"){
			return -1;
			
		}else if(this.name!="tom"&&eee.getName()=="tom"){
			return 1;
			
		}else{
			if(this.getScore()>eee.getScore()){
				return -1;
			}else {
				if(this.getScore()<eee.getScore()){
					   return 1;
				   }else{
					   return 0;
				   }
			}
		
		}
	}	
}
