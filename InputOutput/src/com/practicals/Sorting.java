package com.practicals;

public class Sorting {

	public static void main(String[] args) {

		int[] arr = { 10, 50, 86, 15, 99, 65, 24, 20 };

		int temp = 0;

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] > arr[j]) {

					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}

		}
		System.out.print("Asc = ");

		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + ", ");

		}

	}
}
