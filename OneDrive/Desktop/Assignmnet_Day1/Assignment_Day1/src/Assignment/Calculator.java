package Assignment;

import java.util.*;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter operation(+,-,*,/)");
		String op=sc.next();
		System.out.println("Enter first number");
		int a =sc.nextInt();
		System.out.println("Enter second number");
		int b=sc.nextInt();
		switch(op)
		{
		case "+":System.out.println(a+b);break;
		case "-":System.out.println(a-b);break;
		case "*":System.out.println(a*b);break;
		case "/":System.out.println(a/b);break;
		default:System.out.println("Invalid operation");break;
		}
		

	}

}
