package AssignmentDay3;
import java.util.*;
public class SortArray {

	public static void main(String[] args) {
		Scanner ritika=new Scanner(System.in);
		int n=ritika.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=ritika.nextInt();
		}
		
		Arrays.sort(arr);
		
		System.out.println("In Ascending order");
		
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
         System.out.println("\nIn Descending order");
		
		for(int i=n-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
}
}
