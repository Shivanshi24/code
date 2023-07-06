
package com.practicals;

public class FiboniccaSeries {
	
	public static void main(String[] args) {
		
		int term = 10;
		int a = 0;
		int b = 1;
		int c;
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(a);
			c = a + b;
			a = b;
			b = c;
		}
	}

}
