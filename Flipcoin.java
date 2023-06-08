package com.bridgelabz.functionalprogram;

import com.bridgelabz.utility.Utility;

public class Flipcoin{
		public static void main(String[] args) 
		{
			Utility utility=new Utility();
			System.out.println("enter how many times the coin should be flipped");
			int numberOfTimes = utility.inputInteger();
			Utility.percentOfHeadTail(numberOfTimes);
		}
}
