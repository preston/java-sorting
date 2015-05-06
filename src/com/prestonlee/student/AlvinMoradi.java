package com.prestonlee.student;

import com.prestonlee.SortingAlgorithm;

/**
 * A recursive quicksort algorithm.
 * 
 * @author Alvin G. Moradi
 *
 */
public class AlvinMoradi extends SortingAlgorithm {

	public AlvinMoradi(final int[] items) {
		super(items);
	}
	
	public void sort() {
		data = myQsort(data, 0, data.length-1);
	}

	private int[] myQsort(int[] array, int lo, int hi) {
	   if (hi > lo)
	   {
	      int partitionPivotIndex = lo;
	 
	      int newPivotIndex = partition(array, lo, hi, partitionPivotIndex);
	 
	      myQsort(array, lo, newPivotIndex-1);
	      myQsort(array, newPivotIndex+1, hi);
	   }
	   return array;
	}
	
	private int partition(int[] array, int lo, int hi, int pivotIndex) {
		int pivotValue = array[ pivotIndex ];
	 
	      swap(array, pivotIndex, hi); //send to the back
	 
	      int index = lo;
	 
	      for (int i = lo; i < hi; i++)
	      {
	         if ( array[i] < pivotValue )
	         {
	            swap(array, i, index);
	            index++;
	         }
	     }
	 
	      swap(array, hi, index);
	 
	      return index;
	   }

	private void swap(int[] array, int one, int two) {
		int temp = array[one];
		array[one] = array[two];
		array[two] = temp;
	}

}
