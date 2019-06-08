package pack1;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 10; i <=100; i+=10) {
			stack.push(i);
		}
		System.out.println(stack);
		System.out.println(stack.empty());
		System.out.println(stack.peek());
		System.out.println(stack.pop()+" "+stack.size());
		System.out.println(stack.peek());
		System.out.println(stack.search(50));

	}

}
