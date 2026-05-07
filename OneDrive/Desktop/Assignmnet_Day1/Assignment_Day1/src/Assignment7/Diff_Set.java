package Assignment7;

import java.util.ArrayList;
import java.util.HashSet;

public class Diff_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr1=new ArrayList<>();
		arr1.add(4);		
		arr1.add(5);		
		arr1.add(20);		
		arr1.add(60);
		ArrayList<Integer> arr2=new ArrayList<>();
		arr2.add(10);		
		arr2.add(1);		
		arr2.add(5);		
		arr2.add(20);		
		arr2.add(45);
		HashSet<Integer>arr3=new HashSet<>(arr1);
		HashSet<Integer>arr4=new HashSet<>(arr1);
		
		arr3.addAll(arr2);
		arr3.retainAll(arr2);
		arr3.removeAll(arr4);
		System.out.println(arr3);
	}

}
