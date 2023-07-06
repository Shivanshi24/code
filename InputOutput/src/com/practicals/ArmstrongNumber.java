package com.practicals;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int num = 371;
		int sum = 0;
		int r;
		int n = num;

		while (n > 0) {

			r = n % 10;
			sum = sum + (r * r * r);
			n = n / 10;

		}
		if (num == sum) {
			System.out.println("Armstrong number = " + num);
		} else {
			System.out.println("Not an armstrong number = " + num);
		}
	}

}
