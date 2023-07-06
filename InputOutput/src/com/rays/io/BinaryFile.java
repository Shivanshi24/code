package com.rays.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class BinaryFile {
	
	public static void main(String[] args) throws Exception {
		
		FileInputStream f = new FileInputStream("C:\\Users\\shiva\\OneDrive\\Desktop\\2022-11-16 (1).png");
		FileOutputStream out = new FileOutputStream("C:\\\\Users\\\\shiva\\\\OneDrive\\\\Desktop\\\\Io\\\\hello.png");
		
		int ch = f.read();
		while(ch!= -1) {
			out.write(ch);
			ch = f.read();
			
		}
		f.close();
		out.close();
	}

}
