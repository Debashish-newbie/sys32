package a3;

public class merge_two_sorted_arrays {
	static int[] mergeSortedArrays(int[] A, int[] B) {
	    int[] C = new int[A.length + B.length];
	    int i = 0, j = 0, k = 0;

	    while (i < A.length && j < B.length) {
	        if (A[i] < B[j])
	            C[k++] = A[i++];
	        else
	            C[k++] = B[j++];
	    }

	    while (i < A.length) C[k++] = A[i++];
	    while (j < B.length) C[k++] = B[j++];

	    return C;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
