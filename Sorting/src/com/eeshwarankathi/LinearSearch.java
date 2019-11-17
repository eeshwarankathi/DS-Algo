package com.eeshwarankathi;

public class LinearSearch {

	public static String search(int[] list, int num) {
		System.out.println(System.currentTimeMillis());
		int length = list.length;
		for (int i = 0; i < length; i++) {
			if (list[i] == num) {
				System.out.println(System.currentTimeMillis());
				return num + " FOUND at " + i;
			}
		}
		System.out.println(System.currentTimeMillis());
		return num + " NOT FOUND";
	}

}
