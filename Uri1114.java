import java.util.Scanner;

public class Uri1114{
    public static void main (String args[]){
        Scanner teclado = new Scanner (System.in);

        int senha;


        senha = teclado.nextInt();

        do{
            if(senha != 2022){
                System.out.println ("Acesso Negado");

            }
            else{
                System.out.println ("Acesso Permitido");
            }


        }while (senha !=2002);






    /*
        while (valor != 2022){

            if (valor == senha){
                
                System.out.println ("Acesso permitido");
            }
            else{
                
                 System.out.println ("Senha invalida");
            }

        } */
           
        


    }


}