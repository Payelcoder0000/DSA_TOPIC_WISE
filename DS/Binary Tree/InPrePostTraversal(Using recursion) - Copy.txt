package tree;

public class InPrePostTraversal {
	
	static class Node{
		
		int key;
		Node left, right;
		
		public Node(int item){
			key = item;
			left = right = null;
		}
	}
	
	Node root;
	
	InPrePostTraversal(){
		root = null;
	}
	
	public static void main(String[] args) {
		
		InPrePostTraversal tree = new InPrePostTraversal();
		tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        
        System.out.println("Inorder Traversal: ");
        tree.printInorder();
        
        System.out.println("Preorder Traversal: ");
        tree.printPreorder();
        
        System.out.println("Postorder Traversal: ");
        tree.printPostorder();
	}

	private void printPostorder() {
		
		printPostorder(root);
	}

	

	private void printPreorder() {
		
		printPreorder(root);
		
	}
	
	private void printInorder() {
		
		printInorder(root);
		
	}
	
	private void printPostorder(Node node) {
		if(node == null)
			return;
		
		
		printPostorder(node.left);
		printPostorder(node.right);
		System.out.print(node.key + " ");
		
	}

	private void printPreorder(Node node) {
		
		if(node == null)
			return;
		
		System.out.print(node.key + " ");
		printPreorder(node.left);
		printPreorder(node.right);
		
	}

	

	private void printInorder(Node node) {
		
		if(node == null)
			return;
		
		printInorder(node.left);
		System.out.print(node.key + " ");
		printInorder(node.right);
	}

}
