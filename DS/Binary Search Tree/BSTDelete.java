package binarySearchTree;

public class BSTDelete {

	static class Node{
		
		int key;
		Node left, right;
		Node(int data){
			key = data;
			left = right = null;
		}
	}
	
	Node root;
	
	BSTDelete(){
		root = null;
	}
	
	

	private void inorder() {
		inorderRec(root);
		
	}
	
	 void inorderRec(Node root)
	    {
	        if (root != null) {
	            inorderRec(root.left);
	            System.out.print(root.key+ " ");
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
	
public static void main(String[] args) {
		
		BSTDelete tree = new BSTDelete();
		tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
		
		tree.inorder();
		
		tree.delete(40);
		
		System.out.println();
		
		tree.inorder();
	}

    private void delete(int key) {
	
    	root = deleteKey(root, key);
	
    }



	private Node deleteKey(Node node, int key) {
		
		if(node == null) return node;
		if(key< node.key) root.left = deleteKey(node.left, key);
		else if(key> node.key) node.right = deleteKey(node.right, key);
		else {
			if(node.left == null)
				return node.right;
			else if(node.right == null)
				return node.left;
			node.key = minValue(node.right);
			node.right = deleteKey(node.right, node.key);
			
		}
		return node;
	}



	private int minValue(Node node) {
		
		int minValue = node.key;
		while(node.left != null) {
			minValue = node.left.key;
			node = node.left;
		}
		return minValue;
	}
}
