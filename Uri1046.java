import java.util.Scanner;

public class Uri1046{
    public static void main (String args[]){
        Scanner teclado = new Scanner (System.in);

        int HoraInicial, HoraFinal, Duracao;

        HoraInicial = teclado.nextInt();
        HoraFinal = teclado.nextInt();

        if (HoraInicial == HoraFinal){
            System.out.println ("O JOGO DUROU 24 HORA(S)");


        }   
        else if (HoraFinal > HoraInicial){
            Duracao = HoraFinal - HoraInicial;
            System.out.println ("O JOGO DUROU " + Duracao + " HORA(S)");

        }
        else if (HoraFinal < HoraInicial){
            Duracao = 24 - (HoraInicial - HoraFinal);
            System.out.println ("O JOGO DUROU " + Duracao + " HORA(S)");

        }
        else{

        }

    }


}