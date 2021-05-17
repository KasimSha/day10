package day10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionDemo1 {
	public static void main(String[] args) {
		
		List<String> list=new ArrayList<>();
		
		list.add("kasim");
		list.add("roshan");
		list.add("keyan");
		list.add("siraj");
		
		
		list.remove(1);
		System.out.println(list);
		list.add(1,"roshan");
		System.out.println(list);
		
		boolean present=list.contains("sirajj");
		System.out.println(present);
		
		
		list.removeAll(Arrays.asList("kasim","keyan"));
		System.out.println(list);
		
	}
}
