package com.threads;

public class TestWithoutThread {
	
	public static void main(String[] args) {
		
		WithoutThread w1 = new WithoutThread("Swati");
		WithoutThread w2 = new WithoutThread("Rubi");
		
		w1.run();
		w2.run();
	}

}
