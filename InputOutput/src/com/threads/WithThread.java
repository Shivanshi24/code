package com.threads;

import java.lang.*;

public class WithThread extends Thread {
	String name = null;

	public WithThread(String name) {
		this.name = name;

	}

	@Override
	public void run() {

		for (int i = 1; i <= 10; i++) {

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i + "=" + name);

		}
	}

}
