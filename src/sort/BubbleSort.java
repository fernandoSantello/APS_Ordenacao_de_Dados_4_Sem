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
import util.Util;

public class BubbleSort {
	public static void sort(double[] v) {
		int i, j, n = v.length;
		for (i = 0; i < n; i++) {
			for (j = i + 1; j < n; j++) {
				if (v[i] > v[j]) {
					Util.swap(v, i, j);
				}
			}
		}
	}
}