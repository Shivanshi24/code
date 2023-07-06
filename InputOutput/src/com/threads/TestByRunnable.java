package com.threads;

public class TestByRunnable {
	
	public static void main(String[] args) {
		
		ByRunnable b1 = new ByRunnable("");
		Thread t1 = new Thread(new ByRunnable("kritika"));
		Thread t2 = new Thread(new ByRunnable("rashi"));
		
		t1.start();
		t2.start();
	}

}
