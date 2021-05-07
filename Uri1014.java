import java.util.Scanner;

public class Uri1014{
    public static void main (String args[]){
        Scanner teclado = new Scanner (System.in);
            int X;
            double Y, CM;

            X = teclado.nextInt();
            Y = teclado.nextDouble();

            CM = X/Y;


           
            
            System.out.printf ("%.3f km/l \n", CM);
            
            //Outra alternativa de mostrar na tela
           //System.out.printf ("%.3f", CM);
           //System.out.println ("km/l");



    }


}