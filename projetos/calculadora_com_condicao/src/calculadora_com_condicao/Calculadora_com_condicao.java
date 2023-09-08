package calculadora_com_condicao;

import java.util.Scanner;

public class Calculadora_com_condicao {

    public static void main(String[] args) {
        double a; // primeiro valor
        double b; // segundo valor
        String op; // operação
        double r; // resultado
        Scanner input = new Scanner(System.in);

        System.out.println("Calculadora");

        System.out.println("Digite um número:");
        a = input.nextDouble();

        System.out.println("Digite outro número:");
        b = input.nextDouble();

        System.out.println("Qual operação você deseja realizar? [+, -, *, /]");
        op = input.next();

        if ("+".equals(op)) {
            r = a + b;
            System.out.println("A soma de " + a + " mais " + b + " é igual a " + r);
        }
        if ("-".equals(op)) {
            r = a - b;
            System.out.println("A subtração de " + a + " menos " + b + " é igual a " + r);
        }
        if ("*".equals(op)) {
            r = a * b;
            System.out.println("A multiplicação de " + a + " por " + b + " é igual a " + r);
        }
        if ("/".equals(op)) {
            r = a / b;
            System.out.println("A divisão de " + a + " por " + b + " é igual a " + r);
        } else {
            System.out.println("Digite um valor válido");
        }

    }

}
