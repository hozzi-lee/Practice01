package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {
	public static void main(String[] args) {

		Scanner widthHeight = new Scanner(System.in);

		System.out.print("가로를 입력하세요: ");
		double width = widthHeight.nextDouble();
		System.out.print("세로를 입력하세요: ");
		double height = widthHeight.nextDouble();
		
		double area = width * height;
		double round = (width * 2 + height * 2);

		System.out.println("사각형의 넓이는 "+area+"cm²");
		System.out.println("사각형의 둘레는 "+round+"cm");

		widthHeight.close();

	}

}
