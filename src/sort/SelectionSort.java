/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort;

/**
 *
 * @author Fernando Santello
 */
import util.Util;

//Classe que realiza o Selection Sort
public class SelectionSort {
	public static void sort(long[] v) {
		int i, j, min, n = v.length;
		for (i = 0; i < n; i++) {
			min = i;
			for (j = i + 1; j < n; j++) {
				if (v[min] > v[j])
					min = j;
			}
			Util.swap(v, min, i);
		}
	}
}
