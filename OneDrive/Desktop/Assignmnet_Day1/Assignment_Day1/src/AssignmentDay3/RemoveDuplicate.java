package AssignmentDay3;

import java.util.*;

public class RemoveDuplicate {
	
	public static void main(String args[])
	{
		Scanner ritika =new Scanner(System.in);
		int n=ritika.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=ritika.nextInt();
			
		}
		Set<Integer> set=new LinkedHashSet<>();
		for(int i=0;i<n;i++)set.add(arr[i]);
		for(int ele:set)
		{
			System.out.print(ele+" ");
		}
	}

}
