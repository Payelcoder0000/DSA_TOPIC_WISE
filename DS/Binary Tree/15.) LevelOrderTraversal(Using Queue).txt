package tree;

import java.util.LinkedList;
import java.util.Queue;

public class BFSUsingQueue {
	
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
	
	public BFSUsingQueue() {
		root = null;
	}
	
	public static void main(String[] args) {
		
		BFSUsingQueue tree = new BFSUsingQueue();
		tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
 
       System.out.println("Level order traversal of binary tree is ");
       tree.printLevelOrder();
	}

	private void printLevelOrder() {
		
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		while(!queue.isEmpty()) {
			
			Node tempNode = queue.poll();
			System.out.println(tempNode.key);
			
			if(tempNode.left != null) queue.add(tempNode.left);
			
			if(tempNode.right != null) queue.add(tempNode.right);
		}
	}

}
