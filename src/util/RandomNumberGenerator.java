package util;

import java.util.Random;

public class RandomNumberGenerator {

    Random rand = new Random();

    public double genRandomNumber(double min, double max) {
        Random random = new Random();
           double start = min;
            double end = max;
            double rand = random.nextDouble();
            double result = start + (rand * (end - start));
            return result;
    }

    public double[] genRandomNumberArray(int size, double min, double max) {
        double[] arr = new double[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = genRandomNumber(min, max);
        }

        return arr;
    }
}