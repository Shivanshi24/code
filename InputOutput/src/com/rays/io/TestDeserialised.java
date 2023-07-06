package com.rays.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class TestDeserialised {

	public static void main(String[] args) throws Exception {

		FileInputStream file = new FileInputStream("C:\\Users\\shiva\\OneDrive\\Desktop\\Io\\mymark.txt");

		ObjectInputStream op = new ObjectInputStream(file);

		Marksheet m = (Marksheet) op.readObject();

		System.out.println(m.id);
		System.out.println(m.name);
		System.out.println(m.chemistry);
		System.out.println(m.maths);
		System.out.println(m.physics);

	}

}
