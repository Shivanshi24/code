package com.rays.io;

import java.io.*;

public class TestWriteExternalisation {

	public static void main(String[] args) throws Exception {
		
		FileOutputStream file = new FileOutputStream("C:\\Users\\shiva\\OneDrive\\Desktop\\Io\\myemp.txt");
		ObjectOutputStream op = new ObjectOutputStream(file);
		
		Employee e = new Employee();
		
		e.id = 1;
		e.name = "def";
		e.address = "xyz";
		e.salary = 10000;
		
		op.writeObject(e);
		
		
		op.close();
		file.close();

	}
}
