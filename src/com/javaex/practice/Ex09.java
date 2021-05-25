package com.javaex.practice;

public class Ex09 {
	public static void main(String[] args) {

		double f = 80.0;
		System.out.println(5 / 9 * (f - 32.0));
		/* 계산순서
		1. (f - 32.0) == 48.0
		2. 5 / 9 == 0 (정수 값으로 계산 되기 때문에 몫의 값이라고 할 수 있다.)
		3. 5 / 9 값 * (f - 32.0) 값  == 0 * 48.0 == 0		
		 */

		// 수정 코드

		System.out.println((double)5 / 9 * (f - 32.0));

		System.out.println(5 / (double)9 * (f - 32.0));

		System.out.println((double)5 / (double)9 * (f - 32.0));

		System.out.println(5.0 / 9.0 * (f - 32.0));

	}

}
