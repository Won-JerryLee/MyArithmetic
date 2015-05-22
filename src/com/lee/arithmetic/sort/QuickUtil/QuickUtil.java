package com.lee.arithmetic.sort.QuickUtil;

public class QuickUtil {

	public static void doQuick(int[] array, int left, int right) {
		if (left < right) {
			int mid = doSort(array, left, right);
			doQuick(array, left, mid - 1);
			doQuick(array, mid + 1, right);
		}
	}

	private static int doSort(int[] array, int left, int right) {
		int m = array[left];
		while (left < right) {
			while (left < right && array[right] >= m)
				right--;
			array[left] = array[right];
			while (left < right && array[left] <= m)
				left++;
			array[right] = array[left];
		}
		array[right] = m;
		return right;
	}

}
