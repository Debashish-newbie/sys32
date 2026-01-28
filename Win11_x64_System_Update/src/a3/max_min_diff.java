package a3;
	
public class max_min_diff {
	static void minMaxDifference(int[] a) {
	    Arrays.sort(a);
	    int minDiff = Integer.MAX_VALUE;
	    int maxDiff = a[a.length - 1] - a[0];

	    for (int i = 1; i < a.length; i++) {
	        minDiff = Math.min(minDiff, a[i] - a[i - 1]);
	    }

	    System.out.println(minDiff + " " + maxDiff);
	}

}
