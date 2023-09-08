package idade_em_fila_de_espera;

import javax.swing.JOptionPane;

public class Idade_em_fila_de_espera {

    public static void main(String[] args) {
        String idade_aux; //variavel auxiliar de idade
        String nome; // nome
        int idade; //idade

        JOptionPane.showMessageDialog(null, "Programa que mostra prioridade na fila");

        nome = JOptionPane.showInputDialog("Nome: ");
        idade_aux = JOptionPane.showInputDialog("Idade: ");
        idade = Integer.parseInt(idade_aux); // idade recebe a string idade_aux e converte para int

        //se a idade estiver entre 60 e 79
        if (idade >= 60 && idade < 80) {
            JOptionPane.showMessageDialog(null, idade + " anos\n" + nome + " tem prioridade na fila");
            System.out.println(idade + " anos\n" + nome + " tem prioridade na fila");
            // se a idade for igual ou maior que 80
        } else if (idade >= 80) {
            JOptionPane.showMessageDialog(null, idade + " anos\n" + nome + " tem prioridade exclusiva na fila");
            System.out.println(idade + " anos\n" + nome + " tem prioridade exclusiva na fila");

        } else {
            JOptionPane.showMessageDialog(null, idade + " anos\n" + nome + " não tem prioridade na fila.");
            System.out.println(idade + " anos\n" + nome + " não tem prioridade na fila.");
        }
    }

}
