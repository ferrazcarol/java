import java.util.Scanner;

public class Leitura{
    public static void main(String args[]){
        // declara a variável que recebera os valores digitados no teclado do tipo Scanner
        Scanner teclado;
        teclado = new Scanner(System.in);

        double base, altura, area;

        // entrada de dados
        System.out.println ("Por favor. digite o valor da base:");
        base = teclado.nextDouble ();

        System.out.println ("Por favor, digite o valor da altura:");
        altura = teclado.nextDouble ();

        // processamento

        area = base * altura;

        // saída
        System.out.println ("O valor da area =" + area);

    }
}