package com.prestonlee.student;

import com.prestonlee.SortingAlgorithm;

public class StevenHondaSort extends SortingAlgorithm{
	
	public StevenHondaSort(final int[] items) {
		super(items);
	}

	@Override
	public void sort(){
		quickSort(0, data.length - 1);
	}
	
	public void quickSort(int bottom, int top) {
		int i = bottom, j = top;
		int pivot = data[(bottom + top) >> 1];

		while (i <= j) {
			while (data[i] < pivot) {
				i++;
			}
			while (data[j] > pivot) {
				j--;
			}
			if (i <= j) {
				int temp = data[i];
				data[i] = data[j];
				data[j] = temp;
				i++;
				j--;
			}
		}
		if (bottom < j){
			quickSort(bottom, j);
		}
		if (i < top){
			quickSort(i, top);
		}
	}

}
