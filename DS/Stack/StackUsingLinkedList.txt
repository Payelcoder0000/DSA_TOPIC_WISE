package stack;

public class StackUsingLinkedList {
	
	private class Node{
		
		int data;
		Node next;
		
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	Node top;
	
	StackUsingLinkedList(){
		this.top = null;
	}
	
	private void push(int i) {
		
		Node temp = new Node(i);
		temp.next = null;
		
		if(temp == null) {
			System.out.println("Heap overflow!");
			return;
		}
		
		temp.next = top;
		top = temp;	
	}
	
	private void pop() {
		
		if(top == null) {
			System.out.println("Stack underflow");
			return;
		}
		
		top = top.next;
		
	}

	
	public void display()
    {
        // check for stack underflow
        if (top == null) {
            System.out.printf("\nStack Underflow");
            return;
        }
        else {
            Node temp = top;
            while (temp != null) {
 
                System.out.printf("%d ", temp.data);
 
                temp = temp.next;
            }
        }
    }
	
	public static void main(String[] args) {
		
		StackUsingLinkedList st = new StackUsingLinkedList();
		st.pop();
		
		st.push(10);
		st.push(20);
		st.push(30);
		
		st.display();
		
		st.pop();
		System.out.println();
		st.display();
	}

}
