package Assignment8;
import java.util.*;

public class Map_Cart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> itemPrice = new HashMap<>();
        itemPrice.put("Laptop", 50000);
        itemPrice.put("Phone", 20000);
        itemPrice.put("Headphones", 2000);
        itemPrice.put("PowerBank", 5000);
        

        
        ArrayList<String> cart = new ArrayList<>();
        cart.add("Laptop");
        cart.add("Phone");
        cart.add("Headphones");
        cart.add("PowerBank");

        int total = 0;

        System.out.println("Cart Items:");
        for (String ele : cart) {
            int price = itemPrice.get(ele);
            System.out.println(ele + " - " + price);
            total += price;
        }

        System.out.println("Total Price: " + total);

	}
}
