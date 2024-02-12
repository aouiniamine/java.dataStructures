
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
		myLinked.add(8);
		myLinked.add(91);
		System.out.println(myLinked.next.val+ " and " + myLinked.next.next.val + " add into next");
	}
	public int add(int value) {
		
		if(next == null) {
			next = new LinkedList(value);
			return value;
		} else {
			return next.add(value);
		}
		
	}
}

