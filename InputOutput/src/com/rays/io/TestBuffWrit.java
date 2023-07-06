package com.rays.io;

import java.io.*;
public class TestBuffWrit {
	
	public static void main(String[] args) throws Exception {
		
		FileWriter file = new FileWriter("C:\\Users\\shiva\\OneDrive\\Desktop\\Io\\hii.txt");
		
		BufferedWriter bw = new BufferedWriter(file);
		
		
		bw.write("SUNRAYS");
		bw.write("\t RAYS");
		bw.close();
	}

}
