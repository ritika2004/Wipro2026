package Assignment;

import java.util.Scanner;

public class Largest_Three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ritika=new Scanner(System.in);
		int a=ritika.nextInt();
		int b=ritika.nextInt();
		int c=ritika.nextInt();
		if(a>b)
		{
			if(a>c)System.out.println("a is greater");
			else System.out.println("c is greater");
		}
		else {
			if (b>c)System.out.println("b is greater");
			else System.out.println("c is greater");
		}

	}

}
