package com.lee.arithmetic.sort.SelectionUtil;

public class SelectUtil {

	public static void doSelect(int[] array) {
		for (int x = 0; x < array.length - 1; x++) {
			for (int y = x + 1; y < array.length; y++) {
				if (array[y] < array[x]) {
					array[x] = array[x] ^ array[y];
					array[y] = array[x] ^ array[y];
					array[x] = array[x] ^ array[y];
				}
			}
		}
	}

}
