package com.ControlStatementPrograming;

public class CheckPrimeNumber {
	public static void main(String[] args) {
		int no = 7;
		boolean b = false;

		for (int i = 2; i < no; i++) {
			if (no % i == 0) {
				b = true;
			}
		}
		if (b == true) {
			System.out.println("Not a Prime number");
		} else {
			System.out.println("Number is a Prime Number");
		}
	}
}
