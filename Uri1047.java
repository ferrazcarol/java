import java.util.Scanner;

public class Uri1047{
    public static void main (String args[]){
        Scanner teclado = new Scanner (System.in);

        int hI, mI, hF, mF, tempoF, tempoI,dur,durH,durM
        
        hI = teclado.nextInt();
        mI = teclado.nextInt();
        hF = teclado.nextInt();
        mF = teclado.nextInt();

        // converter tudo para minuto

        tempoI = hI * 60 + mI;
        tempoF = hf * 60 + mF;

        dur = tempoF - tempoI;
        // fazer a subt e verificar se <=0 para somar 24h
        if (dur <=60){
            dur = dur + 24 *60;

        }

        // converter de volta
        durH = dur / 60;
        durM = dur % 60;

        System.out.println ("O JOGO DUROU" + durH + "HORAS(S) E" +durM+"MINUTOS (S)");

    }

}