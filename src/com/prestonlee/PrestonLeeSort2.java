package com.prestonlee;

public class PrestonLeeSort2 extends PrestonLeeSort {

	public PrestonLeeSort2(int[] items) {
		super(items);
	}

	@Override
	public void sort() {
		super.sort();
		try {
			Thread.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
