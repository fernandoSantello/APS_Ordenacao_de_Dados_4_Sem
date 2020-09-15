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
public class MergeSort {

	public static void sort(double[] v) {
		mergeSort(v, 0, v.length - 1);
	}

	private static void mergeSort(double[] v, int low, int high) {
		if (low < high) {
			int middle = (low + high) / 2;
			mergeSort(v, low, middle);
			mergeSort(v, middle + 1, high);
			merge(v, low, middle, high);
		}
	}

	private static void merge(double[] v, int low, int middle, int high) {
		double[] vAux = new double[v.length];
		for (int i = low; i <= high; i++) {
			vAux[i] = v[i];
		}
		int i = low;
		int j = middle + 1;
		int k = low;
		while (i <= middle && j <= high) {
			if (vAux[i] <= vAux[j]) {
				v[k] = vAux[i];
				i++;
			} else {
				v[k] = vAux[j];
				j++;
			}
			k++;
		}
		while (i <= middle) {
			v[k] = vAux[i];
			k++;
			i++;
		}
	}
}