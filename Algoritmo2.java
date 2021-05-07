import java.util.Scanner;

public class Algoritmo2{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner (System.in);

        double base, altura, largura,  areatri, areatra, volumep, basemaior, basemenor, profundidade;

        // Calculo do triangulo

        System.out.print("Digite o valor da base:");
        base = teclado.nextDouble();

        System.out.print("Digite o valor da altura:");
        altura = teclado.nextDouble();

        System.out.print("Digite o valor da largura:");
        largura = teclado.nextDouble();

        System.out.print ("Digite o valor da base maior:");
        basemaior = teclado.nextDouble();

        System.out.print ("Digite o valor da base menor:");
        basemenor = teclado.nextDouble();

        System.out.print("Digite o valor da profundidade:");
        profundidade = teclado.nextDouble();



        // processamento (calculo das areas)
        areatri = (base*altura)/2;
        areatra = (basemaior + basemenor)*altura/2;
        volumep = altura * largura * profundidade;

        //saida de dados

        System.out.println ("O valor da area do triangulo = " + areatri); 
        System.out.println ("O valor da area do trapezio = " + areatra);
        System.out.println ("O valor do volume do paralalepido = " + volumep);


    }


}