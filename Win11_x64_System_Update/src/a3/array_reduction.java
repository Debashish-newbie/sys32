package a3;
import java.util.Arrays;
public class array_reduction {
	static void arrayReduction(int[] a) {
	    Arrays.sort(a);
	    int n = a.length;
	    int i = 0;

	    while (i < n) {
	        System.out.println(n - i);
	        int min = a[i];
	        while (i < n && a[i] == min)
	            i++;
	    }
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
