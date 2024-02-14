import java.util.LinkedList;

public class Stack {
	private LinkedList<Integer> stack = new LinkedList<Integer>();
	public static void main (String[] args) {
		
		Stack myStack =  new Stack();
		
		boolean isAdded = myStack.push(2);
		boolean isAdded2 = myStack.push(5);
		if (isAdded == true && isAdded2 == true) {
			System.out.println("numbers have been added!");
		}
		myStack.pop();
		if (myStack.isThere(5) == false) {
			System.out.println("fist number have been deleted");
		}
		
	}
	public boolean push(int val) {
		stack.addLast(val);
		return true;
	}
	public boolean pop() {
		stack.removeLast();
		return true;
	}
	public boolean isThere(int val) {
		return stack.contains(val);
	}
	
}
