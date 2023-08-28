package calculadora_basica;

import java.util.Scanner;

public class Calculadora_basica {

    public static void main(String[] args) {
        double num1;
        double num2;
        double soma;
        double sub;
        double mul;
        double div;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número:");
        num1 = input.nextDouble();
        System.out.println("Digite outro número:");
        num2 = input.nextDouble();

        soma = num1 + num2;
        sub = num1 - num2;
        mul = num1 * num2;
        div = num1 / num2;

        System.out.println(num1 + " + " + num2 + " = " + soma);
        System.out.println(num1 + " - " + num2 + " = " + sub);
        System.out.println(num1 + " * " + num2 + " = " + mul);
        System.out.println(num1 + " / " + num2 + " = " + div);

    }

}
