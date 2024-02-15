import java.util.ArrayList;

public class Queue {
	private ArrayList<Integer>queue = new ArrayList<Integer>();
	
	public static void main (String[] args) {
		Queue myQueue = new Queue();
	
		myQueue.inQueue(2);
		myQueue.inQueue(5);
		myQueue.inQueue(78);
		
		if (myQueue.isInQueue(5) == true && myQueue.isInQueue(2)) {
			System.out.println("funcs works as they should!");
		}
		
		myQueue.deQueue(2);
		if (myQueue.isInQueue(2) == false) {
			System.out.println("funcs works as they should!");
		}
	}
	
	public void inQueue (int val) { 
		// new element adds at the end
		queue.add(val);
	}
	public void deQueue (int val) {
		// element removed from the start (first in last out)
		queue.remove(0);
	}
	public boolean isInQueue (int val) { // check if element in the queue
		int size = queue.size();
		for (int i = 0; i < size; i++) {
			if( queue.get(i) == val) { return true;}
		}
		return false;
	}
	

}
