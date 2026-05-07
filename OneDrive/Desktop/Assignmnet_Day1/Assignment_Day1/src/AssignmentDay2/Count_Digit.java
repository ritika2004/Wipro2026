package AssignmentDay2;

import java.util.*;

public class Count_Digit {

	public static void main(String[] args) {
		Scanner ritika=new Scanner(System.in);
		
        int num = ritika.nextInt();
        int count = 0, temp = num;

        while (temp != 0) {
            temp /= 10;
            count++;
        }
        System.out.println("Number of digits = " + count);

	}

}
