//programa que calcula teorema de pitágoras
package pitagoras;

import java.util.Scanner;

public class Pitagoras {

    public static void main(String[] args) {
        float cat_o; // cateto
        float cat_a; // cateto
        float hip; // hipotenusa

        Scanner input = new Scanner(System.in);

        System.out.println("Valor do primeiro cateto:");
        cat_o = input.nextFloat();
        System.out.println("Valor do segundo cateto:");
        cat_a = input.nextFloat();
        cat_o = (float) Math.pow(cat_o, 2); // eleva o valor de cat_o ao quadrado
        cat_a = (float) Math.pow(cat_a, 2); // eleva o valor de cat_a ao quadrado
        hip = (float) Math.sqrt(cat_o + cat_a); // faz a raiz quadrada de cat_o + cat_a

        System.out.println("A hipotenusa vale " + hip);
    }

}
