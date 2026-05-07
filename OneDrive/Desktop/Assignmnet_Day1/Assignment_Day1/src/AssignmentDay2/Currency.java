package AssignmentDay2;

import java.util.*;

public class Currency {

	public static void main(String[] args) {
		Scanner ritika=new Scanner(System.in);
		
		System.out.println("\nCurrency Converter");
        System.out.println("1 -> INR to USD");
        System.out.println("2 -> INR to EUR");
        System.out.print("Enter choice: ");
        int currency = ritika.nextInt();

        System.out.print("Enter amount in INR: ");
        double inr = ritika.nextDouble();
        switch (currency) {
        case 1:
            System.out.println("USD = " + (inr / 83));
            break;
        case 2:
            System.out.println("EUR = " + (inr / 90));
            break;
        default:
            System.out.println("Invalid Choice");
    }
		

	}

}
