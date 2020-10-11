/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author Fernando Santello
 */

//Classe de utilidade muito utiliada nos sorts
public class Util {
        
        //Método para fazer o swap (troca) de dois lugares entre números. Utilizada constantemente nos sorts
	public static void swap(long[] v, int i, int j) {
		long temp = v[i];
		v[i] = v[j];
		v[j] = temp;
	}

        //Método para printar o array recebido. Foi muito utiizado quando o programa ainda nã tinha interface, etnão merece uma mençaõ honrosa.
        //Não é mais usado, mas não vamos desmerecer ele né
	public static void echo(long[] v) {
		System.out.print("{");
		for (double i : v) {
			System.out.print(" " + i + " ");
		}
		System.out.print("}");
	}

}
