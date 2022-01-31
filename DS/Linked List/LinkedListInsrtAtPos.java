package linkedList;

public class LinkedListInsrtAtPos {
	
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
		LinkedListInsrtAtPos list = new LinkedListInsrtAtPos();
		list = insertNode(list, 1);
		list = insertNode(list, 2);
		list = insertNode(list, 3);
		list = insertNode(list, 5);
		printList(list);
		
		list = insertNodeAtPos(list, 10, 1);
		
		System.out.println();
		printList(list);
		
	}

	
	private static LinkedListInsrtAtPos insertNodeAtPos(LinkedListInsrtAtPos list, int key, int pos) {
		
		Node new_node = new Node(key);
		new_node.next = null;
		
		int sizeOfList = checkListSize(list);
		
		if(pos> sizeOfList) return list;
		if(pos == 1) {
			new_node.next = list.head;
			list.head = new_node;
			return list;
		}
		
		Node curr_node = list.head;
		int count = 1;
		while(curr_node!= null && count != pos-1)
		{
			count++;
			curr_node= curr_node.next;
			
		}
		
		if(curr_node != null)
		{
			new_node.next = curr_node.next;
			curr_node.next = new_node;
		}
		else
			System.out.println("Position not found");
		
		
		return list;
	}


	private static int checkListSize(LinkedListInsrtAtPos list) {
		
		int counter = 0;
		Node curr_node = list.head;
		while(curr_node != null) {
			counter++;
			curr_node = curr_node.next;
			
		}
		return counter;
	}


	private static void printList(LinkedListInsrtAtPos list) {
		
		Node curr_node = list.head;
		while(curr_node != null) {
			System.out.print(curr_node.data+ " ");
			curr_node = curr_node.next;
			
		}
		
	}

	private static LinkedListInsrtAtPos insertNode(LinkedListInsrtAtPos list, int data) {
		
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
