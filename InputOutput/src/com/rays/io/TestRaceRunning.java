package com.rays.io;

public class TestRaceRunning {
	
	public static void main(String[] args) {
		 Account a1 = new Account();
		 
		 for(int i = 1; i <=5; i++) {
			 a1.deposit("Shivi", 1000);
			 
		 }
		 
		 for(int i = 1; i <=5; i++) {
			 a1.deposit("Shweta", 1000);
		 }
	}

}
