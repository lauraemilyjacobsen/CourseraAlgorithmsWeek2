
public class StackOfStringsImplArray {

	private String[] s;
	private int N = 0; // keep track of item count
	
	// constructor shouldn't require client to provide capacity!
	public StackOfStringsImplArray(int capacity){
		s = new String[capacity];
	}
	
	public void push(String item){
		s[N++] = item; // increment N
	}
	
	public String pop(){
		String item = s[--N]; // decrement N
		s[N] = null; // get rid of unused item
		return item;
	}
	
	public boolean isEmpty() {
		return N == 0;
	}
	
}
