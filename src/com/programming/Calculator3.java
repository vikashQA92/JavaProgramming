package com.programming;

import java.util.Scanner;

public class Calculator3 {
	public static void main(String[] args) {
		String symbol, yn;
		int no1, no2;

		Scanner sc = new Scanner(System.in);
		do {

			System.out.println("Enter 1st number");
			no1 = sc.nextInt();

			System.out.println("Enter 2nd number");
			no2 = sc.nextInt();

			System.out.println("Enter the Symbol (+,-,*,/)");
			symbol = sc.next();

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
			System.out.println("DO you want to COntinue(press y for yes and n for no)");
			yn = sc.next();
			System.out.println("---------------------------");
		} while (yn.equals("Y") || yn.equals("y"));
		
		System.out.println("Exit Successfully from Calaculator programe");
        sc.close();
	}

}
