package day10;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoLists {
	public static void main(String[] args) {
		
	List<String>list1=new ArrayList<>();
	
	list1.add("kasim");
	list1.add("Roshan");
	
	
	List<String>list2=new ArrayList<>();
	
	list2.add("karim");
	list2.add("siraj");
	
	list1.addAll(list2);
	System.out.println(list2);
	System.out.println(list1);
	}
}
