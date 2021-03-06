/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort;

//Classe que realiza o Shell Sort, que funciona surpeendentemente bem
public class ShellSort {
	public static void sort(long[] v) {
		int n = v.length;
		int range = n / 2;
		int i, j ;
                long temp;
		int gap;
		while (range > 0) {
			for (i = range; i < n; i++) {
				temp = v[i];
				j = i;
				gap = j - range;
				while (j >= range && v[gap] > temp) {
					v[j] = v[gap];
					j -= range;
					gap = j - range;
				}
				v[j] = temp;
			}
			range /= 2;
		}
	}
}