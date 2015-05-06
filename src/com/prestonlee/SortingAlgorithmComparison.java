package com.prestonlee;

import static java.lang.System.out;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.Random;

import com.prestonlee.student.AllenWattsSort;
import com.prestonlee.student.AlvinMoradi;
import com.prestonlee.student.BrianLauSort;
import com.prestonlee.student.ChrisMcDonald;
import com.prestonlee.student.MichaelBergSort;
import com.prestonlee.student.RexEngstromSort;
import com.prestonlee.student.StevenHondaSort;
import com.prestonlee.student.TravisGeerySort;
import com.prestonlee.student.WesleyBlaes;
import com.prestonlee.student.ZachJetsonSort;

/**
 * Driver for final individual assignment
 * 
 * @author Preston Lee <preston@asu.edu>
 * 
 */
public class SortingAlgorithmComparison {

	/**
	 * @param args
	 *            None.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int length = 1000000000;
		final int maxValue = length * 2;
		final int seed = 1337;
		TreeMap<SortingAlgorithm, Integer> algorithms = new TreeMap<SortingAlgorithm, Integer>();

		System.out.println("");
		// printItems(length, maxValue, seed);

		// Add algorithms here!!!
		algorithms.put(new PrestonLeeSort(createData(200, maxValue, seed)), 0);
		algorithms.put(new PrestonLeeSort2(createData(200, maxValue, seed)), 0);
		algorithms.put(new WrongSort(createData(200, maxValue, seed)), 0);
		algorithms.put(new AllenWattsSort(createData(200, maxValue, seed)), 0);
		algorithms.put(new AlvinMoradi(createData(200, maxValue, seed)), 0);
		algorithms.put(new BrianLauSort(createData(200, maxValue, seed)), 0);
		algorithms.put(new ChrisMcDonald(createData(200, maxValue, seed)), 0);
		algorithms.put(new MichaelBergSort(createData(200, maxValue, seed)), 0);
		algorithms.put(new StevenHondaSort(createData(200, maxValue, seed)), 0);
		algorithms.put(new TravisGeerySort(createData(200, maxValue, seed)), 0);
		algorithms.put(new ZachJetsonSort(createData(200, maxValue, seed)), 0);
		algorithms.put(new WesleyBlaes(createData(200, maxValue, seed)), 0);
		
		for (Entry<SortingAlgorithm, Integer> entry : algorithms.entrySet()) {
			int time = runAlgorithm(entry.getKey());
			entry.setValue(time);
		}

	}

	private static void printItems(final int length, final int maxValue, final int seed) {
		out.print("Initial list: [");
		final int[] items = createData(length, maxValue, seed);
		for (int i = 0; i < items.length; i++) {
			out.print(items[i]);
			if (i < items.length - 1) {
				out.print(", ");
			}
		}
		out.println("]");
	}

	public static int runAlgorithm(final SortingAlgorithm a) {
		final long before = System.nanoTime();
		a.sort();
		final int totalMilliseconds = (int) (System.nanoTime() - before);

		out.println("\n" + a.getClass().getName() + ":");
		out.println("\tTime:\t" + totalMilliseconds);
		// out.println("\tOutput:\t" + a.toString());
		out.println("\tSorted:\t" + a.isSorted());

		return totalMilliseconds;
	}

	public static int[] createData(int length, int maxValue, int seed) {
		final Random r = new Random(seed);
		final int[] items = new int[length];
		for (int i = 0; i < items.length; i++) {
			items[i] = Math.abs(r.nextInt()) % maxValue;

		}
		return items;
	}

	public static Map<SortingAlgorithm, Integer> sortByValue(Map<SortingAlgorithm, Integer> map) {
		List<Entry<SortingAlgorithm, Integer>> list = new LinkedList<Entry<SortingAlgorithm, Integer>>(map.entrySet());
		Collections.sort(list, new Comparator<Entry<SortingAlgorithm, Integer>>() {

			@Override
			public int compare(Entry<SortingAlgorithm, Integer> o1, Entry<SortingAlgorithm, Integer> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
		});
		// logger.info(list);
		Map<SortingAlgorithm, Integer> result = new LinkedHashMap<SortingAlgorithm, Integer>();
		for (Iterator<Entry<SortingAlgorithm, Integer>> it = list.iterator(); it.hasNext();) {
			Map.Entry<SortingAlgorithm, Integer> entry = it.next();
			result.put(entry.getKey(), entry.getValue());
		}
		return result;
	}

}
