package com.rays.io;
import java.lang.*;
public class RaceClass extends Thread{
	
	private String name;
	public static Account account = new Account();
	
	public RaceClass(String name) {
		this.name = name;
	}
	@Override
	public void run() {
		for(int i =1; i <= 5; i++) {
			account.deposit(name, 1000);
		}
			}

}
