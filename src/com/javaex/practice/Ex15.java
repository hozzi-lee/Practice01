package com.javaex.practice;

import java.util.Scanner;

public class Ex15 {
	public static void main(String[] args) {
		final double mile_1 = 1.609;

		Scanner mile = new Scanner(System.in);

		System.out.print("마일을 입력하세요: ");
		double mileVar = mile.nextDouble(); 
		double kiloMeter = mileVar * mile_1;

		//		System.out.println(""+kiloMeter / mile_1+"mile은 "+kiloMeter+"km 입니다.");
		System.out.println(""+mileVar+"mile은 "+kiloMeter+"km 입니다.");

		mile.close();

	}

}
