import java.util.Scanner;

public class Uri1048{
    public static void main (String args[]){
        Scanner teclado = new Scanner (System.in);

        double SALARIO, NOVOSALARIO, REAJUSTE;
        //int PERCENTUAL;

        //PERCENTUAL =0;

        SALARIO = teclado.nextDouble();

        if (SALARIO > 0 && SALARIO <=400){  
            REAJUSTE = SALARIO * 0.15;
            NOVOSALARIO = SALARIO + REAJUSTE;
            //PERCENTUAL = 15%;

            System.out.printf ("Novo Salario: %.3f \n",NOVOSALARIO);
            System.out.printf ("Reajuste: %.3f \n",REAJUSTE);
            System.out.println ("Percentual: 15%");

        }
        else if (SALARIO > 400 && SALARIO <=800){
            REAJUSTE = SALARIO * 0.12;
            NOVOSALARIO = SALARIO + REAJUSTE;
            
            System.out.printf ("Novo Salario: %.3f \n",NOVOSALARIO);
            System.out.printf ("Reajuste: %.3f \n",REAJUSTE);
            System.out.println ("Percentual: 12%");


        }

    }





}