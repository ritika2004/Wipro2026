package com.math.operations;

public class Calculator {
	
	public int add(int a,int b)
	{
		return a+b;
	}
	public int sub(int a,int b)
	{
		return a-b;
	}
	public int mul(int a,int b)
	{
		return a*b;
	}
	public int div(int a,int b)
	{
		if(b==0)
		{
			System.out.print("Err:Division by zero");
			return 0;
		}
		else 
		return a/b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

	}

}
