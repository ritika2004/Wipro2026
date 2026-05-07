package AssignmentDay2;

import java.util.*;

public class Sum_Digit {

	public static void main(String[] args) {
		Scanner ritika=new Scanner(System.in);
		
		int n = ritika.nextInt();
        int sum = 0;
        int temp = n;

        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }
        System.out.println("Sum of digits = " + sum);


	}

}
