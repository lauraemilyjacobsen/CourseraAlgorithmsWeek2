// Move entries more than one position at a time by h-sorting the array
// An h-sorted array consists of h interleaved sorted sequences
// Do this by making several passes at insertion sort, but instead of moving 1 to the left, move h to the left
// where h decreases with each pass

// Accurate model of shellsort doesn't exist
// In practice, good performance except for very huge inputs.
public class ShellSort {

	public static void sort(Comparable[] a) {
		int n = a.length;
		int h = 1;

		// use the 3x +1 h-sequence
		while (h < n / 3) {
			h = 3 * h + 1;
		}

		while (h >= 1) {
			// h-sort the array
			for (int i = h; i < n; i++) {
				for (int j = i; j > h && less(a[j], a[j - h]); j -= h) {
					// if a[j] is less than a[j-h], swap them
					if (less(a[j], a[j - h])) {
						exch(a, j, j - h);
					}
				}
			}
			h = h / 3;
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
