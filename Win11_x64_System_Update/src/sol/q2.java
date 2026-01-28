package sol;
import java.util.*;

public class q2 {

	public static void main(String[] args) {
		
		int x[]= {1,5,4,3,7};
		int y[]= {2,9,6,7,8};
		int d = 4;
		for (int i =0; i<x.length; i++) {
			for(int j = 0; j<y.length; j++) {
				if(Math.abs(x[i]-y[j])==4) 
					System.out.println(x[i]+" "+y[j]);
				}
			}
		}
		
	}


