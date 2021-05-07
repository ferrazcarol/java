import java.util.Scanner;

public class Uri1067{
    public static void main (String args[]){
        Scanner teclado = new Scanner (System.in);

        int X, qtdImpares;

        qtdImpares =0 ;

       X = teclado.nextInt();

        for(int contador =1; contador <= X; contador +=2) {
             

                System.out.println(contador);
            


        }
       
    }

}