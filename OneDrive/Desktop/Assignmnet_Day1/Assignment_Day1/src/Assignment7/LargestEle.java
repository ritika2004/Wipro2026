package Assignment7;
import java.util.*;

public class LargestEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr=new ArrayList<>();
		arr.add(4);		
		arr.add(5);		
		arr.add(20);		
		arr.add(60);		
		arr.add(10);		
		arr.add(1);		
		arr.add(9);		
		arr.add(18);		
		arr.add(45);	
		int secmax=arr.get(0);
		int max=arr.get(0);
		for(int i=1;i<arr.size();i++)
		{
			if(arr.get(i)>max)
				{
				secmax=max;
				max=arr.get(i);
				
				
				}
			else if(arr.get(i)>secmax && max!=arr.get(i))
			secmax=arr.get(i);
		}
		System.out.println(secmax);
		
		

	}

}
