import java.util.Scanner;

public class Uri1065 {
    public static void main (String args[]){
        Scanner teclado = new Scanner (System.in);
        int  Qtdpares, valor;
        Qtdpares =0;

        System.out.println ("Digite um valor: ");

        for (int contador = 1; contador <=5; contador ++){
            valor = teclado.nextInt();

            if(valor % 2== 0){
            Qtdpares++;

            }
          

        }

        System.out.println(Qtdpares + "valores pares");
    }




}