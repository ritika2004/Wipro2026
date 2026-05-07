package AssignmentDay2;

import java.util.*;

public class Atm_Program {

	public static void main(String[] args) {
		Scanner ritika=new Scanner(System.in);
		
        double balance = 5000;
        System.out.println("\nATM Menu");
        System.out.println("1 -> Check Balance");
        System.out.println("2 -> Deposit");
        System.out.println("3 -> Withdraw");
        System.out.println("4 -> Exit");
        System.out.print("Enter your choice: ");
        
        int ch = ritika.nextInt();

        switch (ch) {
            case 1:
                System.out.println("Balance = " + balance);
                break;
            case 2:
                System.out.print("Enter deposit amount: ");
                double deposit = ritika.nextDouble();
                balance += deposit;
                System.out.println("Updated Balance = " + balance);
                break;
            case 3:
                System.out.print("Enter withdraw amount: ");
                double withdraw = ritika.nextDouble();
                if (withdraw <= balance) {
                    balance -= withdraw;
                    System.out.println("Updated Balance = " + balance);
                } else {
                    System.out.println("Insufficient Balance");
                }
                break;
            case 4:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Invalid Choice");
        }

	}

}
