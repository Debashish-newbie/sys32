package a3;

public class check_reverse {
	static boolean checkReverse(int[] a) {
	    int n = a.length;
	    int i = 0;

	    while (i < n - 1 && a[i] <= a[i + 1])
	        i++;

	    int j = i + 1;
	    while (j < n - 1 && a[j] >= a[j + 1])
	        j++;

	    for (int k = j + 1; k < n; k++) {
	        if (a[k] < a[k - 1])
	            return false;
	    }
	    return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
