package AssignmentDay2;
import java.util.*;
public class Prime_Number {

	public static void main(String[] args) {
		Scanner ritika=new Scanner(System.in);
		
		int n = ritika.nextInt();
        int i = 2;
        boolean isPrime = true;

        while (i <= n / 2) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
            i++;
        }

        if (n > 1 && isPrime) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a Prime Number");
        }

	}

}
