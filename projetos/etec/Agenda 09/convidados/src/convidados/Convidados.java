package convidados;

import javax.swing.JOptionPane;

public class Convidados {

    public static void main(String[] args) {
        String[] convidados = new String[10];
        String esq = "";
        String dir = "";
        int i;

        for (i = 0; i < 10; i++) {
            convidados[i] = JOptionPane.showInputDialog("Nome do" + (i + 1) + "º convidado:");

        }
        esq = "Lado esquerdo do salão";
        dir = "Lado direito do salão";

        for (i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                esq += convidados[i] + "\n";
            } else {
                dir += convidados[i] + "\n";
            }
        }
        JOptionPane.showMessageDialog(null, esq + "\n" + dir);

    }

}
