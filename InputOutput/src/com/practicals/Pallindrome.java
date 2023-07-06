package com.practicals;

public class Pallindrome {

	public static void main(String[] args) {
		int num = 252;
		int sum = 0;
		int r;
		int n = num;

		while (n > 0) {

			r = n % 10;
			sum = r + (sum * 10);
			n = n / 10;

		}

		if (num == sum) {
			System.out.println("pallimdrome number " + sum);
		} else {
			System.out.println("not pallindrome number " + sum);

		}

	}

}
