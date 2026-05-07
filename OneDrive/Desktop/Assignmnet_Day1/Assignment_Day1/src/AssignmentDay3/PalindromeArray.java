package AssignmentDay3;

import java.util.*;
public class PalindromeArray {

	public static void main(String[] args) {
		Scanner ritika=new Scanner(System.in);
		int n=ritika.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=ritika.nextInt();
		}
		int i=0;
		int j=n-1;
		boolean res=true;
		while(i<j)
		{
			if(arr[i]!=arr[j])
			{
				res=false;
				break;
			}
			i++;j--;
		}
		if(res)System.out.println("Array is Palindrome");
		else System.out.println("Array is not Palindrome");
		

	}

}
