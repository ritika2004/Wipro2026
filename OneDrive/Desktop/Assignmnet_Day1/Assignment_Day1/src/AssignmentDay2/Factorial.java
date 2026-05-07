package AssignmentDay2;

import java.util.*;

public class Factorial {

	public static void main(String[] args) {
		Scanner ritika=new Scanner(System.in);
		
		int n = ritika.nextInt();
        int fact = 1, i = 1;

        while (i <= n) {
            fact *= i;
            i++;
        }
        System.out.println(fact);
		

	}

}
