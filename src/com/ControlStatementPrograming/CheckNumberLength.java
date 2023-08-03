package com.ControlStatementPrograming;

public class CheckNumberLength {
public static void main(String[] args) {
	int no=153867878;
	int temp1=no;
	int leng=0;
	
	while(temp1!=0)
	{
		leng= leng+1;
		temp1=temp1/10;
	}
	System.out.println(leng);
}
}

