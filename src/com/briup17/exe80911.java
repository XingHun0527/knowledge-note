package com.briup17;

public enum exe80911 {
	RED("��ɫ",1),GREEN("��ɫ",2),BLUE("��ɫ",3);
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
			case RED:System.out.println("���Ǻ�ɫ~~~~");
			case GREEN:System.out.println("������ɫ~~~~");
			case BLUE:System.out.println("������ɫ~~~~");
		}
	}

}
