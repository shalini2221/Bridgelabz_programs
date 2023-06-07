package com.bridgelabz.functionalprogram;

import com.bridgelabz.utility.Utility;

public class Array2D {

	public static void main(String[] args) {
		{
			Utility utility=new Utility();
			System.out.println("enter your choice, which type of values you want to store in the array");
			System.out.println("Type 1 for integer");
			System.out.println("Type 2 for double");
			System.out.println("Type 3 for boolean");
			int n=utility.inputInteger();
			Utility.print2DArray(n);
		}
	}

}
