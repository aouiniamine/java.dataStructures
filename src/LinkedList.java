
public class LinkedList {
	public int val;
	public LinkedList next;
	public LinkedList(int value) {
		val = value;
		next = null;
	}
	public static void main(String args[]) {
		LinkedList myLinked = new LinkedList(1);
		System.out.println(myLinked.val);
		myLinked.add(2);
		myLinked.add(3);
		myLinked.add(4);
		myLinked.add(5);
		System.out.println(myLinked.val + " -> " + myLinked.next.val+ " -> "
		+ myLinked.next.next.val + " -> " + myLinked.next.next.next.val + "... add into next");
		int isFound = myLinked.find(2);
		if( isFound != 0) {
			System.out.println(2 + " is found!!");
		} else {
			System.out.println(2 + " isn't found!!");
		}
		int isFound1 = myLinked.find(45);
		if( isFound1 == 0) {
			System.out.println(45 + " is found!!");
		} else {
			System.out.println(45 + " isn't found!!");
		}
		myLinked = myLinked.remove(1, myLinked);
		
		System.out.println("current state (after deletion): " + myLinked.val + " -> " 
		+ myLinked.next.val + " -> " + myLinked.next.next.val + " -> " + myLinked.next.next.next.val);
		
		
	}
	public int add(int value) {
		
		if(next == null) {
			next = new LinkedList(value);
			return value;
		} else {
			return next.add(value);
		}
		
	}
	public LinkedList remove(int value, LinkedList past) {
		if(value == val) {
			if( next == null) {
				return null;
			}
			
			
			return next;
		}
		else {
			
			next = next.remove(value, this);
			return this;
		}
		
	}
	
	public int find(int value) {
		if (val == value) {
			return value;
		}
		else if( next == null) {
			return 0;
		} else {
			return next.find(value);
		}
	}
}

