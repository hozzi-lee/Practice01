package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {

		Scanner moneyMonth = new Scanner(System.in);

		System.out.print("월급을 입력하세요: ");
		int money = moneyMonth.nextInt() * 120;

		System.out.println("10년동안 최대 저축액은 "+money+"원 입니다.");

		moneyMonth.close();

	}

}
