package caixa_supermercado;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Caixa_supermercado {
    
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        ArrayList<String> precos = new ArrayList<>();
        double preco;
        String produto;
        String preco_produto;
        double total = 0;
        String message = "Produtos:\n%s\nPreços:\n%s\nTotal: R$ %.2f";
        
        OUTER:
        while (true) {
            produto = JOptionPane.showInputDialog("Digite o nome do produto:");
            lista.add(produto + "\n");
            preco_produto = JOptionPane.showInputDialog("Digite o preço do produto:");
            precos.add("R$"+preco_produto + "\n");
            preco = Double.parseDouble(preco_produto);
            total += preco;
            int x = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
            switch (x) {
                case 0:
                    break;
                case 1:
                    break OUTER;
                case 2:
                    break OUTER;
                default:
                    System.out.println("UM ERRO INESPERADO OCORREU!");
                    System.exit(0);
            }
        }
        JOptionPane.showMessageDialog(null, String.format(message, lista, precos, total));
    }
    
}
