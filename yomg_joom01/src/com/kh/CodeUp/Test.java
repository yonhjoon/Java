package com.kh.CodeUp;

public class Test {
	public static void main(String[] args) {
		Person[] pArr = new Person[3];
		
		pArr[0] = new Person("tlqkf");
		pArr[1] = new Person("시발");
		pArr[2] = new Person("씨발");

		for(int i = 0; i < pArr.length; i++) {
			System.out.println(pArr[i]);
		}
	}
}
