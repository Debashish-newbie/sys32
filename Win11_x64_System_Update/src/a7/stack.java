package a7;
	
public class stack {
	public class Experiment07_Stack {

	    /* ================================
	       1. STACK USING FIXED ARRAY
	       ================================ */
	    static class ArrayStack {
	        int[] stack;
	        int top;
	        int size;

	        ArrayStack(int size) {
	            this.size = size;
	            stack = new int[size];
	            top = -1;
	        }

	        void push(int x) {
	            if (top == size - 1)
	                return;
	            stack[++top] = x;
	        }

	        int pop() {
	            if (top == -1)
	                return -1;
	            return stack[top--];
	        }

	        boolean isEmpty() {
	            return top == -1;
	        }
	    }

	    /* ================================
	       2. STACK USING LINKED LIST
	       ================================ */
	    static class StackNode {
	        int data;
	        StackNode next;

	        StackNode(int data) {
	            this.data = data;
	            this.next = null;
	        }
	    }

	    static StackNode push(StackNode top, int data) {
	        StackNode newNode = new StackNode(data);
	        newNode.next = top;
	        return newNode;
	    }

	    static StackNode pop(StackNode top) {
	        if (top == null)
	            return null;
	        return top.next;
	    }

	    /* =========================================
	       3. INSERT ELEMENT IN SORTED STACK
	          (HIGHEST AT TOP)
	       ========================================= */
	    static void sortedInsert(ArrayStack s, int x) {
	        if (s.isEmpty() || x > s.stack[s.top]) {
	            s.push(x);
	            return;
	        }

	        int temp = s.pop();
	        sortedInsert(s, x);
	        s.push(temp);
	    }

	    /* ================================
	       4. SORT STACK (LARGEST AT TOP)
	       ================================ */
	    static void sortStack(ArrayStack s) {
	        if (!s.isEmpty()) {
	            int temp = s.pop();
	            sortStack(s);
	            sortedInsert(s, temp);
	        }
	    }

	    /* ================================
	       5. INSERT AT BOTTOM OF STACK
	       ================================ */
	    static void insertAtBottom(ArrayStack s, int x) {
	        if (s.isEmpty()) {
	            s.push(x);
	            return;
	        }

	        int temp = s.pop();
	        insertAtBottom(s, x);
	        s.push(temp);
	    }

	    /* ================================
	       6. REVERSE A STACK
	       ================================ */
	    static void reverseStack(ArrayStack s) {
	        if (!s.isEmpty()) {
	            int temp = s.pop();
	            reverseStack(s);
	            insertAtBottom(s, temp);
	        }
	    }
	}


}
