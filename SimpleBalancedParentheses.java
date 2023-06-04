package com.bridgelabz.datastructureprogram;

import com.bridgelabz.utility.Utility;

public class SimpleBalancedParentheses {

	public static void main(String[] args)
	{
		Utility utility=new Utility();
		//Take user input as String
		System.out.println("Enter a Arithmetic expression ");
		String expression=utility.inputString();
		//Method is used to the user enter the valid Expression or not
		if(utility.checkForValidExpression(expression)==true)
		{
			System.out.println("The given expression is balanced");
		}
		else
		{
			System.out.println("The given expression is not balanced");
		}
	}
}