package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {
	public static void main(String[] args) {
		
		Scanner coin = new Scanner(System.in);
		
		System.out.print("500원 개수: ");
		int c500 = coin.nextInt() * 500;
		
		System.out.print("100원 개수: ");
		int c100 = coin.nextInt() * 100;
		
		System.out.print("50원 개수: ");
		int c50 = coin.nextInt() * 50;
		
		System.out.print("10원 개수: ");
		int c10 = coin.nextInt() * 10;
		
		int total = c500 + c100 + c50 + c10;
		
		System.out.println("동전의 총합은 "+total+"원 입니다.");
		
		coin.close();
	}

}
