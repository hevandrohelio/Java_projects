package area_quadrado_paralelogramo_retangulo;

import java.util.Scanner;

public class Area_quadrado_paralelogramo_retangulo {
    public static void main(String[] args) {
        float b; // base
        float h; // altura
        float a; // área
        Scanner input = new Scanner(System.in);
        
        System.out.println("Base do quadrilátero:");
        b = input.nextFloat();
        System.out.println("Altura do quadrilátero:");
        h = input.nextFloat();
        
        a = (float) b*h; // calcula a área
        
        System.out.println("A área do quadrilátero é: " + a);
    }
    
}
