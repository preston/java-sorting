package com.prestonlee.student;

import com.prestonlee.SortingAlgorithm;

public class WesleyBlaes extends SortingAlgorithm {

	public WesleyBlaes(final int[] items) {
		super(items);
	}

	@Override
	public void sort() {
		int out = data.length, in = 0;
		int temp[] = data;
	      int tmp;
	      int pivot = temp[(data.length + 0) / 2];
	     
	      while (out <= in) {
	            while (temp[out] < pivot)
	                  out++;
	            while (temp[in] > pivot)
	                  in--;
	            if (out <= in) {
	                  tmp = temp[out];
	                  temp[out] = temp[in];
	                  temp[in] = tmp;
	                  out++;
	                  in--;
	            }
	      }
	}
	void quickSort(int temp[], int left, int right) {
	      int index = temp.length;
	      if (left < index - 1)
	            quickSort(temp, left, index - 1);
	      if (index < right)
	            quickSort(temp, index, right);
	}
}