package a3;

public class sum_of_distinct_element {
	static int sumOfDistinct(int[] a) {
	    int sum = 0;

	    for (int i = 0; i < a.length; i++) {
	        boolean duplicate = false;
	        for (int j = 0; j < i; j++) {
	            if (a[i] == a[j]) {
	                duplicate = true;
	                break;
	            }
	        }
	        if (!duplicate)
	            sum += a[i];
	    }
	    return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
