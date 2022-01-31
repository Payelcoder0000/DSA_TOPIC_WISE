package linkedList;

public class ReverseList {
	
	Node head;
	static class Node{
		
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	public static void main(String[] args) {
		ReverseList list = new ReverseList();
		list = insertNode(list, 1);
		list = insertNode(list, 2);
		list = insertNode(list, 3);
		list = insertNode(list, 5);
		printList(list);
		
		list = ReverseList(list);
		
		System.out.println();
		printList(list);
		
	}

	
	private static ReverseList ReverseList(ReverseList list) {
		
		Node curr =list.head, prev = null, next = null;
		
		while(curr!= null) {
			
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		list.head = prev;
		
		return list;
	}


	private static void printList(ReverseList list) {
		
		Node curr_node = list.head;
		while(curr_node != null) {
			System.out.print(curr_node.data+ " ");
			curr_node = curr_node.next;
			
		}
		
	}

	private static ReverseList insertNode(ReverseList list, int data) {
		
		Node new_node = new Node(data);
		new_node.next = null;
		
		if(list.head == null) list.head = new_node;
		else {
			Node start = list.head;
			while(start.next != null) {
				start = start.next;
			}
			start.next = new_node;
		}
		
		return list;
	}

}
