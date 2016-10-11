import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

// Implementation of a Stack using an underlying linked list.
// Every operation takes constant time in the worst case. No loops!
public class StackOfStringsImplLinkedList {
	
	private class Node {
		String item;
		Node next;
	}
	
	// pointer to the first node in the linked list
	private Node first;

	// Add a new node to the head of the linked list
	public void push(String s) {
		Node oldFirst = first;
		first = new Node();
		first.item = s;
		first.next = oldFirst;
	}
	
	// Remove the first node and reset the head pointer to the next node.
	public String pop() {
		String s = first.item;
		first = first.next;
		return s;
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public static void Main(String[] args){
		
		// Reverse a set of strings from input
		
		StackOfStringsImplLinkedList stack = new StackOfStringsImplLinkedList();
		
		while(!StdIn.isEmpty()){
			String s = StdIn.readString();
			if (s == "-"){
				StdOut.println(stack.pop());
			} else {
				stack.push(s);
			}
		}
	}
}
