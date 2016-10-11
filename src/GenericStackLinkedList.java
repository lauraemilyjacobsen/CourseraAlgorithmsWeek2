import java.util.Iterator;

public class GenericStackLinkedList<Item> implements Iterable<Item> {
	private class Node {
		Item item;
		Node next;
	}
	
	// pointer to the first node in the linked list
	private Node first;

	// Add a new node to the head of the linked list
	public void push(Item item) {
		Node oldFirst = first;
		first = new Node();
		first.item = item;
		first.next = oldFirst;
	}
	
	// Remove the first node and reset the head pointer to the next node.
	public Item pop() {
		Item item = first.item;
		first = first.next;
		return item;
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	
	// Iterable implementation
	
	// GetIterator allows client to use for : loop
	public Iterator<Item> iterator(){
		return new StackIterator();
	}
	
	private class StackIterator implements Iterator<Item>{
		private Node current = first;
		
		@Override
		public boolean hasNext() {
			return current != null;
		}

		@Override
		public Item next() {
			Item item = current.item;
			current = current.next;
			return item;
		}
		
	}
}
