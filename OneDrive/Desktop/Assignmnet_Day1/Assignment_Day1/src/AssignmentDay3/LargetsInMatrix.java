package AssignmentDay3;

import java.util.*;

public class LargetsInMatrix {

	public static void main(String[] args) {
		Scanner ritika=new Scanner(System.in);
		int n=ritika.nextInt();
		int m=ritika.nextInt();
		int arr[][]=new int[n][m];
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				arr[i][j]=ritika.nextInt();
				
			}
		}
		
		for(int i=0;i<n;i++)
		{
			int max=Integer.MIN_VALUE;
			for(int j=0;j<m;j++ )
			{
				if(max<arr[i][j])max=arr[i][j];
			}
			System.out.println("Largest element in row"+(i+1)+" "+ max);
		}

	}

}
