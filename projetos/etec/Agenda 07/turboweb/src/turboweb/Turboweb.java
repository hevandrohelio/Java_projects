package turboweb;

import javax.swing.JOptionPane;
public class Turboweb {

    public static void main(String[] args) {
        String[] options = {"Excelente", "Bom", "Ruim"}; // lista com as opções de escolha
        int resp_ex = 0; // contador de respostas excelentes
        int resp_b = 0; // contador de respostas boas
        int resp_r = 0; // contador de respostas ruins
       
        
        
        for (int i = 0; i < 10; i++) {
            JOptionPane.showMessageDialog(null, "Pesquisa de satisfação TurboWeb"); // Mensagem inicial
            JOptionPane.showInputDialog("Nome:"); // pergunta nome
            JOptionPane.showInputDialog("Idade: "); // pergunta idade
            int x = JOptionPane.showOptionDialog(null, "Como você avalia nossa empresa?",
                    "Opções", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE, null,
                    options, options[0]); // pergunta a avaliação da pessoa quanto a empresa
            
            // se a resposta for "excelente"
            if (x == 0) {
                resp_ex += 1; // adiciona 1 ao contador de respostas excelentes
            }
            // se a resposta for "bom"
            if (x == 1) {
                resp_b += 1; // adiciona 1 ao contador de respostas boas
            }
            // se a resposta for "ruim"
            if (x == 2){
                resp_r +=1; // adiciona 1 ao contador de respostas ruins
            }
            x = 0; // zera as opções
        }
        
        // exibe os dados da pesquisa
        JOptionPane.showMessageDialog(null, "Dados da pesquisa:\n"
                + "Excelente: " + resp_ex +
                "\n Bom: " + resp_b +
                "\n Ruim" + resp_r);
    }
    
}
