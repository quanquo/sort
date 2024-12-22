package com.dangvis.sort;

public class SortApp {

	public static void main(String args[]) {
		Sort sortAlg = new BubbleSort();
		int a[] = { 64, 34, 25, 12 };

		sortAlg.sort(a);
		for (int i = 0; i < a.length; ++i)
			System.out.print(a[i] + " ");
		
		System.out.println();
		
		QuickSort quick = new QuickSort();
		int b[] = { 64, 34, 25, 12 };

		quick.sort(b);
		for (int i = 0; i < b.length; ++i)
			System.out.print(b[i] + " ");
	}
}
