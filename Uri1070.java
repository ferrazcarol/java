import java.util.Scanner;

    public class Uri1070{
        public static void main (String args[]){
            Scanner teclado = new Scanner (System.in);

            int X;
            X = teclado.nextInt();

            for (int contador = 1; contador <=12; contador +=2){
                
                System.out.println(X + contador);
                

            }
                
            
        }


    }