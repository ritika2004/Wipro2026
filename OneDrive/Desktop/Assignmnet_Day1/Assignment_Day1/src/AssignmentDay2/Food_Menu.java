package AssignmentDay2;
import java.util.*;
public class Food_Menu {

	public static void main(String[] args) {
		Scanner ritika=new Scanner(System.in);
		System.out.println("Food Menu");
        System.out.println("1 -> Pizza");
        System.out.println("2 -> Burger");
        System.out.println("3 -> Pasta");
        System.out.print("Select item number: ");
        
        int foodOrderNumber=ritika.nextInt();
        
        switch(foodOrderNumber)
        {
        case 1:
            System.out.println("Pizza of Rs.100");
            break;
        case 2:
            System.out.println("Burger of Rs.100");
            break;
        case 3:
            System.out.println("Pasta of Rs.150");
            break;
        default:
            System.out.println("Invalid Item");
        }
  }
}
