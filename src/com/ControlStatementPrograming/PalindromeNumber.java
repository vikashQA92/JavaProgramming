package com.ControlStatementPrograming;

public class PalindromeNumber {
	public static void main(String[] args) {
		int no = 12321;
		int temp = no;
		int rem, rev = 0;
		while (temp != 0) {
			rem = temp % 10; // 123210
			rev = rev * 10 + rem;
			temp = temp / 10;
		}
		//System.out.print(rev);

		if (no == rev) {
			System.out.print(no + " Number is palindrome");
		} else {
			System.out.print(no + " Number is not a palindrome");
		}

	}
}
