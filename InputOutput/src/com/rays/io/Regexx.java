package com.rays.io;

import java.io.*;

public class Regexx {

	public static void main(String[] args) throws Exception {

		FileReader read = new FileReader("C:\\Users\\shiva\\OneDrive\\Desktop\\Io\\test.txt");

		BufferedReader br = new BufferedReader(read);

		FileWriter write = new FileWriter("C:\\Users\\shiva\\OneDrive\\Desktop\\Io\\mymail.txt");

		PrintWriter pw = new PrintWriter(write);

		String line = br.readLine();

		while (line != null) {
			if (line.matches("^(.+)@(.+)$")) {

				pw.println(line);			

			}

			line = br.readLine();
		}

		read.close();
		br.close();
		write.close();
		pw.close();

	}

}
