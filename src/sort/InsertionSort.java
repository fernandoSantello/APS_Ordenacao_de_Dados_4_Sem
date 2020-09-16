/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort;

/**
 *
 * @author ferna
 */
public class InsertionSort {
	public static void sort(long[] v) {
		int i, j, n = v.length;
                long temp;
		for (i = 1; i < n; i++) {
			temp = v[i];
			j = i - 1;
			while (j >= 0 && v[j] > temp) {
				v[j + 1] = v[j];
				j--;
			}
			v[j + 1] = temp;
		}
	}
}