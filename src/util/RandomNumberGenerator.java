package util;

import java.util.Random;

public class RandomNumberGenerator {
    
    private double MathX(double number) {
        double cut = Math.round(number * 1000000.0) / 1000000.0;
        return cut;
    }
    private double MathY(double number) {
        double cut = Math.round(number * 10000000.0) / 10000000.0;
        return cut;
    }

Random rand = new Random();

    private double genRandomNumberX(double min, double max) {
        Random random = new Random();
           double start = min;
            double end = max;
            double rand = random.nextDouble();
            double result = start + (rand * (end - start));
            return result;
    }
     
    private double genRandomNumberY(double min, double max) {
        Random random = new Random();
           double start = min;
            double end = max;
            double rand = random.nextDouble();
            double result = start + (rand * (end - start));
            return result;
    }
    
    
    public long [] genRandomNumberArray(int size, double minX, double maxX, double minY,double maxY) {
        long  [] arr = new long [size];
        for (int i = 0; i < arr.length; i++) {
                double x,y; 
                String a="1", b="2",xt;
                String x1,y1;
                do{
                    x=genRandomNumberX(minX, maxX);
                    x = MathX(x);
                    xt = String.valueOf(String.valueOf(x));
                }while (xt.contains("E"));
                if (x>0){
                     x1 = String.valueOf(String.valueOf(a) +String.valueOf(x));
                }else{
                     x1 = String.valueOf(String.valueOf(b) + String.valueOf(x));
                }
                y=genRandomNumberY(minY,maxY);
                y = MathY(y);
                if (y>0){
                     y1 = String.valueOf(String.valueOf(a) + String.valueOf(y));
                }else{
                     y1 = String.valueOf(String.valueOf(b) +String.valueOf(y));
                }
                String st=String.valueOf(String.valueOf(x1) + String.valueOf(y1));

                st = st.replace(".", "");
                st = st.replace("-", "");

//                System.out.println("x: "+x); 
//                System.out.println("y: "+y);
//                System.out.println("x1: "+x1);
//                System.out.println("y1: "+y1);
//                System.out.println("st concatenado: "+st);
                long res = Long.valueOf(st);
                arr[i] = res;
//                System.out.println("Long: "+res);
        }
        return arr;
    }
}