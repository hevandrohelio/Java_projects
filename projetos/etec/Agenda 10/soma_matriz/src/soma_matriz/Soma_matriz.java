package soma_matriz;

import javax.swing.JOptionPane;

public class Soma_matriz {

    public static void main(String[] args) {
        int notas[][] = new int[5][5];
        int linha, coluna;
        int soma = 0;
        String input_message = "Entre a nota do com o elemento [%d][%d] da matriz";
        String exibir = "";
        String output_mesage = "Matriz:\n %s \nSoma: %d";

        JOptionPane.showMessageDialog(null, "Inserindo dados na Matriz");
        try {
            //entrada de dados
            for (linha = 0; linha < 5; linha++) {
                for (coluna = 0; coluna < 5; coluna++) {
                    notas[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog(String.format(input_message, (linha + 1), (coluna + 1))));
                }
            }
            //soma
            for (linha = 0; linha < 5; linha++) {
                for (coluna = 0; coluna < 5; coluna++) {
                    soma += notas[linha][coluna];
                }
            }
            // gera a matriz
            for (linha = 0; linha < 5; linha++) {
                for (coluna = 0; coluna < 5; coluna++) {
                    exibir += notas[linha][coluna] + "|";
                }
                exibir += "\n";
            }
            // exibe a soma e a matriz
            JOptionPane.showMessageDialog(null, String.format(output_mesage, exibir, soma));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERRO", "ERRO", JOptionPane.ERROR_MESSAGE);
        }

    }

}
