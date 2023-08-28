package entrada_saida_dados;
import java.util.Scanner;

public class Entrada_saida_dados {

    public static void main(String[] args) {
        int num1; // numero 1
        int num2; // numero 2
        int soma; // variável que recebe a soma
        Scanner input = new Scanner(System.in); //instância para receber dados
        System.out.println("Digite o primeiro valor: ");
        num1 = input.nextInt();
        System.out.println("Digite o segundo valor: ");
        num2 = input.nextInt();
        soma = num1 + num2; // soma os números
        System.out.println("A soma de " + num1 + " e " + num2 + " é " + soma);
        
    }
    
}
