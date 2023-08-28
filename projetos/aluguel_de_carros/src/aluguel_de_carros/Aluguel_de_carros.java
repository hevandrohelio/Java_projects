package aluguel_de_carros;

import java.util.Scanner;

public class Aluguel_de_carros {

    public static void main(String[] args) {
        String modelo; // modelo do carro
        float diaria; // valor da diaria
        int dias_locacao; // dias de locação
        float km; // km rodados
        float val_km = 0.2F; // valor por KM
        float total; //total a pagar
        Scanner input = new Scanner(System.in);

        System.out.println("Qual o modelo do carro?");
        modelo = input.nextLine();
        System.out.println("Qual o valor da diária(R$)?");
        diaria = input.nextFloat();
        System.out.println("Quantos foram os dias de locação?");
        dias_locacao = input.nextInt();
        System.out.println("Quantos KM foram percorridos?");
        km = input.nextFloat();

        total = (diaria * dias_locacao) + (km * val_km); //calcula o total

        System.out.println("Modelo do carro: " + modelo);
        System.out.println("O total a pagar será R$" + total);
    }

}
