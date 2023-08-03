package com.ControlStatementPrograming;

public class ArmstrongNo {
	/*
	 *  1. Get Number of Digits(length)
	 *  2. get individual numbers
	 *  3. Multiply individual no until length
	 *  4. sum
	 *  
	 */ 
	public static void main(String[] args) {
		
		int no=153;   // (1*1*1)+ (5*5*5) + (3*3*3)
		int temp1=no;
		int leng=0;
		
		while(temp1!=0) // Checking the length size.
		{
			leng= leng+1;
			temp1=temp1/10;
		}
		//System.out.println("Number lenghth is "+leng);
		
		// Get individual number
		int temp2=no;
		int rem;
		int sum=0;
		while(temp2 !=0)
		{
			rem= temp2 % 10;
			temp2= temp2/10;
			
			int mul=1;
			
			for(int i=1; i<=leng; i++)
			{
				mul=mul*rem;
			}
			sum=sum+mul;
			
		}
		if(no==sum)
		{
			System.out.println("Number is a Armstrong "+sum);
		}
		else
		{
			System.out.println("Number is not a Armstrong");
		}
	}

}
