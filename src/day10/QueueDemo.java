package day10;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	public static void main(String[] args) {
		Queue<String> list=new LinkedList<>();
		list.add("kasim");
		list.add("roshan");
		list.add("keyan");
		list.add("siraj");
		
		
		System.out.println(list.remove());
	}
}
