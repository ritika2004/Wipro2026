package AssignmentDay2;

import java.util.*;
public class Reverse_Number {

	public static void main(String[] args) {
		Scanner ritika=new Scanner(System.in);
		int n = ritika.nextInt();
        int rev = 0;
        int temp = n;

        while (temp != 0) {
            int rem = temp % 10;
            rev = rev * 10 + rem;
            temp /= 10;
        }
        System.out.println("Reversed Number = " + rev);

	}

}
