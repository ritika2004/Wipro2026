package Assignment8;

import java.util.*;


public class NonRepeatingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		str=str.toLowerCase();
		HashMap<Character,Integer> map=new HashMap<>();
		  for (char ch : str.toCharArray()) {
	            map.put(ch, map.getOrDefault(ch, 0) + 1);
	        }
		  for (char ch : str.toCharArray()) {
	            if (map.get(ch) == 1) {
	                System.out.println("First non-repeating character: " + ch);
	                
	               
	            }
	        }
		  

		

	}

}
