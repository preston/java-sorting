package com.prestonlee.student;

import com.prestonlee.SortingAlgorithm;

public class ChrisMcDonald extends SortingAlgorithm {
	
	public ChrisMcDonald (final int[] items) {
		super(items);
	}

	@Override
	public void sort () {
		int left = 0, right = data.length-1;
		quicksort (data, left, right);
	}
	
	private void quicksort (int array[], int left, int right) {
		int index = partition (data, left, right);
		if (left < index-1)		
			quicksort (data, left, index-1);
		if (index < right)
			quicksort (data, index, right);
	}
	
	private int partition (int array[], int left, int right) {
		int i = left, j = right;
		int temp;
	    int pivot = array[(left + right) / 2];
	    
		while (i <= j) {
			while (array[i] < pivot)
				i++;
			while (array[j] > pivot)
				j--;
			if (i <= j) {
				temp = array[i];
				array[i] = array[j];
				array[j] = temp;
				i++;
				j--;
			}
		}
		return i;
	}
}
