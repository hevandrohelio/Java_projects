// programa que calcula área de triângulo retângulo
package area_triangulo_retangulo;

import java.util.Scanner;

public class Area_triangulo_retangulo {

    public static void main(String[] args) {
        double b; // base
        double h; // altura
        double A; // Área

        Scanner input = new Scanner(System.in);

        System.out.println("Base do triângulo:");
        b = input.nextDouble();
        System.out.println("Altura do triângulo:");
        h = input.nextDouble();

        A = (b * h) / 2; // calcula a área

        System.out.println("A área do triângulo é: " + A);
    }

}
