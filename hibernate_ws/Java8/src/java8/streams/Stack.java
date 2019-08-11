package java8.streams;

public class Stack {
	
	
	int maxsize;
	long arrayData[];
	int top=-1;
	
	
	public Stack(int size) {
		//this.size = size;
		arrayData = new long[size];
		maxsize = size;
	}
	
	
	public void push(int item) {
		if(top==maxsize-1)
			System.out.println("stack is fill");
		else
			top++;
			arrayData[top] = item;
	}
	
	
	public long peek() {
		return arrayData[top];
	}
	
	
	public long pop(){
		if(!isEmpty()) {
			long old_top = arrayData[top];
			top--;
			return old_top;
		}
		else {
			System.out.println("stack is empty");
			return top;
			
		}
	}
	
	public boolean isEmpty() {
		return (top==-1);
	}
	
	
	public void display() {
		for (int i = top; i >=0; i--) {
			System.out.println(arrayData[i]);
		}
	}
	
	
	public void deleteAll() {
		while(!isEmpty()) {
			System.out.println("deleted elem"+pop());
		}
	}
	
	public static void main(String[] args) {
		
		
		Stack stack = new Stack(10);
		stack.push(10);
		stack.push(20);
		stack.push(30);
		
		
		stack.display();
		
		stack.deleteAll();
		
	}
	
	
	

}
