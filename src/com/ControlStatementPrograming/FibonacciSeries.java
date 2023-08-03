package com.ControlStatementPrograming;

// 0, 1, 1, 2, 3, 5, 
public class FibonacciSeries {
	public static void main(String[] args) {
		int no1=0, no2=1, c;
		
		System.out.print(no1+" "+no2);
		for(int i=1; i<=10; i++) {
		c= no1+no2;
		no1=no2;
		no2=c;
		System.out.print(" "+c);
		}
	}

}
