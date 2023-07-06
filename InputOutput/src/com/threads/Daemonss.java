package com.threads;

import java.lang.*;

public class Daemonss extends Thread {
	String name = null;

	public Daemonss(String name) {
		this.name = name;

	}

	@Override
	public void run() {

		for (int i = 1; i <= 500; i++) {

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i + "=" + name);

		}
	}

}
