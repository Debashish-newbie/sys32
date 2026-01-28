package a5;

public class increase_key_check_max_pq {
	static void increaseKey(int[] heap, int index, int newKey) {
	    if (newKey < heap[index])
	        return;

	    heap[index] = newKey;

	    while (index > 0 && heap[(index - 1) / 2] < heap[index]) {
	        int temp = heap[index];
	        heap[index] = heap[(index - 1) / 2];
	        heap[(index - 1) / 2] = temp;

	        index = (index - 1) / 2;
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
