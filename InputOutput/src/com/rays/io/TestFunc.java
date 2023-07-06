package com.rays.io;

public class TestFunc {
	
	public static void main(String[] args) {
		
		TestHello h1 = new TestHello() {
			
			@Override
			public void show() {
				System.out.println("Show view");				
			}
		};
		h1.show();
		h1.DefaultMethod();
		TestHello.StaticMethod();
	}

}
