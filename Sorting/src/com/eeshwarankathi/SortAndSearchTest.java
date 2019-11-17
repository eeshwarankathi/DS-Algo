package com.eeshwarankathi;

import java.util.Arrays;

public class SortAndSearchTest {

	public static void main(String[] args) {
		int[] list = new int[] { 4, 9, 7, 1, 3, 6, 5 };
		System.out.println(Arrays.toString(SelectionSort.sort(list)));
		System.out.println(LinearSearch.search(list, 6));
		System.out.println(LinearSearch.search(list, 0));
	}
}
