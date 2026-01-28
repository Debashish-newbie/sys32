package a4;

public class pain_sum_remaning_element {
	static void findSpecialPair(int[] a) {
	    int totalSum = 0;
	    for (int x : a)
	        totalSum += x;

	    for (int i = 0; i < a.length; i++) {
	        for (int j = i + 1; j < a.length; j++) {
	            if (a[i] + a[j] == totalSum - (a[i] + a[j])) {
	                System.out.println(a[i] + " " + a[j]);
	                return;
	            }
	        }
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
