
public class LinkedList {
	public int val;
	public LinkedList next;
	public LinkedList(int value) {
		val = value;
		next = null;
	}
	public static void main(String args[]) {
		LinkedList myLinked = new LinkedList(5);
		System.out.println(myLinked.val);
	}
	
}

