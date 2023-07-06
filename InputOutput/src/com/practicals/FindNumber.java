package com.practicals;

public class FindNumber {

	public static void main(String[] args) {

		int[] arr1 = { 10, 20, 30, 40, 50, 60 };
		int[] arr2 = { 10, 20, 30, 50, 60 };

		int index = 0;
		int i, j;

		for (i = 0; i < arr1.length; i++) {
			for (j = 0; j < arr2.length; j++) {

				if (arr1[i] == arr2[j]) {
					index = 1;
				}

			}
			if (index == 1) {
				index = 0;
			} else {
				System.out.println(arr2[i]);
			}

		}
	}

}
