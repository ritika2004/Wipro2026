package com.math.operations;

import com.math.operations.Calculator;

public class Calculator_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal = new Calculator();

        System.out.println("Addition: " + cal.add(10, 5));
        System.out.println("Subtraction: " + cal.sub(10, 5));
        System.out.println("Multiply: " + cal.mul(10, 5));
        System.out.println("Division: " + cal.div(10, 0));
	}

}
