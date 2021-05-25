package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
		
		final double $1 = 1230.95;
		
		Scanner won = new Scanner(System.in);
		
		System.out.print("환전할 원화를 입력하세요: ");
		double dollar = won.nextDouble() / $1;
		
		System.out.println("받으실 달러는 "+dollar+"");
		
		won.close();
	}

}
