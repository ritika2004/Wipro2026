package Assignment;

import java.util.Scanner;

public class Zero_Neg_Pos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ritika=new Scanner(System.in);
		int n=ritika.nextInt();
		if(n<0)System.out.println("Number is negative");
		else if(n==0)System.out.println("Numer is Zero");
		else System.out.println("Number is positive");
	}

}
