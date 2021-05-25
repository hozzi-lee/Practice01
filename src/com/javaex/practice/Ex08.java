package com.javaex.practice;

public class Ex08 {
	public static void main(String[] args) {
		
		/*
		int x, y = 0; // x와 y를 모두 0으로 초기화 --> 문제없음
		char grade = "A"; // 문자 A를 grade에 대입 --> 쌍따옴표""를 작은따옴표""로 변경
		int salary = 2000000; // salary에 2,000,000을 대입 --> 1. 2,000,000을 문자로 대입 / 2. 2000000을 정수형으로 대입
		byte n = 1000; // n에 1000을 대입 --> byte는 -128 ~ 127 까지 가능. 자료형을 short 이상으로 변경
		*/
		
		// 변경사항 없음
		int x, y = 0;
		
		// 쌍따옴표""를 작은따옴표""로 변경
		char grade = 'A';
		
		// 1. 2,000,000을 문자로 대입 / 2. 2000000을 정수형으로 대입
		String salary2 = "2,000,000";
		int salary = 2000000;
		
		// byte는 -128 ~ 127 까지 가능. 자료형을 short 이상으로 변경
		Short n = 1000;
		int n2 = 1000;
		long n3 = 1000;
		
	}

}
