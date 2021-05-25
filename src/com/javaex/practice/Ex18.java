package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {
	public static void main(String[] args) {
		
		Scanner F = new Scanner(System.in);
		
		System.out.print("화씨: ");
		double FC = F.nextDouble();
		double C = (double)5 / 9 * (FC - 32);
		System.out.println("화씨 "+FC+"℉ 의 섭씨온도는 "+C+"℃ 입니다.");
		
		F.close();
	}

}
