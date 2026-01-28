package a4;

public class kth_smallest_element {
	static int kthSmallest(int[] a, int k) {
	    for (int i = 0; i < a.length - 1; i++) {
	        int min = i;
	        for (int j = i + 1; j < a.length; j++) {
	            if (a[j] < a[min])
	                min = j;
	        }
	        int temp = a[min];
	        a[min] = a[i];
	        a[i] = temp;
	    }
	    return a[k - 1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
