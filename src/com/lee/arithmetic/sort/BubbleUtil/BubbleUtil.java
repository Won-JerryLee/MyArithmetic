package com.lee.arithmetic.sort.BubbleUtil;

public class BubbleUtil {

	public static void doBubble(int array[]) {
		for (int x = 0; x < array.length - 1; x++) {
			for (int y = 0; y < array.length - 1 - x; y++) {
				if (array[y] > array[y + 1]) {
					array[y] = array[y] ^ array[y + 1];
					array[y + 1] = array[y] ^ array[y + 1];
					array[y] = array[y] ^ array[y + 1];
				}
			}
		}
	}

}
