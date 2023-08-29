//programa que calcula a área de um triangulo a partir da Fórmula de Heron
package area_triangulo_heron;

import java.util.Scanner;

public class Area_triangulo_heron {

    public static void main(String[] args) {
        float a; // lado 1
        float b; // lado 2
        float c; // lado 3
        float p; // semi-perímetro
        float Area; // Área
        Scanner input = new Scanner(System.in);

        System.out.println("Valor do primeiro lado do triângulo:");
        a = input.nextFloat();
        System.out.println("Valor do segundo lado do triângulo:");
        b = input.nextFloat();
        System.out.println("Valor do terceiro lado do triângulo:");
        c = input.nextFloat();

        p = (a + b + c) / 2; // calcula o semi-perímetro

        System.out.println("O semi-perímetro é igual a " + p);

        Area = (float) Math.sqrt((p * (p - a) * (p - b) * (p - c))); // Fórmula de Heron (Área)

        System.out.println("A área do triângulo é igual a " + Area);

    }

}
