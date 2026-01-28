package a3;

public class find_missing_number {
	static int findMissing(int[] a) {
	    int n = a.length + 1;
	    int total = n * (n + 1) / 2;

	    int sum = 0;
	    for (int x : a)
	        sum += x;

	    return total - sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
