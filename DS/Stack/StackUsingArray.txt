package stack;

public class StackUsingArray {
	
	static final int MAX = 2;
	int top;
	static int arr[] = new int[MAX];
	
	StackUsingArray() {
		top = -1;
	}
	
	public static void main(String[] args) {
		
		StackUsingArray st = new StackUsingArray();
		
		boolean check = st.isStackEmpty();
		System.out.println("Stack empty?: "+ check);
		
		st.push(2);
		st.push(3);
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		int ele = st.pop();
		if(ele!= 0) {
		System.out.println("Popped: "+ele);
		}
		
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		int element = st.peek();
		System.out.println("Peeked element is: "+ element);
			
		boolean check1 = st.isStackFull();
		System.out.println("Stack full?: "+ check1);
	}
	
	private int peek()
    {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        else {
            int x = arr[top];
            return x;
        }
    }
	
	private boolean isStackFull() {
		if(top == MAX-1)
			return true;
		return false;
	}
	
	private boolean isStackEmpty() {
		if(top == -1)
			return true;
		return false;
	}

	private int pop() {
		
		if(top<0) {
			
			System.out.println("Stack underflow");
			return 0;
		}
		else {
		int x = arr[top];
		top--;
		return x;
		}
		
	}

	private void push(int i) {
		
		if(top >= (MAX-1)) {
			
			System.out.println("Stack overflow");
		}
		else {
			top++;
			arr[top] = i;
		}
		
	}

}
