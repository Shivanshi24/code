package com.rays.io;

import java.io.*;

public class TestByKeyboard {

	public static void main(String[] args) throws Exception {

		InputStreamReader file = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(file);

		FileWriter f = new FileWriter("C:\\Users\\shiva\\OneDrive\\Desktop\\Io\\def.txt", true);
		PrintWriter pw = new PrintWriter(f);

		String line = br.readLine();

		while (!(line.equals("quit"))) {

			pw.println(line);
			System.out.println("line = " + line);
			line = br.readLine();
		}

		br.close();
		file.close();
		pw.close();
		f.close();

	}

}
