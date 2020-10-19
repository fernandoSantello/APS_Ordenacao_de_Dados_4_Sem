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

//Classe BenchMark, que é responsável por medição de tempo
public class BenchMark {
    
    //Atributos da classe
    private double start, elapsed;

    //Utiliza o método System.nanoTime() para pegar os nanosegundos atuais do sistemas
    public void reset() {
        this.start =  System.nanoTime();
    }
    
    //Construtor 
    public void Benchmark() {
        
    }
    
    // Método para realizar a conta de milisegundos entre o momento atual e o momento armazenado em start
    public double setElapsed() {
        this.elapsed = ((double)System.nanoTime() - this.start)/ 1E6;
        //Retorna o valor da operação
        return elapsed;
    }
    
    //Getter para pegar o valor da operação
    public double getElapsed() {
        return elapsed;
    }
}
