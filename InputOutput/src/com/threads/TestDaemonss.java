package com.threads;
import java.lang.*;
public class TestDaemonss {
	
	public static void main(String[] args) {
		
		Daemonss d1 = new Daemonss("shubh");
		
		d1.setDaemon(true);
		d1.start();
		
		for(int i = 1; i <= 10; i++) {
			
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i + " = main");
			
			
		}
		
	}

}
