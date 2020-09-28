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
public class BenchMark {
    
    private double start, elapsed;

    public void reset() {
        this.start =  System.nanoTime();
    }
    
    public void Benchmark() {
        
    }
    
    public double setElapsed() {
        this.elapsed = ((double)System.nanoTime() - this.start) / 100000;
        return elapsed;
    }
    
    public double getElapsed() {
        return elapsed;
    }
}
