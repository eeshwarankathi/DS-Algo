package com.eeshwarankathi;

public class SelectionSort {

	public static int[] sort(int[] lst) {
		System.out.println(System.currentTimeMillis());
		int length = lst.length;
		for (int i = 0; i < length; i++) {
			int in = i;
			int smallest = lst[i];
			for (int j = i + 1; j < length; j++) {
				if (smallest > lst[j]) {
					smallest = lst[j];
					in = j;
				}
			}
			if (in != i) {
				lst[in] = lst[i];
				lst[i] = smallest;
			}
		}
		System.out.println(System.currentTimeMillis());
		return lst;
	}

}
