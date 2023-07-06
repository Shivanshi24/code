package com.threads;

public class TestWithThread {

	public static void main(String[] args) {
		WithThread w1 = new WithThread("shivi");
		w1.setPriority(1);
		// WithThread w2 = new WithThread("Jerry");
		// w2.setPriority(10);

		w1.start();
		// w2.start();

		for (int i = 1; i <= 10; i++) {

			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			System.out.println(i + " = main");

		}

	}

}
