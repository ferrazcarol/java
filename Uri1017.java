import java.util.Scanner;

public class Uri1017{
    public static void main (String args[]){
        Scanner teclado = new Scanner (System.in);

        int TViagem, VMedia, Litros;
        double Dpercorrida, LitrosG;

        Litros = 12;

        TViagem = teclado.nextInt();
        VMedia = teclado.nextInt();
        
        Dpercorrida = TViagem*VMedia;
        LitrosG = Dpercorrida/Litros;

        System.out.printf ("%.3f\n", LitrosG);




    }


}