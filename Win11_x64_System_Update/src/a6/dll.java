package a6;

public class dll {
	static class DNode {
	    int data;
	    DNode prev, next;

	    DNode(int data) {
	        this.data = data;
	        this.prev = this.next = null;
	    }
	}
	static DNode insertDLL(DNode head, int data) {
	    DNode newNode = new DNode(data);
	    newNode.next = head;
	    if (head != null)
	        head.prev = newNode;
	    return newNode;
	}

	static DNode deleteDLL(DNode head, int key) {
	    DNode curr = head;

	    while (curr != null && curr.data != key)
	        curr = curr.next;

	    if (curr == null)
	        return head;

	    if (curr.prev != null)
	        curr.prev.next = curr.next;
	    else
	        head = curr.next;

	    if (curr.next != null)
	        curr.next.prev = curr.prev;

	    return head;
	}

	static boolean searchDLL(DNode head, int key) {
	    while (head != null) {
	        if (head.data == key)
	            return true;
	        head = head.next;
	    }
	    return false;
	}
	static DNode reverseDLL(DNode head) {
	    DNode temp = null;
	    DNode curr = head;

	    while (curr != null) {
	        temp = curr.prev;
	        curr.prev = curr.next;
	        curr.next = temp;
	        curr = curr.prev;
	    }

	    if (temp != null)
	        head = temp.prev;

	    return head;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
