package Assignment11;

import java.util.*;

public class ElementMaxFreq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {4,5,5,5,4,3,3,2,2,1,5,6,7};
		Map<Integer,Integer>map=new HashMap<>();
		
		for(int i=0;i<arr.length;i++)
		{
			map.put(arr[i],map.getOrDefault(arr[i],0)+1);
		}
		
		int maxfreq=0;
		int maxele=arr[0];
		for(int key:map.keySet())
		{
			if(maxfreq<map.get(key))
			{
				maxfreq=map.get(key);
				maxele=key;
			}
		}
		System.out.println(maxele+" is the element with max frequency "+maxfreq);
		
		

	}

}
