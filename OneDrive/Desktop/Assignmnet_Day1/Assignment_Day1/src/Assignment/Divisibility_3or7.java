package Assignment;

import java.util.Scanner;

public class Divisibility_3or7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ritika=new Scanner(System.in);
		int n=ritika.nextInt();
		if(n%3==0 || n%7==0)System.out.println("Yes");
		else System.out.println("No");

	}

}
