package com.prestonlee.student;

import com.prestonlee.SortingAlgorithm;

public class BrianLauSort extends SortingAlgorithm {

	public BrianLauSort(int[] data) {
		super(data);
	}

	public void quicksort(int random[], int start, int end) {
		int pivot, left_hold, right_hold;
		left_hold = start; // Beginning index of the array
		right_hold = end; // Last index of the array
		pivot = random[start]; // Number that the array will compare to
		while (start < end) {
			while ((random[end] >= pivot) && (start < end)) {
				// If the value at the end of the array is greater or equal to
				// pivot and start is less than end, no swapping happens and end
				// decrements.
				end--;
			}
			if (start != end) // Beginning index is changed to the value of the
			// last index, start is incremented
			{
				random[start] = random[end];
				start++;
			}
			while ((random[start] <= pivot) && (start < end))
				// If value at the beginning is larger than the pivot, and start
				// is not larger than end, start increments.
				start++;
			if (start != end) {
				// If start and end are not equal, the values at the end is
				// changed to the value at the start, end decrements.
				random[end] = random[start];
				end--;
			}
		}
		//Magic happens
		random[start] = pivot;
		pivot = start;
		start = left_hold;
		end = right_hold;
		if (start < pivot)
			quicksort(random, start, pivot - 1);
		if (end > pivot)
			quicksort(random, pivot + 1, end);
	}

	@Override
	public void sort() {
		quicksort(data, 0, data.length - 1);
	}
}