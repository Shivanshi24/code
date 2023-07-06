package com.practicals;

public class SecondLargest {

	public static void main(String[] args) {

		int[] arr = { 6, 12, 78, 99, 85, 34, 85, 97, 100 };

		int a = 0;
		int b = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > b) {
				a = b;
				b = arr[i];
			}

		}
		
		System.out.println(a);

	}

}
