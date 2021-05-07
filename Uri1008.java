import java.util.Scanner;

public class Uri1008{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);
        
        int NUMBER, HORASTRAB;
        double SALARY, VALORTRAB;

        NUMBER = teclado.nextInt();
        HORASTRAB = teclado.nextInt();
        VALORTRAB = teclado.nextDouble();

        SALARY = HORASTRAB * VALORTRAB;


        // System.out.printf("NUMBER = %d\n" + NUMBER); - print inteiro com a função print f.
        System.out.println("NUMBER = " + NUMBER);
        System.out.printf("SALARY = U$ %.2f\n", SALARY);


    }


}