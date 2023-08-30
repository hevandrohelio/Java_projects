//programa que calcula a área de losangos
package area_losango;

import java.util.Scanner;

public class Area_losango {

    public static void main(String[] args) {
        float D; // diagonal maior
        float d; // diagonal menor
        float a; // área

        Scanner input = new Scanner(System.in);

        System.out.println("Diagonal maior:");
        D = input.nextFloat();
        System.out.println("Diagonal menor:");
        d = input.nextFloat();

        a = (float) (D * d) / 2; // calcula a área

        System.out.println("A área do losango é: " + a);
    }

}
