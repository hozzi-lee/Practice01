package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {
	public static void main(String[] args) {
		final double pi = 3.14;
		
		Scanner radius = new Scanner(System.in);
		
		System.out.print("반지름: ");
		double V = 4 / 3 * pi * Math.pow( radius.nextDouble(), 3 );
		System.out.println("구의 부피는: "+V+" 입니다.");
		
		
		radius.close();
	}

}
