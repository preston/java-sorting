package com.prestonlee.student;

import com.prestonlee.SortingAlgorithm;

/**
 * A simple sort algorithm that is faster than yours.
 * 
 * @author Michael Berg
 *
 */
public class MichaelBergSort extends SortingAlgorithm {

	public MichaelBergSort(final int[] items) {
		super(items);
	}

	private int[] numbers;
	private int number;

	@Override
	public void sort() 
	{
		// Check for empty or null array
		if (data == null || data.length == 0)
		{	
			System.out.println("Empty dawg.");
			return;
		}
		this.numbers = data;
		number = data.length;
		quicksort(0, number - 1);
	}

	private void quicksort(int low, int high) 
	{
		int i, j;
		high = Math.abs(high);
		low = Math.abs(low);
		i = Math.abs(low);
		j = Math.abs(high);
		// Middle of the list for sorting purposes
		int pivot = numbers[low + (high-low)/2];

		// Divide into two lists
		while (i <= j) {
			// If the current value from the left list is smaller then the middle
			// element then get the next element from the left list.
			while (numbers[i] < pivot) {
				i++;
			}
			// If the current value from the right list is larger then the pivot
			// element then get the next element from the right list
			while (numbers[j] > pivot) {
				j--;
			}

			// If we have found a values in the left list which is larger then
			// the pivot element and if we have found a value in the right list
			// which is smaller then the pivot element then we exchange the
			// values.
			// As we are done we can increase i and j
			if (i <= j) {
				exchange(i, j);
				i++;
				j--;
				
			}
		}
		// Recursion
		if (low < j)
			quicksort(low, j);
		if (i < high)
			quicksort(i, high);
	}

	private void exchange(int i, int j) {
		int temp = numbers[i];
		numbers[i] = numbers[j];
		numbers[j] = temp;
	}


}
