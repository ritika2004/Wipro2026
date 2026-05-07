package AssignmentDay2;

import java.util.*;

public class Armstrong {

	public static void main(String[] args) {
		Scanner ritika=new Scanner(System.in);
		int n = ritika.nextInt();
		int c=0;
		int temp=n;
		
		while(temp!=0)
		{
			temp/=10;
			c++;
		}
        int sum = 0;
        int temp1 = n;

        while (temp1 != 0) {
            int rem = temp1 % 10;
            sum+=(int)Math.powExact(rem, c);
            temp1 /= 10;
        }

        if (n==sum) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }
		

	}

}
