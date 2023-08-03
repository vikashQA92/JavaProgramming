package com.ControlStatementPrograming;

public class ReverseNumber {
	public static void main(String[] args) {
		int no= 35678;
		int temp=no;
		int rev=0;
		int rem;
		while(temp!=0)
		{
			rem=temp%10;
			rev= rev*10+rem;
			temp=temp/10;
		}
		System.out.println("Reverse of" +"no"+"  is: "+rev);
		
	}

}
