package com.programming;

import java.util.Scanner;

public class Calculator2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number");
		int no1 = sc.nextInt();

		System.out.println("Enter 2nd number");
		int no2 = sc.nextInt();

		System.out.println("Enter the Symbol (+,-,*,/)");
		String symbol = sc.next();

		switch (symbol) {
		case "+":
			System.out.println("Result is :" + (no1 + no2));
			break;

		case "-":
			System.out.println("Result is :" + (no1 - no2));
			break;
		case "*":
			System.out.println("Result is :" + (no1 * no2));
			break;
		case "/":
			System.out.println("Result is :" + (no1 / no2));
			break;
		default:
			System.out.println("Inavalid value");
			break;
		}
		sc.close();
	}

}
