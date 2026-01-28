package a3;

public class max_frequency_element {
	static int maxFrequencyElement(int[] a) {
	    int maxCount = 0, element = a[0];

	    for (int i = 0; i < a.length; i++) {
	        int count = 0;
	        for (int j = 0; j < a.length; j++) {
	            if (a[i] == a[j])
	                count++;
	        }
	        if (count > maxCount) {
	            maxCount = count;
	            element = a[i];
	        }
	    }
	    return element;
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,7,8,1,1,1,1,1,1,1};
		System.out.println(maxFrequencyElement(arr));

	}

}
