package com.briup21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class exe8202 {
	private static boolean flag=true;
	public static void main(String[] args) throws IOException {
		int port=8888;
		ServerSocket serverSocket=new ServerSocket(port);
		System.out.println("=====����=====");
		System.out.println(serverSocket);
		while(flag){
			Socket socket=serverSocket.accept();
			//�������ݵ��ͻ���
			OutputStream outputStream=socket.getOutputStream();
			PrintStream printStream=new PrintStream(outputStream);
			printStream.print("��ӭ��������ɯ������");
		
		
		
			/////////////////////////////
			
			//���ܿͻ��˵�����
			/*InputStream inputStream=socket.getInputStream();
			Reader reader=new InputStreamReader(inputStream);
			BufferedReader bufferedReader=new BufferedReader(reader);
			String info=bufferedReader.readLine();
			System.out.println(info);
			
			
			
			bufferedReader.close();
			reader.close();
			inputStream.close();*/
			
			
			
	
			printStream.flush();
			printStream.close();
			outputStream.close();
			socket.close();
		}
	}
}