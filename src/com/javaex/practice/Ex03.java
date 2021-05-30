package com.javaex.practice;

public class Ex03 {
	public static void main(String[] args) {
		
		int x = 1;
		int y = 1;
		
		int a = ++x * 2; // x값에 1증가 * 2 후에 a에 대입 --> a = (1 + 1) * 2 == 4  --> x == 2
		int b = y++ * 2; // y값에 * 2 후에 b에 대입 후 y값 1증가 --> b = 1 * 2 == 2 --> y == 2
		
		System.out.println("a=" + a); // 출력 --> a=4
		System.out.println("b=" + b); // 출력 --> b=2
		System.out.println("x=" + x); // 출력 --> x=2
		System.out.println("y=" + y); // 출력 --> y=2
		
		// 정답!!!
	}

}
