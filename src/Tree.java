
public class Tree {
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
	
	public int bianarySearch(int value) {
		if( value == val) return val;
		if (value > val) {
			if( right != null) {
				return right.add(value);
			}else return 0;
		} else {
			if( left != null) {
				return left.add(value);
			}else return 0;
		}
		
	}
	

}
