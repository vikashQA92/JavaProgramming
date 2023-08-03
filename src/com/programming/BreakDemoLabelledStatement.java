package com.programming;

public class BreakDemoLabelledStatement {
	
	public static void main(String[] args) {
		
		outer:for(int i=1; i<=5; i++)
		{
			System.out.println(i);
			inner:for(int j=1; j<=5; j++)
			{
				System.out.println(j);
				if(j==2)
				{
					break outer;  // Labelled statement 
				}
			}
		}
	}

}
