package com.rays.io;

@FunctionalInterface
public interface TestHello {

	public void show();
	
	public default void DefaultMethod() {
		System.out.println("Default method");
	}
	
	public static void StaticMethod() {
		System.out.println("Static Method");
	}

}
