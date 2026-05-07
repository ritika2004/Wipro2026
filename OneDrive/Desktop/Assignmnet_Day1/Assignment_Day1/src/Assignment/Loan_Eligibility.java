package Assignment;

import java.util.*;

public class Loan_Eligibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ritika =new Scanner(System.in);
		int age=ritika.nextInt();
		double slry=ritika.nextDouble();
		
		if(age>=21 && age<=60 && slry>20000)
		{
			System.out.println("Eligible");
		}
		else if(age<21 || age>60)
		{
			System.out.println("Not Eligible");
		}
		else if (slry<20000)System.out.println("Not Eligible");
		

	}

}
