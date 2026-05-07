package AssignmentDay2;

import java.util.*;
public class Fibonacci_Series {

	public static void main(String[] args) {
		Scanner ritika=new Scanner(System.in);
		
		int n = ritika.nextInt();
        int a = 0, b = 1, c;
        while (n>0) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
            n--;
        }

	}

}
