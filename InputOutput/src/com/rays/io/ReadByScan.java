package com.rays.io;

import java.io.*;
import java.util.Scanner;

public class ReadByScan {

	public static void main(String[] args) throws Exception {

		FileReader in = new FileReader("C:\\Users\\shiva\\OneDrive\\Desktop\\Io\\hello.txt");

		Scanner sc = new Scanner(in);

		while (sc.hasNext()) {
			System.out.println(sc.nextLine());

		}

		in.close();
		sc.close();
	}

}
