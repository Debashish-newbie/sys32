package a5;

public class check_min_pq {
	static boolean isMinPriorityQueue(int[] a) {
	    int n = a.length;

	    for (int i = 0; i <= (n - 2) / 2; i++) {
	        int left = 2 * i + 1;
	        int right = 2 * i + 2;

	        if (left < n && a[i] > a[left])
	            return false;
	        if (right < n && a[i] > a[right])
	            return false;
	    }
	    return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
