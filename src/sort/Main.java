/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort;

//
///**
// *
// * @author ferna
// *

import util.Util;

public class Main {

	private static int[] SET = { 54, 2, 98, 4, 98, 3, 23, 43, 65, 56, 12, 76,
			71, 21, 21, 48, 2, 8, 10, 90, 60, 50, 95, 13, 82, 59, 20, 37, 52,
			68, 18, 19, 66, 31 };

public static void main(String[] args) {
       BubbleSort.sort(SET);
       HeapSort.sort(SET);
       InsertionSort.sort(SET);
       MergeSort.sort(SET);
       QuickSort.sort(SET);
       SelectionSort.sort(SET);
       ShellSort.sort(SET);

        Util.echo(SET);
	}

}