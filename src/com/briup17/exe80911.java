package com.briup17;

public enum exe80911 {
	RED("红色",1),GREEN("绿色",2),BLUE("蓝色",3);
	String name;
	int index;
	private exe80911() {
	}
	exe80911(String name,int index){
		this.index=index;
		this.name=name;
	}
	
	public static void main(String[] args) {
		exe80911 eee=exe80911.RED;
		switch(eee){
			case RED:System.out.println("我是红色~~~~");
			case GREEN:System.out.println("我是绿色~~~~");
			case BLUE:System.out.println("我是蓝色~~~~");
		}
	}

}
