
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
		myLinked.add(44);
		System.out.println(myLinked.next.val+ " and " + myLinked.next.next.val + " add into next");
		int isFound = myLinked.find(15);
		if( isFound != 0) {
			System.out.println(15 + " is found!!");
		} else {
			System.out.println(15 + " isn't found!!");
		}
		int isFound1 = myLinked.find(91);
		if( isFound1 != 0) {
			System.out.println(91 + " is found!!");
		} else {
			System.out.println(91 + " isn't found!!");
		}
		
	}
	public int add(int value) {
		
		if(next == null) {
			next = new LinkedList(value);
			return value;
		} else {
			return next.add(value);
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

