package Assignment;

import java.util.*;

public class Vowel_Consonent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ritika=new Scanner(System.in);
		
		char s =ritika.next().charAt(0);
		if(s=='a'||s=='e' || s=='i'||s=='o'||s=='u'||s=='A'|| s=='E'||s=='I'|| s=='O'||s=='U')
		{
			System.out.println("character is vowel");
		}
		else System.out.println("character is consonant");
		

	}

}
