package util;

import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.Random;

public class RandomNumberGenerator {
    
    public double MathX(double number) {
        double cut = Math.round(number * 1000000.0) / 1000000.0;

        return cut;

    }
    public double MathY(double number) {
        double cut = Math.round(number * 10000000.0) / 10000000.0;

        return cut;

    }
    
private static DecimalFormat t = new DecimalFormat("0.00");

Random rand = new Random();

    public double genRandomNumberX(double min, double max) {
        Random random = new Random();
           double start = min;
            double end = max;
            double rand = random.nextDouble();
            double result = start + (rand * (end - start));
            
           // String format = String.format("%.2f" ,(result));
//            new DecimalFormat("$#.0000").format(result);
//            System.out.println(result);
            //DecimalFormat numberFormat = new DecimalFormat("0.000000000");
            //System.out.println(numberFormat.format(result));
            return result;
    }
     
    public double genRandomNumberY(double min, double max) {
        Random random = new Random();
           double start = min;
            double end = max;
            double rand = random.nextDouble();
            double result = start + (rand * (end - start));
        //String format = String.format("%.2f" ,(result));
            //DecimalFormat numberFormat = new DecimalFormat("00.00000000");
            //System.out.println(numberFormat.format(result));
            return result;
    }
    
    
    public long [] genRandomNumberArray(int size, double minX, double maxX, double minY,double maxY) {
        long  [] arr = new long [size];
//TEM QUE COLOCAR O FOR PRA SINAL E CONCATENAR
        for (int i = 0; i < arr.length; i++) {
            double x,y,xt; 
            String a="1", b="2";
            String x1,y1;
            BigInteger ref;
                
            x=genRandomNumberX(minX, maxX);
          //  xt=x;
            //DecimalFormat xe = new DecimalFormat("#.00");
            
            x = MathX(x);
            
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
            
            System.out.println("x: "+x); 
            //System.out.println("xt: "+xt);
            System.out.println("y: "+y);
            System.out.println("x1: "+x1);
            System.out.println("y1: "+y1);
            System.out.println("st concatenado: "+st);
            
           long res = Long.valueOf(st);
           
           
           
          //BigInteger at = new BigInteger(st); 
         
//        
          //DecimalFormat numberFormat = new DecimalFormat("0000000000000000000000");
          //String.format("%.2f", (double)value);
        
          arr[i] = res;
          System.out.println("Long: "+res);
          System.out.println("Long: "+x);
      
//        System.out.println(x);
//        System.out.println(y);
            
            
//            System.out.println("Variável string antes de converter: "+st);
//            System.out.println("Variável double com o valor de St convertido para double: "+res);
// 
            
            //System.out.println(teste);
        }

        return arr;
    }
}