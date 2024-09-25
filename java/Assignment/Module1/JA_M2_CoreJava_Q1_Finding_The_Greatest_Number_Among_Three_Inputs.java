package com.Assighment_ModuleTwo_Java_Intro;

// QUA. 1 -> Write a Java program to Take three numbers from the user and print the greatest number.

public class JA_M2_CoreJava_Q1_Finding_The_Greatest_Number_Among_Three_Inputs
{
	public static void main(String[] args)
	{
		int a=2000, b=1500, c=1000;  
		if(a>=b && b>=c)
		{
			System.out.println("A is Max -->>"+a);
		}
		else if(b>=a && b>=c)
		{
			System.out.println("B is Max -->>"+b);
		}
		else if(c>=a && c>=b)
		{
			System.out.println("C is Max -->>"+c);
		}
	}
}
