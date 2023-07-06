package com.practicals;

public class FindIndex {
	
	public static void main(String[] args) {
		
		int[] arr = {22, 11, 34, 55, 45, 88, 97, 75};
		
		int index = -1;
		int num = 45;
		
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i] == num) {
				index = i;
			}
			
		}
		System.out.println(index);
	}

}
