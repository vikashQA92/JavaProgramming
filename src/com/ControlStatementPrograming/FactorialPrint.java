package com.ControlStatementPrograming;

public class FactorialPrint {

	// 5= 5*4*3*2*1;
	public static void main(String[] args) {
		int no = 6;
		int fact = 1;
		for (int i = 1; i <= no; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of no " + no +" is " + fact);

	}

}
