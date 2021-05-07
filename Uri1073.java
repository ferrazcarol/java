import java.util.Scanner;

public class Uri1073{
    public static void main (String args[]){
        Scanner teclado = new Scanner (System.in);

        int X;
        
        
        X = teclado.nextInt();
        

        for (int contador = 2; contador <= X; contador +=2){
           System.out.println (contador + "^2=" + contador *contador);

            

        }
        
    }

}