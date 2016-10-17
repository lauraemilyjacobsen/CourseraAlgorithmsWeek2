// Iterate through the array of n values n times
// For iteration i, find the smallest value a[min] of the remaining entries and swap it with a[i]
// Always quadratic time because we always have to traverse the entire remaining entries on every pass.
public class SelectionSort {

	public void sort(Comparable[] a) {
		
		for(int i = 0; i < a.length; i++) {
			// Find the min value to the right of i
			int min = i;
			for (int j = i; j < a.length; j++) {
				if (isLess(a[j], a[min])) {
					min = j;
				}
			}
			exch(a, i, min);
		}
		
	}

	public boolean isLess(Comparable v, Comparable w) {
	    return v.compareTo(w) < 0;
	}
	
	void exch(Comparable[] a, int i, int j) {
	    Comparable swap = a[i];
	    a[i] = a[j];
	    a[j] = swap;
	}
}
