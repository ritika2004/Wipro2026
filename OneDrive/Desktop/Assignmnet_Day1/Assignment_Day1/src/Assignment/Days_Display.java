package Assignment;

import java.util.*;
public class Days_Display {
	public static void main(String args[])
	{
		Scanner ritika=new Scanner(System.in);
		System.out.println("Enter you days(1,2,3,4,5,6,7)");
		int n=ritika.nextInt();
		
		switch(n)
		{
		case 1: System.out.println("Monday");break;
		case 2: System.out.println("Tuesday");break;
		case 3: System.out.println("Wednesday");break;
		case 4: System.out.println("Thursay");break;
		case 5: System.out.println("Friday");break;
		case 6: System.out.println("Saturday");break;
		case 7: System.out.println("Sunday");break;
		default: System.out.println("Invalid input");
		}
	}

}
