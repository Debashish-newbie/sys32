package a6;

public class sll {
	static class Node {
	    int data;
	    Node next;

	    Node(int data) {
	        this.data = data;
	        this.next = null;
	    }
	}
	static Node insertSLL(Node head, int data) {
	    Node newNode = new Node(data);
	    newNode.next = head;
	    return newNode;
	}

	static Node deleteSLL(Node head, int key) {
	    if (head == null)
	        return null;

	    if (head.data == key)
	        return head.next;

	    Node curr = head;
	    while (curr.next != null && curr.next.data != key)
	        curr = curr.next;

	    if (curr.next != null)
	        curr.next = curr.next.next;

	    return head;
	}

	static boolean searchSLL(Node head, int key) {
	    while (head != null) {
	        if (head.data == key)
	            return true;
	        head = head.next;
	    }
	    return false;
	}
	static Node sortedInsert(Node head, int data) {
	    Node newNode = new Node(data);

	    if (head == null || head.data >= data) {
	        newNode.next = head;
	        return newNode;
	    }

	    Node curr = head;
	    while (curr.next != null && curr.next.data < data)
	        curr = curr.next;

	    newNode.next = curr.next;
	    curr.next = newNode;

	    return head;
	}
	static void addEdge(Node[] adjList, int u, int v) {
	    Node node1 = new Node(v);
	    node1.next = adjList[u];
	    adjList[u] = node1;

	    Node node2 = new Node(u);
	    node2.next = adjList[v];
	    adjList[v] = node2;
	}
	static void printReverse(Node head) {
	    if (head == null)
	        return;

	    printReverse(head.next);
	    System.out.print(head.data + " ");
	}

	static Node[] matrixToList(int[][] matrix) {
	    int n = matrix.length;
	    Node[] adjList = new Node[n];

	    for (int i = 0; i < n; i++) {
	        for (int j = n - 1; j >= 0; j--) {
	            if (matrix[i][j] == 1) {
	                Node newNode = new Node(j);
	                newNode.next = adjList[i];
	                adjList[i] = newNode;
	            }
	        }
	    }
	    return adjList;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
