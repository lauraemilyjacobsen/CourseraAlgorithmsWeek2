public class QueueLinkedList {
	
	private class Node {
		String item;
		Node next;
	}
	
	private Node first;
	private Node last;
	
	public void enqueue(String item){
		Node oldLast = last;
		
		// Create a new node for the end
		last = new Node();
		last.item = item;
		if (isEmpty()){
			first = last;
		} else {
			oldLast.next = last;
		}
	}
	
	public String dequeue(){
		String item = first.item;
		first = first.next;
		if (isEmpty()){
			last =  null;
		}
		return item;
	}	
	
	public boolean isEmpty() {
		return first == null;
	}
}
