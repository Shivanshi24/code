package com.rays.io;

import java.io.*;

public class ReadLineByLine {

	public static void main(String[] args) throws Exception {
		
		FileReader file = new FileReader("C:\\Users\\shiva\\OneDrive\\Desktop\\Io\\hello.txt");
		
		BufferedReader br = new BufferedReader(file);
		
		String line = br.readLine();
		
		while(line!= null) {
		System.out.println(line);
		line = br.readLine();
		
	}
		
		file.close();
		br.close();
	}
}
