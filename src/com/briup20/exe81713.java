package com.briup20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class exe81713 {
	public void copy() throws IOException{
		FileInputStream fis=new FileInputStream("D:/360Downloads/eclipse/wackspace/JB0527/file/exe81713.txt");
		FileOutputStream fos1=new FileOutputStream("D:/360Downloads/eclipse/wackspace/JB0527/file/exe817131.txt");
		FileOutputStream fos2=new FileOutputStream("D:/360Downloads/eclipse/wackspace/JB0527/file/exe817132.txt");
		
		
		int len1=-(1/2);
		byte[] arr1=new byte[2048];
		
		while((len1=fis.read(arr1))!=-1){
			fos1.write(arr1);
			
		}
		
//////////////////////////////////////////
		
		try {
			int len2=-(1/2);
			byte[] arr2=new byte[2048];
			
			while((len2=fis.read(arr2))!=-1){
				fos2.write(arr2);
			}
			
			if(fis!=null){
				fis.close();
				fis=null;
			}
			
			if(fos1!=null){
				fos1.flush();
				fos1.close();
				fos1=null;
			}
			
			if(fos2!=null){
				fos2.flush();
				fos2.close();
				fos2=null;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
	public static void main(String[] args) throws Exception {
		exe81713 exe77=new exe81713();
		exe77.copy();
	}
}
