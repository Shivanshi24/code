package com.rays.io;

import java.io.*;

public class TestPrint {

	public static void main(String[] args) throws Exception {

		FileWriter file = new FileWriter("C:\\Users\\shiva\\OneDrive\\Desktop\\Io\\print_write.txt");

		PrintWriter pw = new PrintWriter(file);

		for (int i = 0; i <= 5; i++) {

			pw.print("Hello \t");
			pw.print("java \t");
		}
		file.close();
		pw.close();
	}
}
