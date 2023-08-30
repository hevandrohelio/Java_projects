//programa que calcula a área de um trapézio
package area_trapezio;

import java.util.Scanner;

public class Area_trapezio {

    public static void main(String[] args) {
        float B; // base maior
        float b; // base menor
        float h; // altura
        float a; // área

        Scanner input = new Scanner(System.in);

        System.out.println("Valor da base maior:");
        B = input.nextFloat();
        System.out.println("Valor da base menor");
        b = input.nextFloat();
        System.out.println("Valor da altura:");
        h = input.nextFloat();

        a = (float) ((B * b) * h) / 2; // calcula a área

        System.out.println("A área do trapézio é: " + a);

    }

}
