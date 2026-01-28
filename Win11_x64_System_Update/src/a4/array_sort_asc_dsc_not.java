package a4;

public class array_sort_asc_dsc_not {
	static String checkSorted(int[] a) {
	    boolean asc = true, desc = true;

	    for (int i = 0; i < a.length - 1; i++) {
	        if (a[i] > a[i + 1])
	            asc = false;
	        if (a[i] < a[i + 1])
	            desc = false;
	    }

	    if (asc)
	        return "Yes Ascending";
	    else if (desc)
	        return "Yes Descending";
	    else
	        return "No";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
