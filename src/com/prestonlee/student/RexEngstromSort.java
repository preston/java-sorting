package com.prestonlee.student;

import com.prestonlee.SortingAlgorithm;

/**
 * This is to do a quick sort
 * 
 * @author Rex Engstrom
 *
 */

public abstract class RexEngstromSort extends SortingAlgorithm{
	
	public RexEngstromSort(int[] _data) {
		super(_data);
		
	}

//	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void sorting (Comparable[] list){
		
		int k;
		Comparable temp;
		
		for(int i = 0; i < list.length-1; i ++){
			
			k = i;
			
			for (int scan = i + 1; scan < list.length; scan++)
				if (list[scan].compareTo(list[k]) < 0)
					k = scan;
			
			temp = list[k];
			list[k] = list[i];
			list[i] = temp;
		}	

	}
	
}
