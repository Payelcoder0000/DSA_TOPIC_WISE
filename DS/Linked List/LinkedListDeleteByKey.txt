package linkedList;

public class LinkedListDeleteByKey {
	
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
		LinkedListDeleteByKey list = new LinkedListDeleteByKey();
		list = insertNode(list, 1);
		list = insertNode(list, 2);
		list = insertNode(list, 3);
		list = insertNode(list, 5);
		printList(list);
		
		list = deleteByKey(list, 3);
		
		System.out.println();
		printList(list);
		
	}

	
	private static LinkedListDeleteByKey deleteByKey(LinkedListDeleteByKey list, int i) {
	
		Node curr_node = list.head;
		Node prev = null;
		
		if(curr_node != null && curr_node.data == i) {
			list.head = curr_node.next;
			return list;
		}
		while(curr_node != null && curr_node.data != i) {
			
			prev = curr_node;
			curr_node = curr_node.next;
		}
		if(curr_node != null && curr_node.data == i)
		{
			prev.next = curr_node.next;
			return list;
		}
		else {
			System.out.println("Not able to find");		}
	
		return list;
		
		
	}


	private static void printList(LinkedListDeleteByKey list) {
		
		Node curr_node = list.head;
		while(curr_node != null) {
			System.out.print(curr_node.data+ " ");
			curr_node = curr_node.next;
			
		}
		
	}

	private static LinkedListDeleteByKey insertNode(LinkedListDeleteByKey list, int data) {
		
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
