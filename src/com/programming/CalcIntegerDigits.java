package com.programming;

// WAP to Get the numbers of digits in Integer Value (Ex: 5678=4, 234=3)
public class CalcIntegerDigits {
   public static void main(String[] args) {
	 int no= 56789999;
	 int temp=no;
	 int length=0;
	 
	 while(temp!=0)
	 {
		  length= length+1;
		  temp = temp/10;
	 }
	 System.out.println("Length of:"+ no+" is "+ length);
}
}
