package com.rays.io;

import java.io.*;

public class ReadCharByChar {

	public static void main(String[] args) throws Exception {

		FileReader file = new FileReader("C:\\Users\\shiva\\OneDrive\\Desktop\\Io\\hello.txt");

		int ch = file.read();

		while (ch != -1) {
			//System.out.println(ch);
			
			//type cast integer to character
			System.out.println((char)ch);
			
			ch = file.read();

		}
	}
}