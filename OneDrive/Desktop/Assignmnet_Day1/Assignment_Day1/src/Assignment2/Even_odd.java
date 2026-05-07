package Assignment2;

import java.util.*;
public class Even_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ritika=new Scanner(System.in);
		
		int n=ritika.nextInt();
		switch(n%2) {
		case 0:System.out.println("Even");break;
		
		case 1:System.out.println("Odd");break;
		
		default:System.out.println("Invalid input");break;
		
			
		}
		
		

	}

}
