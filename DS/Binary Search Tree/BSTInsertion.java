package binarySearchTree;

public class BSTInsertion {

	static class Node{
		
		int key;
		Node left, right;
		Node(int data){
			key = data;
			left = right = null;
		}
	}
	
	Node root;
	
	BSTInsertion(){
		root = null;
	}
	
	public static void main(String[] args) {
		
		BSTInsertion tree = new BSTInsertion();
		tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
		
		tree.inorder();
	}

	private void inorder() {
		inorderRec(root);
		
	}
	
	 void inorderRec(Node root)
	    {
	        if (root != null) {
	            inorderRec(root.left);
	            System.out.println(root.key);
	            inorderRec(root.right);
	        }
	    }

	private void insert(int key) {
		
		root = insertNode(root, key);
		
	}

	private Node insertNode(Node node, int key) {
		
		if(node == null) {
			node = new Node(key);
			return node;
		}
		
		if(key < node.key) node.left = insertNode(node.left, key);
		if(key > node.key) node.right = insertNode(node.right, key);
		return node;
		
	}
}
