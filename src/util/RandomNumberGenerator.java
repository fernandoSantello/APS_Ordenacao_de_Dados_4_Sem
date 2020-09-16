package util;

import java.util.Random;

public class RandomNumberGenerator {

    Random rand = new Random();

    public double genRandomNumberX(double min, double max) {
        Random random = new Random();
           double start = min;
            double end = max;
            double rand = random.nextDouble();
            double result = start + (rand * (end - start));
            return result;
    }
     
    public double genRandomNumberY(double min, double max) {
        Random random = new Random();
           double start = min;
            double end = max;
            double rand = random.nextDouble();
            double result = start + (rand * (end - start));
            return result;
    }
    
    
    public double[] genRandomNumberArray(int size, double minX, double maxX, double minY,double maxY) {
        double[] arr = new double[size];
//TEM QUE COLOCAR O FOR PRA SINAL E CONCATENAR
        for (int i = 0; i < arr.length; i++) {
            double x,y; 
            String a="1", b="2";
            String x1,y1;
                
            x=genRandomNumberX(minX, maxX);
            
            if (x>0){
                 x1 = String.valueOf(String.valueOf(a) +String.valueOf(x));
            }else{
                 x1 = String.valueOf(String.valueOf(b) + String.valueOf(x));
            }
            y=genRandomNumberY(minY,maxY);
            
            if (y>0){
                 y1 = String.valueOf(String.valueOf(a) + String.valueOf(y));
            }else{
                 y1 = String.valueOf(String.valueOf(b) +String.valueOf(y));
            }
            
            String st=String.valueOf(String.valueOf(x1) + String.valueOf(y1));
            
            st = st.replace(".", "");
            st = st.replace("-", "");
            
           double res = Double.valueOf(st);
          // Long teste=Long.valueOf(st);
//           
          arr[i] = res;
            
            
//            System.out.println("Variável string antes de converter: "+st);
//            System.out.println("Variável double com o valor de St convertido para double: "+res);
// 
            
            //System.out.println(teste);
        }

        return arr;
    }
}