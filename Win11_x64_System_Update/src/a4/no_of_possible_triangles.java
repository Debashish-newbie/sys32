package a4;

public class no_of_possible_triangles {
	static int countTriangles(int[] a) {
	    int n = a.length;
	    int count = 0;

	    // sort array
	    for (int i = 0; i < n - 1; i++) {
	        for (int j = i + 1; j < n; j++) {
	            if (a[i] > a[j]) {
	                int temp = a[i];
	                a[i] = a[j];
	                a[j] = temp;
	            }
	        }
	    }

	    for (int i = 0; i < n - 2; i++) {
	        for (int j = i + 1; j < n - 1; j++) {
	            for (int k = j + 1; k < n; k++) {
	                if (a[i] + a[j] > a[k])
	                    count++;
	            }
	        }
	    }
	    return count;
	}
                                                                                                 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
