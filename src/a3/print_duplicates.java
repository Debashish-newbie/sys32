package a3;

public class print_duplicates {
	static void printDuplicates(int[] a) {
	    for (int i = 0; i < a.length; i++) {
	        for (int j = i + 1; j < a.length; j++) {
	            if (a[i] == a[j]) {
	                System.out.print(a[i] + " ");
	                break;
	            }
	        }
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
