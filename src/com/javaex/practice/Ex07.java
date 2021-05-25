package com.javaex.practice;

public class Ex07 {
	public static void main(String[] args) {
		
		int i = 10;
		int n = ++i % 2;
		
		System.out.println(i); // 11
		System.out.println(n); // 10+1 == 11 % 2 == 1
		// Ex06은 출력 후 입력, Ex07은 입력 후 출력
		// Ex06과 마찬가지로 i 출력을 n값 초기화 전에 했으면 10, 이후에 했으므로 11
		
		// 정답!!!
	}

}
