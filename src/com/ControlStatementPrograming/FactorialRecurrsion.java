package com.ControlStatementPrograming;

// WAP to print factorial of the number using recursion.
/*   Recursion is calling same method Again and Again.
 *   Example:
 *   void m1()
 *   {
 *   syso ("HI")
 *     m1()
 *   }
 */
public class FactorialRecurrsion {

	static int fact =1;
	public static void main(String[] args) {
		int no=5;
		FactorialRecurrsion obj= new FactorialRecurrsion();
		obj.calcFact(no);
		System.out.println("Factorial of "+no+" is "+fact);
	}
	
	void calcFact(int no)
	{
		if(no>=1)
		{
			fact= fact*no;
			no=no-1;
			calcFact(no);
		}
	}
}
