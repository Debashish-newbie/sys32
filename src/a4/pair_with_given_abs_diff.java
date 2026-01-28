package a4;

public class pair_with_given_abs_diff {
	static void findPairsWithDifference(int[] X, int[] Y, int value) {
	    for (int i = 0; i < X.length; i++) {
	        for (int j = 0; j < Y.length; j++) {
	            if (Math.abs(X[i] - Y[j]) == value) {
	                System.out.print("(" + X[i] + "," + Y[j] + ") ");
	            }
	        }
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
