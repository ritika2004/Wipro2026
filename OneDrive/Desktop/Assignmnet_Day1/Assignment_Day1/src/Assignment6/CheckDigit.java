package Assignment6;

import java.util.*;


public class CheckDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ritika=new Scanner(System.in);
		char ch=ritika.next().charAt(0);
		if (Character.isDigit(ch)) {
            System.out.println(ch + " is a digit");
        } else {
            System.out.println(ch + " is not a digit");
        }

	}

}
