/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author ferna
 */
public class Util {

	public static void swap(long[] v, int i, int j) {
		long temp = v[i];
		v[i] = v[j];
		v[j] = temp;
	}

	public static void echo(long[] v) {
		System.out.print("{");
		for (double i : v) {
			System.out.print(" " + i + " ");
		}
		System.out.print("}");
	}

}
