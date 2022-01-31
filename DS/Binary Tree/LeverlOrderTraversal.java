package tree;

public class LeverlOrderTraversal {
	
	static class Node{
		int key;
		Node left, right;
		Node(int d){
			key = d;
			left = null;
			right = null;
		}
	}
	
	Node root;
	
	LeverlOrderTraversal(){
		root = null;
	}
	
	public static void main(String[] args) {
		
		LeverlOrderTraversal tree = new LeverlOrderTraversal();
		tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
 
       System.out.println("Level order traversal of binary tree is ");
       tree.printLevelOrder();
	}

	private void printLevelOrder() {
		
		int h = height(root);
		for(int i=1; i<=h; i++) {
			printCurrentLevel(root, i);
		}
		
	}

	
	private int height(Node node) {
		
		if(node == null)
		return 0;
		else {
			int lheight = height(node.left);
			int rheight = height(node.right);
			
			if(lheight > rheight) 
				return (lheight +1);
			else
				return (rheight+1);
			
		}
		
	}
	
	private void printCurrentLevel(Node node, int level) {
		
		if(node == null) return;
		if(level == 1) System.out.print(node.key+ " ");
		else if(level >1) {
			printCurrentLevel(node.left, level-1);
			printCurrentLevel(node.right, level-1);
		}
		
	}

	

}
