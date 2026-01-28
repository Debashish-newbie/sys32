package a8;

public class queue {
	public class Experiment08_Queue {

	    /* ================================
	       1. QUEUE USING FIXED LENGTH ARRAY
	       ================================ */
	    static class ArrayQueue {
	        int[] q;
	        int front, rear, size;

	        ArrayQueue(int size) {
	            this.size = size;
	            q = new int[size];
	            front = rear = -1;
	        }

	        void enqueue(int x) {
	            if (rear == size - 1)
	                return;
	            if (front == -1)
	                front = 0;
	            q[++rear] = x;
	        }

	        int dequeue() {
	            if (front == -1 || front > rear)
	                return -1;
	            return q[front++];
	        }

	        boolean isEmpty() {
	            return front == -1 || front > rear;
	        }
	    }

	    /* ================================
	       2. QUEUE USING LINKED LIST
	       ================================ */
	    static class QNode {
	        int data;
	        QNode next;

	        QNode(int data) {
	            this.data = data;
	            this.next = null;
	        }
	    }

	    static class LinkedQueue {
	        QNode front, rear;

	        void enqueue(int x) {
	            QNode newNode = new QNode(x);
	            if (rear == null) {
	                front = rear = newNode;
	                return;
	            }
	            rear.next = newNode;
	            rear = newNode;
	        }

	        int dequeue() {
	            if (front == null)
	                return -1;
	            int val = front.data;
	            front = front.next;
	            if (front == null)
	                rear = null;
	            return val;
	        }

	        boolean isEmpty() {
	            return front == null;
	        }
	    }

	    /* ================================
	       SUPPORT STACK (ARRAY BASED)
	       ================================ */
	    static class Stack {
	        int[] s;
	        int top;

	        Stack(int size) {
	            s = new int[size];
	            top = -1;
	        }

	        void push(int x) {
	            s[++top] = x;
	        }

	        int pop() {
	            return s[top--];
	        }

	        boolean isEmpty() {
	            return top == -1;
	        }
	    }

	    /* =========================================
	       3. REVERSE A STACK USING A QUEUE
	       ========================================= */
	    static void reverseStackUsingQueue(Stack st) {
	        ArrayQueue q = new ArrayQueue(st.s.length);

	        while (!st.isEmpty())
	            q.enqueue(st.pop());

	        while (!q.isEmpty())
	            st.push(q.dequeue());
	    }

	    /* =========================================
	       4. SLIDING WINDOW MAXIMUM (NO DEQUE)
	       ========================================= */
	    static void slidingWindowMax(int[] a, int k) {
	        int n = a.length;

	        for (int i = 0; i <= n - k; i++) {
	            int max = a[i];
	            for (int j = i; j < i + k; j++) {
	                if (a[j] > max)
	                    max = a[j];
	            }
	            System.out.print(max + " ");
	        }
	    }

	    /* =========================================
	       5. JOSEPHUS PROBLEM USING QUEUE
	       ========================================= */
	    static int josephus(int n, int k) {
	        ArrayQueue q = new ArrayQueue(n);

	        for (int i = 1; i <= n; i++)
	            q.enqueue(i);

	        while (q.rear - q.front + 1 > 1) {
	            for (int i = 1; i < k; i++)
	                q.enqueue(q.dequeue());

	            q.dequeue(); // eliminate kth person
	        }
	        return q.dequeue();
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
