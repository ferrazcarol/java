import java.util.Scanner;

public class Uri1012{
    public static void main (String args[]) {
        Scanner teclado = new Scanner (System.in);

        double A, B, C, AT, AC, ATZ, AQ, AR, PI;

        PI = 3.14;

        A = teclado.nextDouble();
        B = teclado.nextDouble();
        C = teclado.nextDouble();

        // processamento

        AT = (A * C)/2;
        AC = PI * (C * C);
        ATZ = (A + B) * C /2;
        AQ = B * B;
        AR = A * B;

        System.out.printf ("TRIANGULO: %.3f\n", AT);
        System.out.printf ("CIRCULO: %.3f\n", AC);
        System.out.printf ("TRAPEZIO: %.3f\n", ATZ);
        System.out.printf ("QUADRADO: %.3f\n", AQ);
        System.out.printf ("RETANGULO: %.3f\n", AR);


    }


}