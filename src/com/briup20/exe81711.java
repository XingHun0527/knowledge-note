package com.briup20;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class exe81711 {
	/*public void star(){
		try {
			FileInputStream fileInputStream=new FileInputStream("D:/360Downloads/eclipse/wackspace/JB0527/file/exe81711.txt");
			FileOutputStream fileOutputStream1=new FileOutputStream("D:/360Downloads/eclipse/wackspace/JB0527/file/exe817111.txt");
			FileOutputStream fileOutputStream2=new FileOutputStream("D:/360Downloads/eclipse/wackspace/JB0527/file/exe817112.txt");
			byte[] arr=new byte[2048];
			int len=-1;
			while((len=fileInputStream.read(arr))!=-1){
				fileOutputStream1.write(arr);
				fileOutputStream2.write(arr);
			}
			if(fileInputStream!=null){
				fileInputStream.close();
				fileInputStream=null;
			}
			
			if(fileOutputStream1!=null){
				fileOutputStream1.close();
				fileOutputStream1=null;
			}
			
			if(fileOutputStream2!=null){
				fileOutputStream2.close();
				fileOutputStream2=null;
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		exe81711 ee=new exe81711();
		ee.star();
	}*/
	
	public void star(){
				
			FileInputStream fiStream;
			FileOutputStream foStream1;
			FileOutputStream foStream2;
			try {
				fiStream = new FileInputStream("D:/360Downloads/eclipse/wackspace/JB0527/file/exe81711.txt");
				foStream1 = new FileOutputStream("D:/360Downloads/eclipse/wackspace/JB0527/file/exe817111.txt");
				foStream2 = new FileOutputStream("D:/360Downloads/eclipse/wackspace/JB0527/file/exe817112.txt");
				byte[] arr=new byte[2048];
				int len=-1;
				while((len=fiStream.read(arr))!=-1){
					foStream1.write(arr);
					foStream2.write(arr);
				}
			
				if(fiStream!=null){
					fiStream.close();
					fiStream=null;
				}
				
				if(foStream1!=null){
					foStream1.close();
					foStream1=null;
				}
				
				if(foStream2!=null){
					foStream2.close();
					foStream2=null;
					}
				} catch (Exception e) {
				
				e.printStackTrace();
				}
			}
	
	public static void main(String[] args) {
		exe81711 ee7=new exe81711();
		ee7.star();
	}
}
