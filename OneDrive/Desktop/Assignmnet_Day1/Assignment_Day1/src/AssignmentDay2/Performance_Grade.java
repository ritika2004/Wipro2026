package AssignmentDay2;

import java.util.*;
public class Performance_Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ritika=new Scanner(System.in);
		char grade = ritika.next().charAt(0);

        switch (grade) {
            case 'A':System.out.println("Excellent Performance");break;
            case 'B':System.out.println("Very Good Performance");break;
            case 'C':System.out.println("Good Performance");break;
            case 'D':System.out.println("Needs Improvement");break;
            case 'F':System.out.println("Fail");break;
            case 'a':System.out.println("Excellent Performance");break;
            case 'b':System.out.println("Very Good Performance");break;
            case 'c':System.out.println("Good Performance");break;
            case 'd':System.out.println("Needs Improvement");break;
            case 'f':System.out.println("Fail");break;
            default:System.out.println("Invalid Grade");
        }

	}

}
