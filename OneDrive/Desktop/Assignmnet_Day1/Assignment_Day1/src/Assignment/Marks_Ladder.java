package Assignment;

import java.util.Scanner;

public class Marks_Ladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ritika=new Scanner(System.in);
		float per=ritika.nextFloat();
		if(per>=75 && per<=100)
		{
			System.out.println("Dist");
		
		}
		else if(per>=60 && per<75)
		{
			System.out.println("First Class");
		}
		else if(per>=50 && per<60)
		{
			System.out.println("Second Class");
		}
		else if(per>=40 && per<50)
		{
			System.out.println("pass Class");
		}
        else if (per<40 && per>0) {
        	System.out.println("Fail");
        }
        else {
        	System.out.println("Invalid input");
        }


	}

}
