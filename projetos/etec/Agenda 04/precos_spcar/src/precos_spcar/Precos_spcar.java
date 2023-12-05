//Programa que calcula o preço de locação de veiculos
package precos_spcar;

import java.util.Scanner;

public class Precos_spcar {

    public static void main(String[] args) {
        String modelo; // modelo do carro
        float diaria; // valor da diaria
        int dias_locacao; // dias de locação
        float km; // km rodados
        float val_km = 0.2F; // valor por KM
        float total; //total a pagar
        Scanner input = new Scanner(System.in);

        System.out.println("Este programa calcula o preço total da locação de veículos.");

        System.out.println("Qual o modelo do carro?"); // pergunta o modelo do carro
        modelo = input.nextLine(); // recebe o modelo do carro
        System.out.println("Qual o valor da diária(R$)?"); // pergunta o valor da diária
        diaria = input.nextFloat(); // recebe o valor da diária em R$
        System.out.println("Quantos foram os dias de locação?"); // pergunta o tempo que o carro ficou alugado
        dias_locacao = input.nextInt(); // recebe o valor de dias de locação
        System.out.println("Quantos KM foram percorridos?"); // pergunta quantos KM foram percorridos
        km = input.nextFloat(); // recebe quantos KM foram percorridos

        total = (diaria * dias_locacao) + (km * val_km); // calcula o total

        System.out.println("Modelo do carro: " + modelo); // exibe na tela o modelo do carro
        System.out.println("O total a pagar será R$" + total); // exibe o total a se pagar
    }

}
