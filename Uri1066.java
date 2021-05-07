import java.util.Scanner;

public class Uri1066{
    public static void main (String args[]){
        Scanner teclado = new Scanner (System.in);

        int valor, qtdPositivos, qtdNegativos, qtdImpares, qtdPares;
        qtdPositivos = 0;
        qtdNegativos = 0;
        qtdImpares = 0;
        qtdPares = 0;

        for (int contador = 1; contador <= 5; contador ++){
            valor = teclado.nextInt();

            if (valor > 0){
                qtdPositivos ++;
            }
            else if (valor < 0){
                qtdNegativos ++;
            }
            if (valor % 2 == 0){
                qtdPares++;
            }
            else if (valor % 2 !=0){
                qtdImpares++;
                }

              
        }

                System.out.println (qtdPositivos + " valor(es) positivos");
                System.out.println (qtdNegativos + " valor(es) negativos");
                System.out.println (qtdPares + " valor(es) pares");
                System.out.println  (qtdImpares + " valor(es) impares");

    }
}
