package com.lee.arithmetic.BinaryChop;

public class BinaryChopUtil {

	public static int doBinaryUtil(int[] array, int value) {
		int min = 0;
		int max = array.length - 1;
		int mid = 0;
		while (min <= max) {
			mid = (min + max) / 2;
			if (array[mid] > value) {
				max = mid - 1;
			} else if (array[mid] < value) {
				min = mid + 1;
			} else {
				return mid;
			}
		}
		return -1;
	}

}
