package com.prestonlee;


public class WrongSort extends SortingAlgorithm{

	public WrongSort(int[] _data) {
		super(_data);
	}

	@Override
	public void sort() {
		// Doesn't actually sort. :(		
		try {
			Thread.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
