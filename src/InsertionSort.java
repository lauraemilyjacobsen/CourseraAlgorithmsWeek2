// On iteration i, swap a[i] with each larger entry to its left.
// Invariants:
// The items to the left of a[i] are in sorted order.
// Entries to the right of a[i] have not yet been seen.

// Best case, already sorted array, insertion sort does no exchanges, validates in n-1 compares
// Worst case, array in descending order, n squared/2 traverses + n exchanges

// Runs in linear time in partially sorted arrays with inverted pairs (not uncommon in practice)
public class InsertionSort {
	
	public static void main(String[] args) {
		
	}
	
	public static void swap(Comparable[] a) {
		int n = a.length;
		for(int i = 0; i < n; i++) {
			for(int j = i; j > 0; j--) {
				if (less(a[j], a[j-1])) {
					exch(a, j, j - 1);
				} else break; // stop moving left as soon as we encounter a lesser value
			}
		}
	}
	
	public static boolean less(Comparable v, Comparable w) {
	    return v.compareTo(w) < 0;
	}
	
	public static void exch(Comparable[] a, int i, int j) {
	    Comparable swap = a[i];
	    a[i] = a[j];
	    a[j] = swap;
	}

}
