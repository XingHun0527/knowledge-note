package com.briup20;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Reader;

public class exe81712 {
	/*public static void main(String[] args) throws IOException {
		String s="hello world*tom*how are you?";
		byte[] b=s.getBytes();
		
		InputStream iStream=new ByteArrayInputStream(b,0,30);//�ֽڣ��±꣬����
		if(iStream.markSupported()){
			System.out.println((char)(iStream.read()));
		}
	}*/
	public static void main(String[] args) throws IOException {
		////������������
		OutputStream outputStream=System.out;
		String aString="�����ɡӵ���뻳��";
	//	int aString=1;
		byte[] ass=aString.getBytes();

		
		outputStream.write(ass);
		outputStream.flush();
		outputStream.close();
		
		
		
		///////////////////////////
//			PrintStream printStream=System.out;
//			String aString="�����ɡӵ���뻳��";
//			int aString=1;
//			byte[] ass=aString.getBytes();
		
//			printStream.println(aString);
//			printStream.flush();
//			printStream.close();
	
		
	
	}	
}
