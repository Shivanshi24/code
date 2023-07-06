package com.rays.io;
import java.io.*;
public class TestExternalRead {
	
	public static void main(String[] args) throws Exception {
		
		FileInputStream file = new FileInputStream("C:\\Users\\shiva\\OneDrive\\Desktop\\Io\\myemp.txt");
		
		ObjectInputStream op = new ObjectInputStream(file);
		
	   Employee e = (Employee) op.readObject();
	   
	   System.out.println(e.id);
	   System.out.println(e.name);
	   System.out.println(e.address);
	   System.out.println(e.salary);
	   
	   op.close();
	   file.close();
	}

}
