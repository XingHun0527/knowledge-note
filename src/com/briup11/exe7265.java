package com.briup11;

public class exe7265 {
	public static void main(String[] args) {
		int[] array1={2,3,4,5,6,7};
		int[] array2 =new int[10];
		System.arraycopy(array1, 0, array2, 0,array1.length);
		//��array1�������±�Ϊ0�Ŀ�ʼ������Ϊ6�����ҷ�����������array2
		//�±�Ϊ0λ��
		//���Ƶ�array2������
		for(int sum:array1){
			System.out.print(sum);
		}
		
		System.out.println();
		for(int sum1:array2){
			System.out.print(sum1);
		}
		
	}
}
