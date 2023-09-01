// programa que calcula a área de um triângulo equilátero
package area_triangulo_equilatero;

import java.util.Scanner;

public class Area_triangulo_equilatero {

    public static void main(String[] args) {
        double l;
        double A;

        Scanner input = new Scanner(System.in);

        System.out.println("Lado do triângulo:");
        l = input.nextDouble();

        A = (Math.pow(l, 2) * Math.sqrt(3)) / 4;

        System.out.println("A área do triângulo é: " + A);
    }

}
