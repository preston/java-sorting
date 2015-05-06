package com.prestonlee.student;

import com.prestonlee.SortingAlgorithm;

/**
 * A simple bubblesort algorithm.
 * 
 * @author preston
 *
 */
public class TravisGeerySort extends SortingAlgorithm {

	static int[] result;
	
	public TravisGeerySort(final int[] items) {
		super(items);
	}

	@Override
	public void sort()
	{
		int[] nums = data;
		quickSort(nums, 0, data.length-1);
	}
	
	public void quickSort(int[] array, int start, int end)
	{
		int i = start;
        int k = end;
        if (end - start >= 1)
        {
                int pivot = array[start];	

                while (k > i)	
                {
                	while (array[i] <= pivot && i <= end && k > i)
                		i++;
                	while (array[k] > pivot && k >= start && k >= i)
                		k--;
                	if (k > i)
                		swap(i, k);
                }
                swap(start, k);
                quickSort(array, start, k - 1);
                quickSort(array, k + 1, end);
        }
        else
        {
        	result = array;
        }
	}

	private void swap(int one, int two) {
		int temp = data[one];
		data[one] = data[two];
		data[two] = temp;
	}

}