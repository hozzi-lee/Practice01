package com.javaex.practice;

public class Ex19 {
	public static void main(String[] args) {
		// 둘 중 하나만 l 붙여도 됨 or 하나의 값은 int로 설정해도 가능
		long lightSpeed = 300000l; 
		long yearSeconds = 31536000l;

		long space = lightSpeed * yearSeconds;
		System.out.println("빛이 1년동안 가는 거리는 "+space+"km 입니다.");

	}

}
