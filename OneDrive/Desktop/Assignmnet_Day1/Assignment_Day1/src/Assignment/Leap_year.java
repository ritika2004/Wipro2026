package Assignment;

import java.util.*;
public class Leap_year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ritika=new Scanner(System.in);
		int y=ritika.nextInt();
		if(y%4==0 || y%400==0 && y%100!=0)
		{
			System.out.println("Year is leap year");
		}
		else {
			System.out.println("Year is not leap year");
		}

	}

}
