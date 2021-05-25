package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {
	public static void main(String[] args) {
		
		Scanner money = new Scanner(System.in);
		
		System.out.print("상품가격(VAT포함): ");
		int price = money.nextInt();
		System.out.print("받은돈: ");
		int pay = money.nextInt();
		
		double VAT = (double)price * 0.1;
		double penny = (double)pay - price;
		
		System.out.println("==========================");
		System.out.println("받은돈: "+(double)pay+"");
		System.out.println("상품가격(VAT포함): "+(double)price+"");
		System.out.println("부가세: "+VAT+"");
		System.out.println("잔액: "+penny+"");
		
		
		money.close();
	}

}
