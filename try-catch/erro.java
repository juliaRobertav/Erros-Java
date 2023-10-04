package exemplos;
import java.util.InputMismatchException;
import java.util.Scanner;

public class erro {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int numero;

        while (true){
            try{
                System.out.println("Digite um número:");
                numero = ler.nextInt();
                if (numero<20){
                    continue;
                }
                break;

            }
            catch (InputMismatchException e  ){         //declarar o tipo de erro(tipo do erro)
                System.out.println("Ops...você digitou caracteres invalidos" +
                        "Precisamos que digite apenas números");
            }
            ler.nextLine();
        }
        System.out.println(numero);



    }
}
