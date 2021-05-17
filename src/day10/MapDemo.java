package day10;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
	public static void main(String[] args) {
		Map<String,String> map=new HashMap<>();
		
		map.put("a", "kasim");
		map.put("b", "Ammer");
		map.put("c", "Roshan");
		map.put("d", "keyan");
		
		map.remove("c");
		
		Set<String> keys=map.keySet();
		System.out.println(keys);
		
		
		
		Collection<String> values=map.values();
		System.out.println(values);
		
		System.out.println(map);
		System.out.println();
		
		
		for(Map.Entry<String, String> entrySet : map.entrySet()) {
			String key = entrySet.getKey();
			String value = entrySet.getValue();
			System.out.println(key + " " + value);
			
		}
	}

}
