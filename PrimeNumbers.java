package com.bridgelabz.algorithmprograms;

import com.bridgelabz.utility.Utility;

public class PrimeNumbers {

	public static void main(String[] args) {
		Utility utility =new Utility();
		//int n = 1000;
		for(int i=0;i<1000;i++)
		{
			if(utility.findprimenumber(i));
			{
				System.out.println(i);
			}
		}
	}
}
