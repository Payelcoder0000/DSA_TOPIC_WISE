package queue;

public class Queue {
	
	int front, rear, size;
	int capacity;
	int arr[];
	
	Queue(int capacity){
		this.capacity = capacity;
		front = this.size = 0;
		rear = capacity -1;
		arr = new int[this.capacity];
	}
	
	private boolean isFull(Queue queue) {
		
		return queue.size == queue.capacity;
	}
	
	private void enqueue(int item) {
		
		if(isFull(this))	return;
		this.rear = (this.rear +1)%capacity;
		this.arr[this.rear] = item;
		this.size = this.size +1;
		System.out.println(item + " Enqued to the queue");
	}
	
	private boolean isEmpty(Queue queue) {
		
		return queue.size == 0;
	}
	
	private int dequeue() {
		
		if(isEmpty(this)) return Integer.MIN_VALUE;
		
		int item = arr[this.front];
		this.front = (this.front+1)%capacity;
		this.size = this.size -1; 
		return item;
	}

	private int rear() {
	
		if(isEmpty(this)) return Integer.MIN_VALUE;
		return this.arr[this.rear];
	}

	private int front() {
	
		if(isEmpty(this)) return Integer.MIN_VALUE;
		return this.arr[this.front];
	}

	public static void main(String[] args) {
		Queue queue = new Queue(1000);
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		
		System.out.println(queue.dequeue()+ " is dequed from the queue");
		
		queue.enqueue(40);
		
		System.out.println("Front item is:" + queue.front());
		
		System.out.println("Rear item is:" + queue.rear());
	}	
}
