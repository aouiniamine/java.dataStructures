
public class Tree implements Cloneable{
	private int val;
	private Tree right;
	private Tree left;

	public Tree (int value) {
		val = value;
		right = null;
		left = null;
	}
	
	public static void main(String args[]) {
		Tree myTree = new Tree(8);
		myTree.add(5);
		myTree.add(20);
		myTree.add(3);
		myTree.add(30);
		myTree.add(10);
		
		if(myTree.right.val == 20 && myTree.left.val == 5) {
			System.out.println("fist sub trees work fine!!");
		}
		if(myTree.right.left.val == 10 && myTree.right.right.val == 30) {
			System.out.println("second sub trees work fine!!");
		}
		
		if( myTree.bianarySearch(30) == 30) {
			System.out.println("bianary search work fine!!");
		}
		System.out.println("myTree: " + myTree.val +" " + myTree.right.val);
		try { // try and catch for cloning is for experimentation
			
			Tree clonedTree = (Tree)myTree.clone();
			if(myTree.equals(clonedTree) == true) {
				
				System.out.println("same hereddfggf!!");
				
			}
			myTree.remove(20);
			if(myTree.equals(clonedTree) == false) {
				
				System.out.println("remove branch work fine!!");
				System.out.println("colnedTree: " + clonedTree.val +" " + clonedTree.right.val);
			}
			System.out.println("myTree after branch removal: " + myTree.val +" " + myTree.right.val);
		}  catch (Exception e) {
		      System.out.println(e);
	    }
	}
	
	public int add(int value){
		
		if (value > val) {
			if( right != null) {
				return right.add(value);
			}else {
				right = new Tree(value);
				return value;
				
			}
		} else {
			if( left != null) {
				return left.add(value);
			}else {
				left = new Tree(value);
				return value;
				
			}
		}
	}
	
	public int remove(int value) {
		if( value == val) {
			if( right != null) {
				val = right.val;
				right = right.right;
				return val;
				
			}else if (left != null) {
				val = left.val;
				left = left.left;
				return val;
			} else return 0;
		  
		}
		else if (right != null) {
			return right.remove(value);
			
		} else if( left != null) {
			return left.remove(value);
		
		}else return 0;
		
		
	}
	
	public int bianarySearch(int value) {
		if( value == val) return val;
		if (value > val) {
			if( right != null) {
				return right.add(value);
			}else return 0;
		} else if( left != null) {
				return left.add(value);
		}else return 0;
		
		
	}
	

}
