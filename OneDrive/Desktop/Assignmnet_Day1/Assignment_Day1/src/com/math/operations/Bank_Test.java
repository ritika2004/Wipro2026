package com.math.operations;

abstract class Bank {
      
	abstract int getInterestRate();
}


class SBI extends Bank {
    int getInterestRate() {
        return 7;
    }
}


class HDFC extends Bank {
    int getInterestRate() {
        return 8;
    }
}

class ICICI extends Bank {
    int getInterestRate() {
        return 9;
    }
}




public class Bank_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b1 = new SBI();
        Bank b2 = new HDFC();
        Bank b3 = new ICICI();

        System.out.println("SBI Rate: " + b1.getInterestRate() + "%");
        System.out.println("HDFC Rate: " + b2.getInterestRate() + "%");
        System.out.println("ICICI  Rate: " + b3.getInterestRate() + "%");

	}

}
