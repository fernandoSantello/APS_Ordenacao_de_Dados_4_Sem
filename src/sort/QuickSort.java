/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort;

import util.Util;

//Classe que realiza o Quick Sort
public class QuickSort {
	private static int i;
	private static int j;
        private static long [] v;

	public static void sort(long[] v) {
		quickSort(v, 0, v.length - 1);
	}

	private static void quickSort(long[] v, int low, int high) {
		partition(v, low, high);
		if (low < j)
			quickSort(v, low, j);
		if (high > i)
			quickSort(v, i, high);
	}

	private static void partition(long[] v, int low, int high) {
		 i = low;
		 j = high;
                 double x;
		 x = v[(i + j) / 2];
		while (i <= j) {
			while (v[i] < x)
				i++;
			while (v[j] > x)
				j--;
			if (i <= j) {
				Util.swap(v, j, i);
				i++;
				j--;
			}
		}
	}
}