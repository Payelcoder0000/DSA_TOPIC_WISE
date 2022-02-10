package linkedList;

public class DoublyLinkedListReverse {
	
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
	
	public static DoublyLinkedListReverse insertNode(DoublyLinkedListReverse list, int data) {
		
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
		
		DoublyLinkedListReverse list = new DoublyLinkedListReverse();
		list = insertNode(list, 1);
		list = insertNode(list, 2);
		list = insertNode(list, 5);
		list = insertNode(list, 6);
		list = insertNode(list, 3);
		list = insertNode(list, 10);
		printList(list);
		
		list = reverseList(list);
		
		System.out.println();
		printList(list);
		
	}

	private static DoublyLinkedListReverse reverseList(DoublyLinkedListReverse list) {
		
		Node current = list.head;
		Node temp = null;
		while(current != null) {
			
			temp = current.prev;
			current.prev = current.next;
			current.next = temp;
			current = current.prev;
		}
		
		if(temp != null) {
			list.head = temp.prev;
		}
		
		return list;
	}

	private static void printList(DoublyLinkedListReverse list) {
		
		Node curr_node = list.head;
		while(curr_node != null) {
			
			System.out.print(curr_node.data+" ");
			curr_node = curr_node.next;
		}	
	}

}
