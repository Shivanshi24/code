package com.rays.io;

public class Account {
	
	private int balance;

	public int getBalance() {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return balance;
	}

	public void setBalance(int balance) {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.balance = balance;
	}
	
	public synchronized void deposit(String name, int amt) {
		int total = getBalance() + amt;
		setBalance(total);
		System.out.println(name+ " = " +getBalance());
	}

}
