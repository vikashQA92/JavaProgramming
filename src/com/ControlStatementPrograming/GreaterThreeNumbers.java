package com.ControlStatementPrograming;

public class GreaterThreeNumbers {

	public static void main(String[] args) {
		int num1= 100;
		int num2= 300;
		int num3 = 50;
		
		if(num1>num2 && num1>num3)
		{
			System.out.println("Num1 is Greater " + num1);
		}
		else if (num2>num1 && num2>num3) 
			{
				System.out.println("Num2 is Greater " + num2);
			}
		else
		{
				System.out.println("Num3 is Greater " + num3);
		}
			
		
	}

}
