package com.briup13;

import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;

public class exe73042 {
	//������������ѧ����Ϣ������
		exe73041 exe[] ;
		int index = 0;
		//���캯����������ʼ������
		public exe73042() {
			exe=new exe73041[40];
		}
		//��ͼ������������ʾ��ʾ��Ϣ
		public void view(){
			System.out.println("**************ѧ����Ϣ����ϵͳ**************");
			System.out.println("*1. �鿴����ѧ��");
			System.out.println("*2. ���ѧ��ѧ��");
			System.out.println("*3. �޸�ѧ����Ϣ");
			System.out.println("*4. ɾ��ѧ����Ϣ");
			System.out.println("*5. ��ȫ�˳�ϵͳ");
		}
		//1. �������������������Ҫ�ķ���
		// ��ѯ����ѧ����Ϣ
		public void findAll(){
			for(exe73041 num:exe){
				System.out.println();
			
			}
		}
		//���ѧ��
		public void save(exe73041 stu){
		
		}
		//ͨ��id����ѧ��
		public void findById(long id){
			
		}
		//����ѧ����Ϣ
		public void update(exe73041 newStu){
			
		}
		//����IDɾ��ѧ����Ϣ
		public void deleteById(long id){
			
		}
		
		public static void main(String[] args) {
			exe73042 exe1 = new exe73042();
			while(true){
				exe1.view();
				//������׼����
				Scanner scanner = new Scanner(System.in);
				//��������Իس�����������ȡ�س���֮ǰ�����ݱ��浽����num��
				//����1��ʾ��ѯ����ѧ������Ϣ
				//����2���ѧ��
				//����3����Id�޸�ѧ����Ϣ
				//����4 ͨ��id����ԭ��ѧ������Ϣ�����id��Ӧ��ѧ�����ڣ���ʾ�û��������û���Ϣ
				//����5�˳���System.exit(0)��
				String num = scanner.nextLine();
				
			}
		}
}