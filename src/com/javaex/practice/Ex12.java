package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
		final double pi = 3.14;
		
		Scanner radius = new Scanner(System.in);
		System.out.print("반지름을 입력하세요: ");
		
		double circleArea = Math.pow( radius.nextInt(), 2 ) * pi;
		
		System.out.println("원의 넓이는 "+circleArea+"");
		
		radius.close();
	}

}
