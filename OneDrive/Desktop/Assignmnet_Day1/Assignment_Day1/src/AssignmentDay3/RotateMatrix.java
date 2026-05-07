package AssignmentDay3;

import java.util.*;

public class RotateMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
	     for (int i = 0; i < n; i++) {
	            for (int j = n - 1; j >= 0; j--) {
	                System.out.print(arr[j][i] + " ");
	            }
	            System.out.println();
	        }

	}

}
