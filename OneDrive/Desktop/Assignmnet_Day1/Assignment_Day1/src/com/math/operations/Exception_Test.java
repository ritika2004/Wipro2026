package com.math.operations;

interface Division {
    void divide(int a, int b);
}

class Cal implements Division {

    public void divide(int a, int b) {
        try {
            int result = a / b;
            System.out.println("Division Result: " + result);
        } 
        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        }
    }
}


public class Exception_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	        Cal obj = new Cal();

	        obj.divide(10, 2); 
	        obj.divide(10, 0); 

	}

}
