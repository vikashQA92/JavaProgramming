package com.programming;

public class Swap2 {
	public static void main(String[] args) {
		int no1=50, no2=100;
		
		no1= no1+no2; // 50+100=150
		no2= no1-no2; // 150-100=50
		no1= no1-no2; // 150-50=100
		
		System.out.println("Number1 value is " + no1);
		System.out.println("Number2 value is " + no2);
	}

}
