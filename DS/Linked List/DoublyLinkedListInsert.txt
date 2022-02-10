package linkedList;

public class DoublyLinkedListInsert {
	
	Node head;
	
	static class Node{
		
		int data;
		Node next;
		Node prev;
		Node(int d){
			data = d;
			next = null;
			prev = null;
		}
	}
	
	public static DoublyLinkedListInsert insertNode(DoublyLinkedListInsert list, int data) {
		
		Node new_node = new Node(data);
		new_node.next = null;
		new_node.prev = null;
		
		if(list.head == null) 
			list.head = new_node;
		else {
			
			Node start = list.head;
			while(start.next != null) {
				start = start.next;
			}
			start.next = new_node;
			new_node.prev = start;
		}
		return list;
	}
	
	public static void main(String[] args) {
		
		DoublyLinkedListInsert list = new DoublyLinkedListInsert();
		list = insertNode(list, 1);
		list = insertNode(list, 2);
		printList(list);
		
	}

	private static void printList(DoublyLinkedListInsert list) {
		
		Node curr_node = list.head;
		while(curr_node != null) {
			
			System.out.println("data = "+ curr_node.data);
			curr_node = curr_node.next;
		}	
	}

}
