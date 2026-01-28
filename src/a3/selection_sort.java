package a3;

public class selection_sort {
	static void selectionSort(int[] a) {
	    int n = a.length;
	    for (int i = 0; i < n - 1; i++) {
	        int min = i;
	        for (int j = i + 1; j < n; j++) {
	            if (a[j] < a[min])
	                min = j;
	        }
	        int temp = a[min];
	        a[min] = a[i];
	        a[i] = temp;
	    }
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
