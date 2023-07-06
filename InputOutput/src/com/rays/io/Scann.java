package com.rays.io;

import java.io.*;

public class Scann {

	public static void main(String[] args) throws Exception {

		InputStreamReader file = new InputStreamReader(System.in);

		BufferedReader br = new BufferedReader(file);
		
		FileWriter f = new FileWriter("C:\\Users\\shiva\\OneDrive\\Desktop\\Io\\abc.txt", true);
		
		PrintWriter out = new PrintWriter(f);

		String line = br.readLine();
		
		while (!(line.equals("quit"))) {
			
			out.println(line);
			System.out.println("line is = " +line);
			
			line = br.readLine();
			
		}
		
		br.close();
		file.close();
		out.close();

	}

}
