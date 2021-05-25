package com.javaex.practice;

public class Ex04 {
	public static void main(String[] args) {
		
		/* Ex04 문제
		int x, y --> 변수이름에 공백과 사용 불가능한 특수문자(,) 사용됨 세미콜론(;) 없음
		
		x = 10 --> 세미콜론(;) 없음
		y = 20 --> 세미콜론(;) 없음
		
		sum = x + y --> 자료형(int) 설정 안됨
		
		System.out.println("합은 ' + sum); --> "합은 ' → 따옴표를 쌍따옴표 "합은 " 으로 변경
		*/
		
		int x, y; // --> 틀렸음: 변수이름/값 동일 라인에 설정 가능
		
		x = 10;
		y = 20;
		
		int sum = x + y;
		
		System.out.println("합은 " + sum);
	}

}
