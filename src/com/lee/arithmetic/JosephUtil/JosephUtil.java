package com.lee.arithmetic.JosephUtil;

public class JosephUtil {

	public static void doJoesph(int[] array, int start, int step) {
		int len = array.length;
		int m = len;
		int n = step;
		int i = start;
		int j = 1;
		while (len > 0) {
			if (array[i % m] > 0) {
				if (j % n == 0) {
					System.out.println(array[i % m] + ",ГіСа");
					array[i % m] = -1;
					i++;
					len--;
					j = 1;
				} else {
					i++;
					j++;
				}
			} else {
				i++;
			}
		}
	}

}
