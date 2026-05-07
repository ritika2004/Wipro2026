package AssignmentDay2;

import java.util.*;

public class User_Role {

	public static void main(String[] args) {
		Scanner ritika=new Scanner(System.in);
		
		System.out.print("\nEnter role (1-Admin, 2-User, 3-Guest): ");
		int role = ritika.nextInt();

        switch (role) {
            case 1:
                System.out.println("Full Access");
                break;
            case 2:
                System.out.println("Limited Access");
                break;
            case 3:
                System.out.println("Guest Access");
                break;
            default:
                System.out.println("Invalid Role");
        }
		

	}

}
