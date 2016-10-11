
public class StackOfStringsResizingArray {

	private String[] s;
	private int N = 0; // keep track of item count
	
	public StackOfStringsResizingArray(){
		s = new String[1];
	}
	
	// Double the size of the array when array is full.
	public void push(String item){
		// Get a bigger array!
		if (N == s.length) {
			resize(2 * s.length);
		}
		s[N++] = item; // increment N
	}
	
	// Halve the size of the array when array is 1/4 full.
	public String pop(){
		String item = s[--N]; // decrement N
		s[N] = null; // get rid of unused item
		if (N > 0 && N == s.length / 4){
			resize(s.length / 2);
		}
		return item;
	}
	
	public boolean isEmpty() {
		return N == 0;
	}
	
	// Create a new array and copy over the items from the old array.
	private void resize(int capacity) {
		String[] copy = new String[capacity];
		for (int i = 0; i < N; i++){
			copy[i] = s[i];
		}
		s = copy;
	}
	
}
