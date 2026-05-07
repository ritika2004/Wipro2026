package Assignment11;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class SortKeysinMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> map=new HashMap<>();
		map.put("One", 1);
		map.put("Two", 2);
		map.put("Three", 3);
		map.put("Four", 4);
		map.put("Five", 5);
		map.put("Six", 6);
		List<String> keys = new ArrayList<>(map.keySet());
	    Collections.sort(keys);

	    Map< String,Integer> sortedMap = new LinkedHashMap<>();
	    for (String key : keys) {
	        sortedMap.put(key, map.get(key));
	    }
	    for(String key:sortedMap.keySet())
	    {
	    	System.out.println(key+"		"+sortedMap.get(key));
	    }

		

	}

}
