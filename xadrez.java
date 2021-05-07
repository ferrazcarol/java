import java.util.Scanner;
    public class xadrez{
        public static void main (String args[]){
            Scanner teclado = new Scanner (System.in);
            int linha, coluna;

            linha = teclado.nextInt();
            coluna = teclado.nextInt();


            if ((linha + coluna) % 2== 0){
                System.out.println("1");
            
            }
            else{

                System.out.println ("0");
            }



        }


    }