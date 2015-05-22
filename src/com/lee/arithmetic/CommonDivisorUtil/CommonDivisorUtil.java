package com.lee.arithmetic.CommonDivisorUtil;

public class CommonDivisorUtil {
	
	public static int doMaxCommonDivisor(int m,int n){
		if(m < n){
			m = m ^ n;
			n = m ^ n;
			m = m ^ n;
		}
		if(m % n == 0){
			return n;
		}else{
			doMaxCommonDivisor(n, m%n);
		}
		return 1;
	}

	public static int doMinCommonDivisor(int m,int n){
		return m*n/doMaxCommonDivisor(m, n);
	}
	
}
