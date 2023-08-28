package entrada_saida_dados;
import java.util.Scanner;

public class Entrada_saida_dados {

    public static void main(String[] args) {
        System.out.println("A");
        int num1;
        int num2;
        int soma;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        num1 = input.nextInt();
        System.out.println("Digite o segundo valor: ");
        num2 = input.nextInt();
        soma = num1 + num2;
        System.out.println("A soma de " + num1 + " e " + num2 + " é " + soma);
        
    }
    
}
