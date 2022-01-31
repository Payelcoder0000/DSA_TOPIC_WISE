package stack;

import java.util.Stack;

public class PrefixEvaluation {
	
	public static void main(String[] args) {
		
		String exp ="+9*26";
		System.out.println(evaluatePrefix(exp));
	}

	private static int evaluatePrefix(String exprsn) {
		
		Stack<Integer> Stack = new Stack<Integer>();
		 
        for (int j = exprsn.length() - 1; j >= 0; j--) {
 
            // Push operand to Stack
            // To convert exprsn[j] to digit subtract
            // '0' from exprsn[j].
            if (isOperand(exprsn.charAt(j)))
                Stack.push((exprsn.charAt(j) - '0'));
 
            else {
 
                // Operator encountered
                // Pop two elements from Stack
                int o1 = Stack.peek();
                Stack.pop();
                int o2 = Stack.peek();
                Stack.pop();
 
                // Use switch case to operate on o1
                // and o2 and perform o1 O o2.
                switch (exprsn.charAt(j)) {
                case '+':
                    Stack.push(o1 + o2);
                    break;
                case '-':
                    Stack.push(o1 - o2);
                    break;
                case '*':
                    Stack.push(o1 * o2);
                    break;
                case '/':
                    Stack.push(o1 / o2);
                    break;
                }
            }
        }
 
        return Stack.peek();
	}
	
	static Boolean isOperand(char c)
    {
        // If the character is a digit
        // then it must be an operand
        if (c >= 48 && c <= 57)
            return true;
        else
            return false;
    }

}
