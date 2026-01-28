package a3;

public class first_repeated_element {
	static int firstRepeated(int[] a) {
	    for (int i = 0; i < a.length; i++) {
	        for (int j = i + 1; j < a.length; j++) {
	            if (a[i] == a[j])
	                return a[i];
	        }
	    }
	    return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
