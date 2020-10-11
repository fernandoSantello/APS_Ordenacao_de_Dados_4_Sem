package util;

import java.util.Random;

/**
 *
 * @author Fernando Santello
 */

//Clase que gera números e é responsável princialmente pela geração de arrays aleatórios usados na classe Tela
public class RandomNumberGenerator {
    
    //Método para arredondar o valor de X
    private double MathX(double number) {
        double cut = Math.round(number * 1000000.0) / 1000000.0;
        return cut;
    }
    
    //Método para arredondar o valor de Y
    private double MathY(double number) {
        double cut = Math.round(number * 10000000.0) / 10000000.0;
        return cut;
    }
    //Os dois métodos acima são parecidos mas tem tamanhos diferentes. De acordo com a localização da Amazônia Legal,
    //as coordenadas indicam que X tem geralmente 7 dígitos e Y oito dígitos
    

Random rand = new Random();
    
    //Método para gerar um número aleatório X, que recebe como parâmetros um número mínimo e um máximo
    private double genRandomNumberX(double min, double max) {
        Random random = new Random();
            double start = min;
            double end = max;
            //Gera um número aleatório que está dentro dos parâmetros
            double rand = random.nextDouble();
            double result = start + (rand * (end - start));
            //Retorna o número gerado
            return result;
    }
     
    //Método para gerar um número aleatório Y, que recebe como parâmetros um número mínimo e um máximo
    private double genRandomNumberY(double min, double max) {
        Random random = new Random();
            double start = min;
            double end = max;
            //Gera um número aleatório que está dentro dos parâmetros
            double rand = random.nextDouble();
            double result = start + (rand * (end - start));
            //Retorna o número gerado
            return result;
    }
    //De novo, os dois métodos podem parecer redundantes. Mas X tem uma quantidade mínima e máxima diferente de Y, e vice versa. Por isso existe
    //um método para cada um
    
    //Uma das estrlas do projeto. Método lindo e incrível responsável por gerar um array com localizações aleatórias, mas dentro da Amazônia Legal
    public long [] genRandomNumberArray(int size, double minX, double maxX, double minY,double maxY) {
        //Cria o array com o tamnho passado como parâmetro  
        long  [] arr = new long [size];
        //For para realizar as operações para cada elemento do array, para que ele seja totalmente preenchido
        for (int i = 0; i < arr.length; i++) {
                double x,y; 
                //String com valores usados para realizar a junção de latitude e longitude para criar a localização. Para serem ordenadas, 
                //a localização deve ser a unificação de longitude X e latitude Y, e os sinais de X e Y devem ser transformados em números,
                //que no caso é 1 para positivo e 2 para negativo. Então, por exemplo, X = 123 e Y = -123, cria a localização Z = 11232123,
                //podendo assim ser ordenda com as outras geradas da mesma forma
                String a="1", b="2",xt;
                //Variáveis string de auxílio
                String x1,y1;
                //Isso serve pra saber se X não é notação científica e contem a letra "E" em seu valor. Isso as vezes acontece com X, e isso
                //impede que o valor seja passado para long posteriormente. Então se X for uma notação científica, ele simplesmente sorteia o valor
                //de X de novo até ele não ser
                do{
                    x=genRandomNumberX(minX, maxX);
                    x = MathX(x);
                    xt = String.valueOf(String.valueOf(x));
                }while (xt.contains("E"));
                //Se X for maior que zero, ele é positivo, o que faz com que o "1" seja concatenado na frente do valor de X para representar o sinal,
                //como explicado logo acima. Essa parte na verdade não é necessária, porque X sempre vai sser gerado denrto da Amazônia Legal, e ela
                //está numa localização do globo onde sua longitude e latitude sempre serão negativas. Mas como o programa pode posteriormente ser
                //alterado para gerar localizações de outros lugares, esse if é mantido
                if (x>0){
                     x1 = String.valueOf(String.valueOf(a) +String.valueOf(x));
                }else{
                //Se X for menor que zero, ele é negativo, o que faz com que o "2" seja concatenado na frente do valor de X para representar o sinal.
                     x1 = String.valueOf(String.valueOf(b) + String.valueOf(x));
                }
                //Gera o número aleatório Y
                y=genRandomNumberY(minY,maxY);
                y = MathY(y);
                if (y>0){
                 //Se Y for maior que zero, ele é positivo, o que faz com que o "1" seja concatenado na frente do valor de Y para representar o sinal.
                     y1 = String.valueOf(String.valueOf(a) + String.valueOf(y));
                }else{
                 //Se Y for menor que zero, ele é negativo, o que faz com que o "2" seja concatenado na frente do valor de Y para representar o sinal.
                     y1 = String.valueOf(String.valueOf(b) +String.valueOf(y));
                }
                //Depois que X1 e Y1 forem concatenados com os valores numéricos de seus respectivos sinais, X1 e Y1 são concatenados entre si,
                //gerando assim uma localização em string
                String st=String.valueOf(String.valueOf(x1) + String.valueOf(y1));
                
                //Como o número é double, ele ainda possui pontos. Então esses são apagados quando ainda é string, 
                //porque eles não importam mais para a localização. O mesmo acontece com o sinal negativo, que também é apagado.
                //O sinal positivo não é representado, etnão não precisa fazer nada com ele, já que ele nem está aqui
                st = st.replace(".", "");
                st = st.replace("-", "");
                //Prints que foram muito usados para testagem no desenvolvimento do programa. Caso o professor queira ver o processo mais
                //detalhadamente, eles permanecem aqui
                //System.out.println("x: "+x); 
                //System.out.println("y: "+y);
                //System.out.println("x1: "+x1);
                //System.out.println("y1: "+y1);
                //System.out.println("x1 e y1 oncatenados: "+st);
                //Converte a string que contém a localização para long, que é o tipo de dado ideal para a situação
                long res = Long.valueOf(st);
                //Adiciona a localização long no array
                arr[i] = res;
                //Outro print pra mostrar como o valor long é igual ao valor string
                //System.out.println("Valor long de st: "+res);
        }
        //Quando tudo acaba, retorna o array com localizações aleatórias gerado
        return arr;
    }
}