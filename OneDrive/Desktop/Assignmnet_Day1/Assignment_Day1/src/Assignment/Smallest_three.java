package Assignment;

import java.util.Scanner;

public class Smallest_three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ritika=new Scanner(System.in);
		int a=ritika.nextInt();
		int b=ritika.nextInt();
		int c=ritika.nextInt();
		if(a<b)
		{
			if(a<c)System.out.println("a is smallest");
			else System.out.println("c is smallest");
		}
		else {
			if (b<c)System.out.println("b is smallest");
			else System.out.println("c is smallest");
		}

	}

}
