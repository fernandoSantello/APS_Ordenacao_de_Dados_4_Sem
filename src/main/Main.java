package main;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package main;
//
///**
// *
// * @author ferna
// */

import java.util.Arrays;
import util.Util;
import sort.*;
import util.BenchMark;

public class Main {

	private static int[] SET = { 54, 2, 98, 4, 98, 3, 23, 43, 65, 56, 12, 76,
			71, 21, 21, 48, 2, 8, 10, 90, 60, 50, 95, 13, 82, 59, 20, 37, 52,
			68, 18, 19, 66, 31 };

	public static void main(String[] args) { 
        BenchMark bmm = new BenchMark();
        bmm.reset();
        System.out.println("Antes: "+Arrays.toString(SET)+"\n");
        QuickSort.sort(SET);
        bmm.setElapsed();
        System.out.println("Depois: "+Arrays.toString(SET));
        System.out.println(("Duração total: " + bmm.getElapsed() + " milissegundos.\n"));
//        BubbleSort.sort(SET);
//        HeapSort.sort(SET);
//        InsertionSort.sort(SET);
//        MergeSort.sort(SET);
//        QuickSort.sort(SET);
//        SelectionSort.sort(SET);
//        ShellSort.sort(SET);

       // Util.echo(SET);
	}

}