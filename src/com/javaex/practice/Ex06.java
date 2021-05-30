package com.javaex.practice;

public class Ex06 {
	public static void main(String[] args) {
		
		int i = 10;
		int n = i++ % 2; // (i % 2)의 값을 n에 대입 후 i값 1증가
		
		System.out.println(i); // 10 --> 틀림 11
		System.out.println(n); // 10 % 2 출력 후 10 + 1 입력 ∴ 출력 == 0 --> 정답
		
		// 오답노트: i 출력을 n값 초기화 전에 했으면 10, 이후에 했으므로 11
	}

}
