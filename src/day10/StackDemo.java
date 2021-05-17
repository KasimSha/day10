package day10;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack<String> stack=new Stack<>();
		
		stack.push("Kasim");
		stack.push("Roshan");
		stack.push("keyan");
		stack.push("siraj");
		
		System.out.println(stack);
		
		
		System.out.println(stack.pop());
		
		System.out.println(stack);
	}
}
