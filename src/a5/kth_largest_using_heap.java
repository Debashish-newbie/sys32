package a5;
import java.util.*;
public class kth_largest_using_heap {
	static void heapify(int[] a, int n, int i) {
	    int largest = i;
	    int left = 2 * i + 1;
	    int right = 2 * i + 2;

	    if (left < n && a[left] > a[largest])
	        largest = left;

	    if (right < n && a[right] > a[largest])
	        largest = right;

	    if (largest != i) {
	        int temp = a[i];
	        a[i] = a[largest];
	        a[largest] = temp;

	        heapify(a, n, largest);
	    }
	}

	static int kthLargest(int[] a, int k) {
	    int n = a.length;

	    // Build Max Heap
	    for (int i = n / 2 - 1; i >= 0; i--)
	        heapify(a, n, i);

	    // Delete max k-1 times
	    for (int i = 0; i < k - 1; i++) {
	        int temp = a[0];
	        a[0] = a[n - 1 - i];
	        a[n - 1 - i] = temp;

	        heapify(a, n - 1 - i, 0);
	    }
	    return a[0];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
