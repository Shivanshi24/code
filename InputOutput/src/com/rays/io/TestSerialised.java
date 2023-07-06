package com.rays.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestSerialised {

	public static void main(String[] args) throws Exception {

		FileOutputStream file = new FileOutputStream("C:\\Users\\shiva\\OneDrive\\Desktop\\Io\\mymark.txt");

		ObjectOutputStream out = new ObjectOutputStream(file);

		Marksheet m = new Marksheet();
		m.id = 2;
		m.name = "abc";
		m.chemistry = 89;
		m.maths = 98;
		m.physics = 76;

		out.writeObject(m);
		file.close();
		out.close();
		

	}

}
