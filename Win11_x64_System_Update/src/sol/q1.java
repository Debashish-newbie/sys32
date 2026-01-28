package sol;
import java.lang.reflect.Array;
import java.util.*;

public class q1 {

	public static void main(String[] args) {
		int a[]= {5,7,11,19,23};
		int b[]= {6,13,20};
		
		int la = a.length;
		int lb = b.length;
		int c[] = new int[la+lb];
		for(int i =0; i<a.length; i++) {
			c[i]=a[i];
		}
		int j =0;
		for(int i =a.length; i<c.length; i++) {
			
			c[i]=b[j];
			j++;
		}
		
		 Arrays.sort(c);
		 for (int i = 0; i<c.length; i++) {
				System.out.print(c[i]+" ");
			}
		 
		 
//		 int i = 0, j = 0, k = 0;
//		 int[] c = new int[la + lb];
//
//		 while (i < la && j < lb) {
//		     if (a[i] <= b[j]) {
//		         c[k++] = a[i++];
//		     } else {
//		         c[k++] = b[j++];
//		     }
//		 }
//
//		 while (i < la) c[k++] = a[i++];
//		 while (j < lb) c[k++] = b[j++];

	
	}

}
