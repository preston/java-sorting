package com.prestonlee;

/**
 * A simple bubblesort algorithm.
 * 
 * @author preston
 *
 */
public class PrestonLeeSort extends SortingAlgorithm {

	public PrestonLeeSort(final int[] items) {
		super(items);
	}

	@Override
	public void sort() {
		int out, in;
		// Iterate backwards over every items in this outer loop.
		for (out = data.length - 1; out > 1; out--) {
			// Now loop forwards over every item *before* the current one in the
			// outer loop.
			for (in = 0; in < out; in++) {
				// Are they out of order?
				if (data[in] > data[in + 1]) {
					swap(in, in + 1); // If so, swap!
				}
			}
		}
	}

	private void swap(int one, int two) {
		int temp = data[one];
		data[one] = data[two];
		data[two] = temp;
	}

}
