package linkedList;

public class LinkedListInsert {
	
	Node head;
	
	static class Node{
		
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	public static LinkedListInsert insertNode(LinkedListInsert list, int data) {
		
		Node new_node = new Node(data);
		new_node.next = null;
		
		if(list.head == null) 
			list.head = new_node;
		else {
			
			Node start = list.head;
			while(start.next != null) {
				start = start.next;
			}
			start.next = new_node;
		}
		return list;
	}
	
	public static void main(String[] args) {
		
		LinkedListInsert list = new LinkedListInsert();
		list = insertNode(list, 1);
		list = insertNode(list, 2);
		printList(list);
		
	}

	private static void printList(LinkedListInsert list) {
		
		Node curr_node = list.head;
		while(curr_node != null) {
			
			System.out.println("data = "+ curr_node.data);
			curr_node = curr_node.next;
		}	
	}

}
