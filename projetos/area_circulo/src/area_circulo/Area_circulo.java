// programa que calcula a área do círculo
package area_circulo;

import java.util.Scanner;

public class Area_circulo {

    public static void main(String[] args) {
        double r; // raio
        double A; // área
         
        Scanner input = new Scanner(System.in);
        
        System.out.println("Qual o raio do círculo?");
        r = input.nextDouble();
        
        A = ( 3.14 * Math.pow(r,2)); // calcula a área
        
        System.out.println("A área do círculo é "+ A);
    }
    
}
