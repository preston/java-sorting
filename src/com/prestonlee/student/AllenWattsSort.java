package com.prestonlee.student;

import com.prestonlee.SortingAlgorithm;

/**
 * Class built to sort as quickly as possible
 * @author Watts
 *
 */
public class AllenWattsSort extends SortingAlgorithm {
	
	private int[] numSort;
	
	public AllenWattsSort(final int[] items) {
		super(items);
	}
	
	@Override
	public void sort(){
		
		int num;
		
		if (data == null || data.length == 0){
			return;
		}
		this.numSort = data;
		num = data.length;
		SortMe(0, num-1);		
	}
	
	private void SortMe(int low, int high){
		
		int i = low;
		int j = high;
		int pivot = numSort[low + (high-low)/2];
		
		while (i <= j){
			while (numSort[i] < pivot){
				i++;
			}
			while (numSort[j] > pivot) {
				j--;
			}
			if (i <= j){
				SwapMe(i, j);
				i++;
				j--;
			}	
		}
		if (low < j)
			SortMe(low, j);
		if (i < high)
			SortMe(i, high);
	}

	private void SwapMe(int i, int j){
		
		int temp = numSort[i];
		numSort[i] = numSort[j];
		numSort[j] = temp;
	}	
}
