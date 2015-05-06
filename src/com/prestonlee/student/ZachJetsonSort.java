package com.prestonlee.student;

import com.prestonlee.SortingAlgorithm;


/********************************
 * A simple quicksort algorithm.
 * 
 * @author Zach Jetson
 * @version 1.0
 * @see Tron 1
 ********************************/
public class ZachJetsonSort extends SortingAlgorithm {

	public ZachJetsonSort(final int[] items) {
		super(items);
	}

	@Override
	public void sort(){
		quickSort(data, 0, data.length - 1);
	}
	public void quickSort(int array[], int start, int end)
	{
		int i = start;
		int k = end; 

		if (end - start >= 1){
			int pivot = array[start];

			while (k > i){
				while (array[i] <= pivot && i <= end && k > i)
					i++;
				while (array[k] > pivot && k >= start && k >= i)
					k--;
				if (k > i)
					swap(array, i, k);
			}
			swap(array, start, k); //swap method
			quickSort(array, start, k - 1); //recursion call to break down the data into smaller arrays
			quickSort(array, k + 1, end); //recursion call to break down the data into smaller arrays
		} else {
			return;// the array is sorted, so exit
		}
	}

	public void swap(int array[], int index1, int index2) 
	{
		int temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}
}
