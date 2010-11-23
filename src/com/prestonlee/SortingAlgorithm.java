package com.prestonlee;

public abstract class SortingAlgorithm implements Comparable<SortingAlgorithm> {

	protected int[] data;

	@Override
	public int compareTo(SortingAlgorithm o) {
		return this.getClass().getName().compareTo(o.getClass().getName());

	}

	public SortingAlgorithm(final int[] _data) {
		data = _data;
	}

	public int[] getData() {
		return data;
	}

	public void setData(int[] data) {
		this.data = data;
	}

	public abstract void sort();

	public boolean isSorted() {
		int [] copy = new int[data.length];
		System.arraycopy(data, 0, copy, 0, data.length);
		SortingAlgorithm sorter = new PrestonLeeSort(copy);
		sorter.sort();
		final int[] expected = sorter.getData();
		boolean sorted = true;
		for (int i = 0; i < expected.length; i++) {
			if (expected[i] != data[i]) {
				sorted = false;
				break;
			}
		}
		return sorted;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(data.length);
		sb.append("[");
		for (int i = 0; i < data.length; i++) {
			sb.append(data[i]);
			if (i < data.length - 1) {
				sb.append(", ");
			}
		}
		sb.append("]");
		return sb.toString();
	}

}
