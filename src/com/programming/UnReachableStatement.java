package com.programming;

public class UnReachableStatement {
	
	public static void main(String[] args) {
		
		for(int i=1; ; i++)
		{
			System.out.println(i);
		}
		//System.out.println("Hello"); // Unreachable statement Error
	}

}
