package com.rays.io;

import java.io.*;

public class TestWriter {
	
	public static void main(String[] args) throws Exception {
		
		FileWriter file = new FileWriter("C:\\Users\\shiva\\OneDrive\\Desktop\\Io\\new.txt", true);
		
		file.write("hello world");
		file.write("\t welcome to file writer");
		file.write("\t workspace");
		file.close();
	}

}
